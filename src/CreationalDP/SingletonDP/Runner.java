package CreationalDP.SingletonDP;

public class Runner {
    public static void main(String[] args) {
        SingletonObject obj1= new SingletonObject();
        SingletonObject obj2= new SingletonObject();

        System.out.println(obj1 == obj2); // False . Her iksii de farkli objeler. Referanslari farkli.
    }
}
