package BehiavoralDP.MediatorDP;

public class Prof implements Actor{

    public String name;
    public Dispatcher dispatcher;

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + message +" 'i" +"Cevapliyor");
    }

    @Override // Soruyu yonlendirmek icin dispatcher'a gonderilecek ve dispatcher soruyu
    //prof'a iletecek.
    public void sendMessage(String topic, String message) {
        dispatcher.dispatch(topic,message);

    }
}
