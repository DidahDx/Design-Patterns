package CreationPatterns.BuilderPattern;

public class BuilderLunchMethod {

    public static void main(String[] args) {
        LunchOrder lunchOrder = new LunchOrder.LunchOrderBuilder()
                .setBread("Brown Wheat")
                .setMeat("Pork")
                .makeLunch();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiment());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
        System.out.println("");

        Phone dxPhone=new Phone.PhoneBuilder()
                .setRam("6GB")
                .setProcessor("Qualcomm Snapdragon 870")
                .setBattery("8000 mAh")
                .setBackCamera("30MP")
                .setFrontCamera("30MP")
                .buildPhone();

        System.out.println(dxPhone);
    }
}
