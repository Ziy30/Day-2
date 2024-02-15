package lesson7.ABSTRACT_INTERFACE.ASSIG8;

public interface PaymentGateway {

    void processPayment(double amount);
    boolean isPaymentSuccessful();
}
