package controlStatements.ifElseDemo;

public class PrintMonthName {
    public static void main(String[] args) {
        int monthNUmber = 12;
        if(monthNUmber==1){
            System.out.println("Jan");
        } else if(monthNUmber==2){
            System.out.println("Feb");
        } else if(monthNUmber > 12 && monthNUmber < 1){
            System.out.println("invalid");
        }
    }
}
