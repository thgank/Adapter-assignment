public class ChargerAdapter implements MultiCharger{
    private TypeCCharger androidCharger;
    private LightningCharger appleDevice;
    private String device;

    public ChargerAdapter(String device){
        this.device = device;
        this.androidCharger = new TypeCCharger();
        this.appleDevice = new LightningCharger();
    }

    @Override
    public void charge(){
        if(device.equalsIgnoreCase("android")){
            androidCharger.chargeWithTypeC();
        } else if(device.equalsIgnoreCase("apple")){
            appleDevice.chargeWithLightning();
        } else {
            System.out.println("unsupported device: " + device);
        }
    }
}
