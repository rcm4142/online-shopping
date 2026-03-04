public class OrderService {
    public Order placeOrder(String productId, int quantity) {     
        boolean paymentSuccess =
                paymentService.processPayment(order.getOrderId(), order.getTotalAmount());
        if (paymentSuccess) {
            order.setStatus("PAID");
            System.out.println("Order placed successfully!");
        } else {
            order.setStatus("PAYMENT_FAILED");
            System.out.println("Payment failed!");
        }
        return order;
    }
}
