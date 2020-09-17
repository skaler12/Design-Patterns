package fasade;

public class DeliveryBoxFasade {
    private DeliveryBox deliveryBox;
    private  DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFasade(){
        deliveryBox=new DeliveryBox();
        deliveryBoxSystem = new DeliveryBoxSystem();
    }
    public void pickupPackage(){

        deliveryBox.getUserData();
        if(deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.idPaymentSecuried()){
            deliveryBox.openBox();
        }
    }
}
