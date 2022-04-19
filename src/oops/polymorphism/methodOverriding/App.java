package oops.polymorphism.methodOverriding;

public class App {
    public static void main(String[] args) {
        MessageServiceImpl messageServiceImpl = new MessageServiceImpl();
        messageServiceImpl.sendMessage("");
        System.out.println(messageServiceImpl.counter);//200

        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("");//child class method--> overridden method
        System.out.println(messageService.counter);//100

        //call will be given to the overridden method.
        messageService.receiveMessage();
    }
}
