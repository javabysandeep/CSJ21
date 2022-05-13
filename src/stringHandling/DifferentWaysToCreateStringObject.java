package stringHandling;

public class DifferentWaysToCreateStringObject {
    public static void main(String[] args) {
        // using new keyword way
        // with new keyword, objects are stored in HEAP memory area.
        String string = new String("new keyword way");

        //this only possible string objects
        // In literal way, string objects are not stored in the HEAP memory area.
        // These objects are stored in special memory area called as String Constant Pool method area.
        // SCP, before Java 1.7 it was part of class memory area
        // from Java 1.7 onwards, SCP is present the HEAP memory area.
        // SCP area contains only string objects. No other object is allowed.
        String literal = "literal way of object creation";
    }
}
