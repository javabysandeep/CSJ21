package oops.inheritance;

public class Parent {
    public String lastName;
    public int gold;
    public int silver;
    private int platinum;
    public int diamond;
    public int plots;
    public int cash;

    public Parent(String lastName, int gold,
                  int silver, int platinum,
                  int diamond, int plots,
                  int cash) {
        this.lastName = lastName;
        this.gold = gold;
        this.silver = silver;
        this.platinum = platinum;
        this.diamond = diamond;
        this.plots = plots;
        this.cash = cash;
    }

    public Parent() {
    }
}
