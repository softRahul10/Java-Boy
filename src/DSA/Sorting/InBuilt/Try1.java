package DSA.Sorting.InBuilt;

import java.util.Arrays;
import java.util.Comparator;

public class Try1 {
    public static void main(String[] args) {
        User[] userData = new User[4];
        userData[0] = new User("Rahul",40);
        userData[1] = new User("Gautam",24);
        userData[2] = new User("Aakash",10);
        userData[3] = new User("Prithvi",30);

        System.out.println("User Data without Sorting");
        for(int i=0; i < userData.length; i++) {
            System.out.print(userData[i].toString());
        }

        System.out.println("User Data After Sorting ");
        Arrays.sort(userData);
        for(int i=0; i < userData.length; i++) {
            System.out.print(userData[i].toString());
        }

    }
}

class User implements Comparable<User> {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* Print Method */
    @Override
    public String toString() {
        return " { " + name + "(" + age + ")" + " } ";
    }

    /* Comparsion Method */
    @Override
    public int compareTo(User obj) {
        if(this.age > obj.age) {
            return 1;
        }else if(this.age < obj.age) {
            return -1;
        }else{
            return 0;
        }
    }
}


