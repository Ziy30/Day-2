package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG8;

public class PayPal implements PaymentGateway {
    private boolean paymentSuccessful;

    public void processPayment(double amount) {
        // Implement PayPal payment processing logic
        // For demonstration purposes, let's assume the payment is successful 70% of the time
        if (Math.random() < 0.7) {
            paymentSuccessful = true;
        } else {
            paymentSuccessful = false;
        }
    }

    public boolean isPaymentSuccessful() {
        return paymentSuccessful;
    }
}
