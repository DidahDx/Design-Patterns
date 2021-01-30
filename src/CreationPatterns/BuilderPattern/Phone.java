package CreationPatterns.BuilderPattern;

/**
 * This example make a builder pattern which in immutable
 *  with values
 * */
public class Phone {

    public static class PhoneBuilder {
        private String os="Android";
        private String ram="3GB";
        private String processor="MediaTek";
        private String screenSize="6.0\"";
        private String battery="3000 mAh";
        private String frontCamera="5MP";
        private String backCamera="13MP";

        public PhoneBuilder(){

        }

        public Phone buildPhone(){
            return new Phone(this);
        }

        public PhoneBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public PhoneBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public PhoneBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public PhoneBuilder setScreenSize(String screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public PhoneBuilder setBattery(String battery) {
            this.battery = battery;
            return this;
        }

        public PhoneBuilder setFrontCamera(String frontCamera) {
            this.frontCamera = frontCamera;
            return this;
        }

        public PhoneBuilder setBackCamera(String backCamera) {
            this.backCamera = backCamera;
            return this;
        }
    }


    private final String os;
    private final String ram;
    private final String processor;
    private final String screenSize;
    private final String battery;
    private final String frontCamera;
    private final String backCamera;

    public Phone(PhoneBuilder builder) {
        this.backCamera=builder.backCamera;
        this.frontCamera=builder.frontCamera;
        this.processor=builder.processor;
        this.os=builder.os;
        this.battery=builder.battery;
        this.ram= builder.ram;
        this.screenSize= builder.screenSize;
    }

    public String getOs() {
        return os;
    }

    public String getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getBattery() {
        return battery;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public String getBackCamera() {
        return backCamera;
    }

    @Override
    public String toString() {
        return String.format("Phone Specification \nOS %s \nRam %s \nProcessor %s \nScreenSize %s " +
                "\nBattery %s \nFront Camera %s \nBack Camera %s",
                os,ram,processor,screenSize,battery,frontCamera,backCamera);
    }
}
