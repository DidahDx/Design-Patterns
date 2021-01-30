package CreationPatterns.SingletonPattern;

public class DbSingleton {

    //used volatile to make the singleton thread safe
    private static volatile DbSingleton instance=null;

    private DbSingleton(){
        //used to prevent calling the constructor using reflection throw an error
        if (instance!=null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance(){
        //lazy loaded (only created when need)
        if (instance==null){
            synchronized (DbSingleton.class){
                if (instance==null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
