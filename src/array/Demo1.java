package array;



public class Demo1 {
    public static void main(String[] args) {
        int rollNumber1 = 1;//4 bytes
        int rollNumber2 = 2; //4 bytes
        int rollNumber3 = 3; // 4 bytes

        Student student = new Student(1,"abc");
        // student ------> obj {rolNo. name, address ..........}

        // with  the help of new keyword, we are creating an object.
        // That object contains 10 variables which are of type int
        int rollNumbers[] = new int[10];
        // rollNumbers{reference to the RHS object} -----> obj {v1, v2, v3,... v10}-->
        // obj --> 100  base address ---> base address + 0*4 --> 100
        // v2 --> base + address + 1* 4 --> 104
        // v3 --> base + address + 2* 4 --> 108
        // v4 --> base + address + 3* 4 --> 108
        // v10 --> base + address + 9* 4 --> 136
        // object elements are stored subsequenct/linear/ sequential to each other
        // Movie --> A, B, C, D, E[4]
        System.out.println(rollNumbers);// this will print the hashcode/ memory address and not the actuals elements

        System.out.println(rollNumbers[0]);//0
        System.out.println(rollNumbers[1]);//0
        System.out.println(rollNumbers[2]);//0
        System.out.println(rollNumbers[3]);//0
        System.out.println(rollNumbers[9]);//0
        //System.out.println(rollNumbers[10]);//ArrayIndexOutOfBoundException

        Student s1 = new Student(1,"abc");
        Student s2 = new Student(2, "xyz");
        Student s3 = new Student(3,"pqr");
        Student s4 = new Student(4, "wxyz");

        Student students[] = new Student[10];
        //rollNumbers ---> {0,0,0,0,0,0,0,0,0,0}
        //students --- > {ref1, ref2, ref3, ref4, ref5, ref6, ref7, ref8, ref9, ref10}
        //                  |   |      |    |       |    |
        //                s1    s2    s3    s4      null

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        System.out.println(students);//students base address
        System.out.println(students[0]);
        System.out.println(students[1]);

        // students ----> object[ref1, ref2, ref3, ref4,  ref10]




    }
    static class Student{
        int rollNumber;
        String name;

        public Student(int rollNumber, String name) {
            this.rollNumber = rollNumber;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNumber=" + rollNumber +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}