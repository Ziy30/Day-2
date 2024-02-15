package lesson7.ABSTRACT_INTERFACE.ASSIG9;

public class Main9 {
    public static void main(String[] args) {
        // Create instances of EmailSender and SMSSender
        EmailSender emailSender = new EmailSender();
        SMSSender smsSender = new SMSSender();

        // Send messages using both senders
        emailSender.sendMessage("Hello, this is an email message.");
        smsSender.sendMessage("Hi, this is an SMS message.");
    }
}
