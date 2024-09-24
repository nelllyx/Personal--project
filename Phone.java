//Java program to to demonstrate the use of an instance variable
//which get memory each time when we create an object of the class

import java.util.Scanner;

public class Phone {

    int count = 0; //will get memory each time when the instance is created

    Phone() {
        count++;
        System.out.println(count);
    }

    public static void main(String... args) {
        Phone c1 = new Phone();
        Phone c2 = new Phone();
        Phone c3 = new Phone();
    }
}
