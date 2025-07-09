import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String name;
        String country;
        String city;
        String street;
        Scanner myobj=new Scanner(System.in);
        name=myobj.nextLine();
        country=myobj.nextLine();
        city=myobj.nextLine();
        street=myobj.nextLine();
        System.out.println("Name:"+name);
        System.out.println("country:"+country);
        System.out.println("city:"+city);
        System.out.println("street:"+street);
    }
}