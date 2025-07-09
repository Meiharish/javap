import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int age;
        System.out.println("enter your age:");
        age=obj.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}