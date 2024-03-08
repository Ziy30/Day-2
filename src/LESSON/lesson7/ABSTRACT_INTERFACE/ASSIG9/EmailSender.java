package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG9;

public class EmailSender implements MessageSender{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
    
}
