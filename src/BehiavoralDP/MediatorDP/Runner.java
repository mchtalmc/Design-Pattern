package BehiavoralDP.MediatorDP;

public class Runner {
    public static void main(String[] args) {
        MessageDispatcher messageDispatcher= new MessageDispatcher();


        Actor actor1= new Prof("Prof1", messageDispatcher);
        Actor actor2= new Prof("Prof2", messageDispatcher);
        Actor actor3= new Prof("Prof3", messageDispatcher);

        messageDispatcher.registerActor(actor1,"Math");
        messageDispatcher.registerActor(actor2,"Java");
        messageDispatcher.registerActor(actor3,"Spring");

        System.out.println("ACTOR 1 ");
        actor1.sendMessage("Math", "Selam nasilsiniz");
        actor1.sendMessage("Java", "Yazilim ogrenmek icin Math lazim mi ?");

        System.out.println("ACTOR2");
        actor2.sendMessage("Java" , "Advanced Java bilgisi onemli mi ?");

    }
}
