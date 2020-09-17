package fasade;

class DeliveryBoxSystem {
     void sendNotification(){
        System.out.println("text message sent to the client");
    }
     boolean idPaymentSecuried(){
        System.out.println("Payment has been secured.");
        return true;
    }
    boolean isUserDataValidated(){
        System.out.println("User data has been validated ");
        return true;
    }
    void scheduleDelivery(){
        System.out.println("Delivery has been schedule.");
    }
}
