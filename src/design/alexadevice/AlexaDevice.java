package design.alexadevice;

public abstract class AlexaDevice implements Device{
    protected BatteryFeature bf;
    protected String deviceType;

    public AlexaDevice(BatteryFeature bf, String deviceType){
        this.bf = bf;
        this.deviceType = deviceType;
    }

    @Override
    public void show(){
        if(bf.hasBattery()){
            if(bf.isCharging()){
                System.out.println("DeviceType: " + deviceType + "," + "BatteryPercentage" + ":" + bf.getBatteryPercentage() + ", Charging");
            }
            else{
                System.out.println("DeviceType: " + deviceType + "," + "BatteryPercentage" + ":" + bf.getBatteryPercentage() + ", Not Charging");
            }
        }
        else{
            if(bf.isCharging()){
                System.out.println("DeviceType: " + deviceType + "," + ", Charging");
            }
            else{
                System.out.println("DeviceType: " + deviceType + ", Not Charging");
            }
        }
    }
}
