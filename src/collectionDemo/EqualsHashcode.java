package collectionDemo;

public class EqualsHashcode {
    public static void main(String[] args) {
        Prod p1 = new Prod();
        Prod p2 = new Prod();
        Prod p3 = p2;
        System.out.println(p1 == p2);//false
        System.out.println(p1.equals(p2));//false
        System.out.println("p1 hashcode "+ p1.hashCode());
        System.out.println("p2 hashcode "+ p2.hashCode());

        System.out.println(p3.equals(p2));
        System.out.println("p3 hashcode "+ p3.hashCode());

    }
}

class Prod {
}
