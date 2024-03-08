package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG9;

public class SMSSender implements MessageSender {
    public void sendMessage(String message) {
        // Implement logic to send an SMS with the message
        System.out.println("Sending SMS: " + message);
    }
}
