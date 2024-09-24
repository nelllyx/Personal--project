//Java program that demonstrate the use of static method

class Student {

    int rollno;
    String name;
    static String college = "ITS";

    static void change() {
        college = "BBDTI";
    }

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
