package oops.classComponents;

class Student {
    int studentId;
    String studentName;
    static String CollegeName = "Pune university";

    void registerStudent(){
        System.out.println("Student registration");
    }
    static void print(){
        System.out.println("Printing something");
    }
}