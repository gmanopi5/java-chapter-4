import java.util.Scanner;
    public class Chapter3 {
        // Declare the Chapter 3 Milestone 1 method here
        public static void milestone1(Scanner scanner) {
            int num1, num2;
            Scanner sc = new Scanner(System.in);
            System.out.print("Please type a number: ");
            num1 = sc.nextInt();
            System.out.print("Enter another number: ");
            num2 = sc.nextInt();
            int smallNum = 0;
        int largeNum = 0; 
        boolean isNum1Large = false;
        if (num1 - num2 > 0) 
        {
            smallNum = num2;
            largeNum = num1;
            isNum1Large = true;
        } 
        else 
        {
            smallNum = num1;
            largeNum = num2;
        }
        if (isNum1Large) 
        {
            for (int i = largeNum - 1; i > smallNum; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else 
            {
            for (int i = smallNum + 1; i < largeNum; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
        // Declare the Chapter 3 Milestone 2 method here
        public static void milestone2(Scanner scanner) {
            Scanner sc = new Scanner(System.in);
            int average = 0;
            int counter = 0;
            int sum = 0;
            int num3 = 0;
            num3 = sc.nextInt();
            while (num3 >= 0)
            {
                counter++;
                sum +=num3;
            
                num3 = sc.nextInt();
            }
            if (counter == 0)
                counter = 1;
            average = sum/counter;
            System.out.println("this is the average:" + average);
            sc.close();
        }
    
        public void milestone3(int num1, int num2, int answer) {
            if (num1 * num2 == answer)
                System.out.println("Correct!");
            else
                System.out.println("Incorrect, the answer was " + (num1 * num2));
        }
    
    public static void milestone1() {
    }
    public static void milestone1(int num3_1a) {
    }
    public static void milestone1(int num3_1a, int num3_1b) {
    }
    public static void milestone2(int num3_2) {
    }
    public static void milestone3() {
    }
    public static void milestone4() {
    }
}