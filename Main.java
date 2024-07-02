import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //EX1
        System.out.println("Exercise1:");

        System.out.print("Enter your role: ");
        String role = sc.nextLine();

        if (role.equalsIgnoreCase("Admin")){
            System.out.println("Welcome Admin");
        }else if (role.equalsIgnoreCase("Superuser")) {
            System.out.println("Welcome Superuser");
        }else{
            System.out.println("Role doesn't exists.");
        }

        //EX2
        System.out.println("Exercise2:");
        int greaterNum;

        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1>num2&&num1>num3){
            greaterNum=num1;
        } else if (num2>num1&&num2>num3) {
            greaterNum=num2;
        } else{
            greaterNum=num3;
        }
        System.out.println("Greatest number = "+greaterNum);

        //EX3
        System.out.println("Exercise3:");

//sol1: pre-specified
        //int number = 4;

//sol2: using class Random
        Random rand = new Random();
        int number = rand.nextInt(1,8); //generates a random integer between 1 (inclusive) and 8 (exclusive)

        switch (number) {
            case (1):
                System.out.println("Sunday.");
                break;
            case (2):
                System.out.println("Monday.");
                break;
            case (3):
                System.out.println("Tuesday.");
                break;
            case (4):
                System.out.println("Wednesday.");
                break;
            case (5):
                System.out.println("Thursday.");
                break;
            case (6):
                System.out.println("Friday.");
                break;
            case (7):
                System.out.println("Saturday.");
                break;
        }

        //EX4
        System.out.println("Exercise4:");

        System.out.print("Enter grade: ");
        int grade = sc.nextInt();

        if(grade>100){
            System.out.println("Illegal number.");
        }else if (grade >= 90){
            System.out.println("A");
        } else if (grade >= 80){
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        
        //EX5
        System.out.println("Exercise5:");

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        
        if(age<0){
            System.out.println("Illegal number.");
        } else if (age<13) {
            System.out.println("You are a child.");
        } else if (age<=19) {
            System.out.println("You are a teenager.");
        }else {
            System.out.println("You are an adult.");
        }
    }
    }