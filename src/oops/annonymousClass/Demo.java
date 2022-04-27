package oops.annonymousClass;

public class Demo {
    public static void main(String[] args) {
        //way 1
        //MessageService messageService1 = new Impl();

        //way 2

        MessageService messageService = new MessageService() {
            @Override
            public void sendMessage() {
                System.out.println("impleneting with annonymous class");
            }

            @Override
            public void receiveMessage() {
                System.out.println("receiving message");
            }
        };
        messageService.sendMessage();
        messageService.receiveMessage();

        // way 3
       /* MessageService  messageService1 = ()->{
            System.out.println("lambda way");
        };*/
        //messageService1.sendMessage();


    }
}

class Impl implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sending message");
    }

    @Override
    public void receiveMessage() {
        System.out.println("received message");
    }
}
