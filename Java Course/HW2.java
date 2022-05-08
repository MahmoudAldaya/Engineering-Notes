import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // q 1
//        int count = 0;
//        for (int i = 1; i <= 10; i++) {
//            count+=i;
//        }
//        System.out.println(count);
        // q 2
//        System.out.println("enter a number to calculate it's factorial: ");
//          double num = input.nextInt();
//          double fact = 1;
//        for (double i = num; i >= 1; i--) {
//            fact *= i;
//        }
//        System.out.println(fact);
        // q 4
//        System.out.println("Enter the base number: ");
//        double base = input.nextDouble();
//        System.out.println("Enter the power number: ");
//        double power = input.nextDouble();
//        double result = 1 ;
//        for (int i = 0; i < power; i++) {
//            result *= base;
//        }
//        System.out.println(result);
        // q 5
//        System.out.println("Enter a number to print it reversed: ");
//        int num = input.nextInt();
//        while (num != 0) {
//            int y = num % 10;
//            num = num / 10;
//            System.out.print(y);
//        }
        // q 6
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//        int oddNumbers = 0;
//        int evenNumbers = 0;
//        int odd_sum = 0;
//        int even_sum = 0;
//
//        while (num != 0) {
//            int y = num % 10;
//            num = num / 10;
//
//            if (y % 2 == 0){
//                even_sum+=y;
//                evenNumbers++;
//            }
//            else{
//                odd_sum+=y;
//                oddNumbers++;
//            }
//        }
//        System.out.println("There are ("+ oddNumbers +") odd numbers, with a sum of ("+ odd_sum + ")");
//
//        System.out.println("There are ("+ evenNumbers +") even numbers, with a sum of ("+ even_sum + ")");
        // q 7
//        do{
//            System.out.println("Enter two numbers to add them: ");
//            double num1 = input.nextDouble();
//            double num2 = input.nextDouble();
//            System.out.println(num1 + num2);
//            System.out.println("Enter 1 to continue, else to stop: ");
//        }while(input.nextInt() == 1);
        // q 10

//        System.out.println("How many number do you want to insert: ");
//        int num_of_num = input.nextInt();
//        System.out.println("Enter the number: ");
//        double num = input.nextDouble();
//        for (int i = 0; i < num_of_num; i++) {
//
//        }

        // q 11 hasn't solved yet! old

//        System.out.println("enter the number of inputs: ");
//        int num_of_inputs = input.nextInt();
//        System.out.println("Enter the number: ");
//        double number = input.nextDouble();
//        double max = 0;
//        for (int i = 0; i < num_of_inputs; i++) {
//            double t = number % 10;
//            number/=10;
//            max = t;
//
//        }

        // q 12

//        double count = 0;
//        System.out.println("enter number: ");
//        int n = input.nextInt();
//        for (double i = 1; i <= n; i++) {
//            count+=1/i;
//        }
//        System.out.println(count);

        // q 13
//        double count = 0;
//        System.out.println("enter number: ");
//        int n = input.nextInt();
//        for (double i = 1; i <= n; i++) {
//            if(i % 2 != 0)
//                count+=1/i;
//            else
//                count-=1/i;
//        }
//        System.out.println(count);
        // q 14

//        double number;
//        int positive =0, negative =0, zero=0, choice;
//        do {
//            System.out.println("Enter a number: ");
//            number = input.nextDouble();
//
//            if(number > 0)
//                positive++;
//            else if(number < 0)
//                negative++;
//            else zero++;
//
//            System.out.println("Do you want to continue? \n" +
//                    "0- NO \n" +
//                    "1- YES");
//            choice = input.nextInt();
//        }while (choice == 1);
//
//        System.out.println("Number of positive integers: " + positive + ", Number of negative integers: "+ negative + ", Number of zeros: "+ zero);
//    // q11

//        System.out.println("Enter a number: ");
//        int number = input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " * " + i + " = "+ number*i);
//        }
//        // q3
//        System.out.println("Enter a positive number to check if it is a prime number or not: ");
//        int number = input.nextInt();
//
//        int count =0;
//        for (int i = 1; i <= number; i++) {
//            if(number%i == 0)
//                count++;
//        }
//        if (count > 2)
//            System.out.println("Not prime number");
//        else
//            System.out.println("Prime number");
//        // q8
//        int num1, num2, hcf = 0;
//        System.out.println("Enter first number: ");
//        num1 = input.nextInt();
//        System.out.println("Enter second number: ");
//        num2 = input.nextInt();
//
//        for(int i = 1; i <= num1 || i <= num2; i++) {
//            if( num1 %i == 0 && num2 %i == 0 )
//                hcf = i;
//        }
//        System.out.println("HCF of given two numbers is: "+hcf);
//        // q9
    }
}
