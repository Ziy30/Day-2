package lesson7.ABSTRACT_INTERFACE.ASSIG8;

public class Main8 {
    public static void main(String[] args) {
        // Create instances of PayPal and Stripe
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();

        // Process payments through PayPal and Stripe
        payPal.processPayment(100.0);
        stripe.processPayment(150.0);

        // Check payment status for PayPal and Stripe
        System.out.println("PayPal payment status: " + (payPal.isPaymentSuccessful() ? "Success" : "Failure"));
        System.out.println("Stripe payment status: " + (stripe.isPaymentSuccessful() ? "Success" : "Failure"));
    }
}
