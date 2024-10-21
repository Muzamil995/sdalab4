package EventManagerObserver;



public class SMSSupportListener implements EventListener {
    private String phoneNumber;

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, String message) {
        if (message.length() > 160) {
            System.out.println("Warning: SMS exceeds 160 characters. Please define a valid SMS.");
        } else {
            System.out.println("SMS sent to " + phoneNumber + ": " + message);
        }
    }
}
