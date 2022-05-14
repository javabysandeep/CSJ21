package annonymoous;

public class EqualsHashCode {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Anjali");
        Student student2 = new Student(1, "Anjali");
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
