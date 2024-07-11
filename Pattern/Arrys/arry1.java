
import java.util.*;

import java.util.Scanner;

public class arry1 {
    public static void main(String[] args) {
        // kitni value store karni he to aise likhe
        // int marks[]=new int[50];
        // int number[]={1,2,3};
        // String fruits[]={"satyam","tanu","Bindu"};
        // System.out.println(fruits);
        // System.out.println(fruits);
        // System.out.println(number);

        int marks[]= new int[20];
    Scanner Sc= new Scanner(System.in);
    marks[0]=Sc.nextInt();
    marks[1]=Sc.nextInt();
    marks[2]=Sc.nextInt();
    System.out.println("Phy Marks"+marks[0]);
    System.out.println("Math Marks"+marks[1]);
    System.out.println("Cemi"+marks[2]);
    System.out.println("Parcentage "+(marks[0]+marks[1]+marks[2])/3);
    System.out.println("Marks Lenght"+marks.length);

        
    }
    
}
