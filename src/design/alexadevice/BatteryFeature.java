package design.alexadevice;

public interface BatteryFeature {
    boolean hasBattery();
    boolean isCharging();
    int getBatteryPercentage();
}
