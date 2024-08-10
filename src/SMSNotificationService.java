
// Liskov Substitution: We can easily replace EmailNotificationService with another implementation without altering the program.
class SMSNotificationService implements NotificationService {
    @Override
    public void notify(Member member, String message) {
        System.out.println("SMS sent to " + member.getName() + ": " + message);
    }
}