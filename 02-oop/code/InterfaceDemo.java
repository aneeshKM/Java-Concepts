interface Payment {

    // Interface method is implicitly public abstract
    void pay(double amount);

    // Default methods contain implementation
    default void printReceipt() {
        System.out.println("Receipt generated");
    }

    // Static methods belong to the interface itself
    static void paymentInfo() {
        System.out.println("Payment interface");
    }
}

class CreditCardPayment implements Payment {

    // Must be public because interface method is public
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using credit card");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Payment payment = new CreditCardPayment();

        // Implemented method
        payment.pay(100);

        // Inherited default method
        payment.printReceipt();

        // Static interface method called using interface name
        Payment.paymentInfo();
    }
}