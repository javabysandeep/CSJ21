package oops.abstraction;

public class MessageServiceApp {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("Hello");
    }
}
