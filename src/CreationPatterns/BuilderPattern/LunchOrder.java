package CreationPatterns.BuilderPattern;

/**
 * This example make a builder pattern which in immutable
 *  without any default values
 * */
public class LunchOrder {

    public static class LunchOrderBuilder {
        private String bread;
        private String meat;
        private String dressing;
        private String condiment;

        public LunchOrderBuilder(){
        }

        //
        public LunchOrder makeLunch(){
            return new LunchOrder(this);
        }

        public LunchOrderBuilder setBread(String bread){
            this.bread=bread;
            return this;
        }

        public LunchOrderBuilder setMeat(String meat){
            this.meat=meat;
            return this;
        }

        public LunchOrderBuilder setDressing(String dressing){
            this.dressing=dressing;
            return this;
        }


        public LunchOrderBuilder setCondiments(String condiment){
            this.condiment=condiment;
            return this;
        }
    }


    private final String bread;
    private final String meat;
    private final String dressing;
    private final String condiment;

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getDressing() {
        return dressing;
    }

    public String getCondiment() {
        return condiment;
    }

    public LunchOrder(LunchOrderBuilder builder){
        this.bread= builder.bread;
        this.meat=builder.meat;
        this.condiment=builder.condiment;
        this.dressing=builder.dressing;
    }

}
