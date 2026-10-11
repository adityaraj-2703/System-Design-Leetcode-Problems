package design.alexadevice;

public class NoBatery implements BatteryFeature{
    private boolean charging;

    public NoBatery(boolean charging){
        this.charging = charging;
    }

    @Override
    public boolean hasBattery() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isCharging() {
        // TODO Auto-generated method stub
        return charging;
    }

    @Override
    public int getBatteryPercentage() {
        // TODO Auto-generated method stub
        return -1;
    }

}
