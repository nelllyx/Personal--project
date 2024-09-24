public class TestStaticMethod {

    public static void main(String... args) {
        Student.change();
        Student one = new Student(111, "Karan");
        Student two = new Student(222, "Ayran");
        Student three = new Student(333, "Sonoo");

        one.display();
        two.display();
        three.display();
    }
}
