package Language.Basics;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your age : ");
        byte age = in.nextByte();
        System.out.println();
        System.out.print("Enter Your Name : ");
        String name = in.nextLine();

        System.out.println("Hi," + name);
        System.out.println("You are "  + age + " years old");
    }
}
