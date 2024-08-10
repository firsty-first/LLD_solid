
// Main class to demonstrate the Library Management System
public class Main {
    public static void main(String[] args) {
        // Create a notification service (we can switch to SMSNotificationService here without changing Library)
        NotificationService notificationService = new EmailNotificationService();
        /*
        Notice that here we have object of type Interface we can do that as class implements ALLLLL the method mentioned in interface

        * An interface in Java defines a contract or set of methods that a class must implement. It does not provide any implementation itself.
You can use an interface type as a reference to an object of any class that implements that interface. This allows you to program against the interface rather than the specific implementation.
        * */
     //   NotificationService notificationService = new SMSNotificationService();

        // Create a library with the notification service
        Library library = new Library(notificationService);

        // Add books to the library
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        // Register members
        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");
        library.registerMember(member1);
        library.registerMember(member2);

        // Loan and return books
        library.loanBook(book1, member1);
        library.returnBook(book1, member1);

        // List available books
        for (Book book : library.getAvailableBooks()) {
            System.out.println("Available book: " + book.getTitle());
        }
    }
}
