package Practice;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {


        //Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 7 ;
        StaticPractice sp = new StaticPractice();

         sp.addition(a,b);
        System.out.println("Devision of : "+a +" / "+b+" =");
        StaticPractice.devision(a,b);
        System.out.println("Substaction of : "+a +" - "+b+" =");
        System.out.println(sp.substraction(a,b));



    }
}
