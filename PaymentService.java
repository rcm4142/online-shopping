public class PaymentService {
    public boolean processPayment(String orderId, double amount) {       
          System.out.println("Processing payment for Order: " + orderId);
          System.out.println("Amount: " + amount);       
          return true;  
    }
}
