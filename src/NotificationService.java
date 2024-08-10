// Interface Segregation and Dependency Inversion: NotificationService is an abstraction that can have multiple implementations.
interface NotificationService {
    void notify(Member member, String message);
}