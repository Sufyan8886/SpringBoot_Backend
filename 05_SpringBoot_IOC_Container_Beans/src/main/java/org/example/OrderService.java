package org.example;

public class OrderService {

    PaymentService payment;
     public OrderService(PaymentService payment) {
         this.payment = payment;
     }

     public void placeOrder() {
         payment.paymentService();
         System.out.println("order placed.");
     }
}
