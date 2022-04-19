package oops.polymorphism.methodOverriding;

public class MessageService {
    int counter=100;
    protected void sendMessage(String message){
        System.out.println("sending message with SMS");
    }
    void receiveMessage(){
        System.out.println("receiving message with sms");
    }
}
