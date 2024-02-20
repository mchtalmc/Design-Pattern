package CreationalDP.SingletonDP;

public class SingletonObject {

    public String message ="Create Singleton Object ?";


    //Singleton DP
    private static SingletonObject instance; // Default degeri NULL.

    public static SingletonObject getInstance(){
        if (instance==null){
            instance= new SingletonObject();
        }
        return instance;
    }
}
