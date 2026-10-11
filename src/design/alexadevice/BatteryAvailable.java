package design.alexadevice;

public class BatteryAvailable implements BatteryFeature{
    private int batteryPercentage;
    private boolean charging;

    public BatteryAvailable(int percentage,boolean charging){
        this.batteryPercentage = percentage;
        this.charging = charging;
    }

    @Override
    public boolean hasBattery() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCharging() {
        // TODO Auto-generated method stub
        return charging;
    }

    @Override
    public int getBatteryPercentage() {
        // TODO Auto-generated method stub
        return batteryPercentage;
    }

}
