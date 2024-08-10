import java.util.ArrayList;
import java.util.List;

// Single Responsibility: Member class has only one responsibility - to represent a library member.
class Member {
    private String name;
    private List<Loan> loans;

    public Member(String name) {
        this.name = name;
        this.loans = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        Loan loan = new Loan(book, this);
        loans.add(loan);
        book.setAvailable(false);
    }

    public void returnBook(Book book) {
        for (Loan loan : loans) {
            if (loan.getBook().equals(book)) {
                loans.remove(loan);
                book.setAvailable(true);
                break;
            }
        }
    }

    public List<Loan> getLoans() {
        return loans;
    }
}