package exceptionHandling;

import java.util.Scanner;

public class VotingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age");
        int age = scanner.nextInt();
        if(age < 18){
            throw new InvalidAgeException("Underage");
        } else{
            System.out.println("You are eligible for vote");
        }
    }
}
