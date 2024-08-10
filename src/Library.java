import java.util.ArrayList;
import java.util.List;

// Open/Closed: Library class can be extended without modifying its core functionality.
class Library {
    private List<Book> books;
    private List<Member> members;
    private NotificationService notificationService;

    public Library(NotificationService notificationService) {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.notificationService = notificationService;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void loanBook(Book book, Member member) {
        if (book.isAvailable()) {
            member.borrowBook(book);
            notificationService.notify(member, "You have successfully borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book, Member member) {
        member.returnBook(book);
        notificationService.notify(member, "You have successfully returned the book: " + book.getTitle());
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}