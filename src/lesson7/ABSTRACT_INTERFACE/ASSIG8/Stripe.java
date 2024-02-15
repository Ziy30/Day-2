package lesson7.ABSTRACT_INTERFACE.ASSIG8;

class Stripe implements PaymentGateway {
    private boolean paymentSuccessful;

    public void processPayment(double amount) {
        // Implement Stripe payment processing logic
        // For demonstration purposes, let's assume the payment is successful 80% of the time
        if (Math.random() < 0.8) {
            paymentSuccessful = true;
        } else {
            paymentSuccessful = false;
        }
    }

    public boolean isPaymentSuccessful() {
        return paymentSuccessful;
    }
}

