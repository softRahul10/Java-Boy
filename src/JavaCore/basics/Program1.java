package JavaCore.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
    public static void main(String[] args) throws IOException {
        // Input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userName;
        System.out.println("Your name: ");
        userName = reader.readLine();
        reader.close();
        System.out.println("Hi, " + userName);
    }
}
