package oops.inheritance;

public class Child extends Parent {
    String firstName;

    public Child(String firstName) {
        this.firstName = firstName;
    }

    public Child() {
        System.out.println();
    }

    public Child(String lastName, int gold, int silver, int platinum, int diamond, int plots, int cash, String firstName) {
        //super(lastName, gold, silver, platinum, diamond, plots, cash);
        this.firstName = firstName;
    }
}
