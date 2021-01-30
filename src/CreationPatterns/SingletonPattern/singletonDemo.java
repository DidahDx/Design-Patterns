package CreationPatterns.SingletonPattern;

public class singletonDemo {

    public static void main(String[] args) {
        DbSingleton dbSingleton=DbSingleton.getInstance();
        DbSingleton dbSingleton2=DbSingleton.getInstance();

        System.out.println("1 " +dbSingleton);
        System.out.println("2 " +dbSingleton2);
    }
}
