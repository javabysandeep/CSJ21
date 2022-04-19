package oops.polymorphism.methodOverriding;

public class MessageServiceImpl extends MessageService {
    int counter =200;
   @Override
   public void sendMessage(String message) {
        System.out.println("Sending message with whatsapp");
    }

    @Override
    void receiveMessage() {
        //super.receiveMessage();// call to the parent class method
        System.out.println("receiving message with whatsapp");
    }
}
