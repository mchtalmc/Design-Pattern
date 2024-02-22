package BehiavoralDP.MediatorDP;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher{

    //Katilimcilari topic'leri ile kaydetmek istiyorum. Kaydedilirken uzmanlik alaninini katilimci belirleyecek/soyleyecek

    Map<String, Actor> regisActor= new HashMap<>();
    public void registerActor(Actor actor , String topic){
        regisActor.put(topic,actor);
    }


    @Override
    public void dispatch(String topic, String message) {
            //Uzmanligina gore actor'u bulacagim
       Actor actor= regisActor.get(topic);
       if (actor==null){
           System.out.println("Bu topic ile alakali katilimci mevcut degil");
       }else {
           actor.receiveMessage(message); // Mesaj'i actor'e yonlendirdim.
       }


    }
}
