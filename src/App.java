import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Chapter2 {
    void milestone1(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    void milestone2(int num){
        Scanner in = new Scanner(System.in);
        //Milestone 2
        System.out.println("Please input a decimal number:");
        double x = in.nextDouble();
        int intHalf = (int)x;
        int y = (int)x; double z = (x - y);
        double decHalf = (100 * z);
        System.out.println ("Answer: " + intHalf);
        System.out.println ("Answer: " + (int)decHalf);
        in.close();
    }
    void milestone3(int num){
        //Milestone 3    
        int i =0;
        int num2 =0;
        String  primeNumbers = "";
        for (i = 1; i <= 100; i++)         
        {             
            int counter=0;    
            for(num2 =i; num2>=1; num2--)
        {
            if(i%num2==0)
            {
                counter = counter + 1;
            }
        }
        if (counter ==2)
        {
            primeNumbers = primeNumbers + i + " ";
        }   
    }       
    System.out.println("Prime numbers from 1 to 100 are :");
    System.out.println(primeNumbers);
}
    void milestone4(double num){
        Scanner in = new Scanner(System.in);
        //Milestone 4
        int num3;
        System.out.print("Enter Amount of Seconds : "); 
        num3 = in.nextInt();
        in.close();
        int day = num3 / (24 * 3600); 
        num3 = num3 % (24 * 3600); 
        int hour = num3 / 3600; 
        num3 %= 3600; 
        int minutes = num3 / 60 ; 
        num3 %= 60; 
        int seconds = num3;
        System.out.println( day + " " + "days " + hour  
                           + " " + "hours " + minutes + " "
                           + "minutes " + seconds + " "
                           + "seconds ");
    }
    public void milestone2(double num2_2) {
    }
    public void milestone3() {
    }
}
public class App {
    static void chapter1milestone1(double num1, double num2) {
        System.out.print("Largest is: ");
        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
    static void chapter1milestone2(double num1, double num2) {
        Scanner in = new Scanner(System.in);
        //Milestone 2
		System.out.println("Average of two numbers is: " + 
		 (num1 + num2) / 2);
         in.close();
    }
    static void chapter1milestone3(double num1, double num2) {
        Scanner in = new Scanner(System.in);
        //Milestone 3
		System.out.print("Enter the radius: ");
      	double radius = in.nextDouble();
		in.close();
		double x = 78.2347;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** CHAPTER 1 MILESTONE 1 **");
        System.out.println("Please enter two numbers:");
        double num1_1a = scanner.nextDouble();
        double num1_1b = scanner.nextDouble();
        chapter1milestone1(num1_1a, num1_1b);

        System.out.println("\n** CHAPTER 1 MILESTONE 2 **");
        System.out.println("Please enter two numbers:");
        double num1_2a = scanner.nextDouble();
        double num1_2b = scanner.nextDouble();
        chapter1milestone2(num1_2a, num1_2b);

        System.out.println("\n** CHAPTER 1 MILESTONE 3 **");
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();
        chapter1milestone3(radius);

        System.out.println("\n** CHAPTER 2 MILESTONE 1 **");
        System.out.println("Enter a Number:");
        int num2_1 = scanner.nextInt();
        milestone1(num2_1);
        Chapter2 chapter2 = new Chapter2();
        chapter2.milestone1(num2_1);

        System.out.println("\n** CHAPTER 2 MILESTONE 2 **");
        System.out.println("Please input a decimal number:");
        double num2_2 = scanner.nextDouble();
        chapter2.milestone2(num2_2);

        System.out.println("\n** CHAPTER 2 MILESTONE 3 **");
        chapter2.milestone3();

        System.out.println("\n** CHAPTER 2 MILESTONE 4 **");
        System.out.println("Enter a number for seconds:");
        int seconds = scanner.nextInt();
        chapter2.milestone4(seconds);

        System.out.println("\n** CHAPTER 3 MILESTONE 1 **");
        Chapter3 chapter3 = new Chapter3();
        System.out.println("Enter two numbers:");
        int num3_1a = scanner.nextInt();
        int num3_1b = scanner.nextInt();
        Chapter3.milestone1(num3_1a, num3_1b);

        System.out.println("\n** CHAPTER 3 MILESTONE 2 **");
        Chapter3.milestone2(scanner);

        System.out.println("\n** CHAPTER 3 MILESTONE 3 **");
        int min = 1;
        int max = 12;
        int randNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randNum1);
        System.out.println(randNum2);
        System.out.println("What is the product of these two numbers?");
        int num3_3 = scanner.nextInt();
        Chapter3.milestone3();
        chapter3.milestone3(randNum1, randNum2, num3_3);
        System.out.println("\n** CHAPTER 3 MILESTONE 4 **");
        Chapter3.milestone4();

        scanner.close();
    }
    private static void chapter1milestone3(double radius) {
    }
    private static void milestone4(int seconds) {
    }
    private static void milestone4() {
    }
    private static void milestone3() {
    }
    private static void milestone2(double num2_2) {
    }
    private static void milestone1(int num2_1) {
    }
}