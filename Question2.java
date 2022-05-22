// JEAN MUJURU R183432H


import java.util.Scanner;
public class Question2{
	public static void main(String[] args){ 
        int a = 1400;
        int b = 70;
        String choiceChar;
        Scanner scanner = new Scanner(System.in);
        while(true){ 
            System.out.println("\n\n1 or A. Add");
            System.out.println("2 or S. Subtract");
            System.out.println("3 or M. Multiply");
            System.out.println("4 or D. Divide");
            System.out.println("5 or R. Remainder");
            System.out.println("6 or X. Exit\n\n");
            choiceChar = scanner.nextLine();
            switch (choiceChar){
                case "1":
                    System.out.println(a + b);
                    break;
                case "2":
                    System.out.println(a - b);
                    break;
                case "3":
                	System.out.println(a * b);
                    break;
                case "4":
                    System.out.println(a / b);
                    break;
                case "5":
                    System.out.println(a | b);
                    break;
                case "A":
                    System.out.println(a + b);
                    break;
                case "S":
                    System.out.println(a - b);
                    break;
                case "M":
                    System.out.println(a * b);
                    break;
                case "D":
                    System.out.println(a / b);
                    break;
                case "R":
                    System.out.println(a | b);
                    break;
                case "6":
                    System.exit(0);
                case "X":
                    System.exit(0);
                default:
                    System.out.println("Invalid selection!!! Please try again.");
            }
        }
    }
}
