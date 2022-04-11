package oops;

public class Feature {
    public Feature() {
        System.out.println("con");
    }

    {
        System.out.println("instance block1");
    }

    {
        System.out.println("instance block2");
    }

    {
        System.out.println("instance block3");
    }

    static {
        System.out.println("static block1");
    }

    static {
        System.out.println("static block2");
    }

    static {
        System.out.println("static block3");
    }

    public static void main(String[] args) {
        Feature feature = new Feature();
        Feature feature2 = new Feature();
    }
}
