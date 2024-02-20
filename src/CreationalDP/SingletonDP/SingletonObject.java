package CreationalDP.SingletonDP;

public class SingletonObject {

    public String message ="Create Singleton Object ?";

    private SingletonObject() {
    }

    //Singleton DP
    private static SingletonObject instance; // Default degeri NULL.

    public static SingletonObject getInstance(){
        if (instance==null){ // Ilk obje uretmee calisildiginda  instance null olacak
            instance= new SingletonObject();
        }
        //Instance null degilse obje olusturmadan ilk obje tekrar donduruluyor.
        return instance;
    }

    public void changeMessage (){
        this.message+= "Message'ye String concat etmek istiyorum";
    }
}
