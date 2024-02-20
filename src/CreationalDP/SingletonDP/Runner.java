package CreationalDP.SingletonDP;

public class Runner {
    public static void main(String[] args) {
      //  SingletonObject obj1= new SingletonObject();
      //  SingletonObject obj2= new SingletonObject();
      //  System.out.println(obj1 == obj2); // False . Her iksii de farkli objeler. Referanslari farkli.

        //******************SINGLETON OBJECT DP ********************************
        SingletonObject object3= SingletonObject.getInstance();
        SingletonObject object4= SingletonObject.getInstance();
        System.out.println(object3 == object3); // True cunku Singleton Object olusturuldu. Instance null olmadigi icin
        //tekrar obje uretmek yerine instance degerini yani ilk objeyi tekrar donduruyor. Bu sekilde yeni bir obje
        // olusturulmuyor.

        System.out.println(object3.message);
        System.out.println(object4.message);
        object3.changeMessage();
        object4.changeMessage();
        System.out.println("********************Message set edildi******************");
        System.out.println(object3.message);
        System.out.println(object4.message);

       // SingletonObject object5= new SingletonObject(); // Halen yeni bir obje uretebiliyorum
        //Bunun icin private parametresiz constructor tanimliyorum.  Bu sekilde yeni bir obje uretemiyorum.
    }
}
