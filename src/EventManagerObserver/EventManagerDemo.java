package EventManagerObserver;


public class EventManagerDemo {
    public static void main(String[] args) {
        // Create event manager with SMS and EMAIL events
        EventManager eventManager = new EventManager("SMS", "EMAIL");

        // Add listeners for SMS and EMAIL
        SMSSupportListener smsListener = new SMSSupportListener("123-456-7890");
        EmailNotificationListener emailListener = new EmailNotificationListener("test@example.com");

        // Subscribe listeners to events
        eventManager.subscribe("SMS", smsListener);
        eventManager.subscribe("EMAIL", emailListener);

        // Test the notifications

        // Sending valid SMS
        System.out.println("Sending valid SMS:");
        eventManager.notify("SMS", "This is a short SMS.");

        // Sending SMS with length more than 160 characters
        System.out.println("\nSending SMS with long text:");
        eventManager.notify("SMS", "This is a very long SMS message. ".repeat(10));

        // Sending Email
        System.out.println("\nSending email:");
        eventManager.notify("EMAIL", "You've received a new email!");
    }
}
