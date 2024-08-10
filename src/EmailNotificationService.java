// Open/Closed: This class is an extension of the NotificationService without modifying the Library class.
class EmailNotificationService implements NotificationService {
    @Override
    public void notify(Member member, String message) {
        System.out.println("Email sent to " + member.getName() + ": " + message);
    }
}