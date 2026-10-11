package design.alexadevice;

public class Client {
    public static void main(String[] args) {
        Device aa = new AudioAlexa(new BatteryAvailable(90, false));


        aa.show();
        

    }

    static class AudioAlexa extends AlexaDevice{

        public AudioAlexa(BatteryFeature bf) {
            super(bf,"AudioAlexa");
            //TODO Auto-generated constructor stub
        }
       
    }

    static class ScreenAlexa extends AlexaDevice{

        public ScreenAlexa(BatteryFeature bf) {
            super(bf,"ScreenAlexa");
            //TODO Auto-generated constructor stub
        }
       
    }

    static class AudioScreenAlexa extends AlexaDevice{

        public AudioScreenAlexa(BatteryFeature bf) {
            super(bf,"AudioScreenAlexa");
            //TODO Auto-generated constructor stub
        }
       
    }

}
