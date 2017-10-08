import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        promptuser();
        Egg test = new Egg();

        int times = 0;

        while (times <= 3) {

            int egg = ControlStructures.getKeepingCount() + Primitives.getKeepingCount() + ClassesAbstractInheritance.getKeepingCount();


            if (egg == 8) {
                System.out.println("You get a Golden start!!");
                test.Egg();
            }

            Scanner input2 = new Scanner(System.in);

            String userChoice = input2.next().toLowerCase();

            if (userChoice.equals("control structures") || userChoice.equals("control")) {
                times += 1;
                ControlStructures.getgame();
                System.out.println(" Good Job... Lets Try another topic : ) ");
//                System.out.println(ControlStructures.getKeepingCount());
                System.out.println("========");
                System.out.println("Would you like to learn about Primitives , Classes , Abstract , or Inheritance");


            } else if (userChoice.equals("primitives")) {
                times += 1;
                Primitives.getgame();
                System.out.println(" Good Job... Lets Try another topic : ) ");
//                System.out.println(Primitives.getKeepingCount());
                System.out.println("========");
                System.out.println("Would you like to learn about Control Structures ,  Classes , Abstract , or Inheritance");

            } else if (userChoice.equals("classes") || userChoice.equals("abstract") || userChoice.equals("inheritance")) {
                times += 1;
                ClassesAbstractInheritance.getgame();
                System.out.println(" Good Job... Lets Try another topic : ) ");
//                System.out.println(ClassesAbstractInheritance.getKeepingCount());
                System.out.println("========");
                System.out.println("Would you like to learn about Control Structures , Primitives ");


            } else {
                System.out.println("Please pick from the options and also Please check your spelling / Input");
                promptuser();

            }

        }
    }


    private static void promptuser() {
        System.out.println("Hi, welcome to java-trainer 1.0. Type in a java term you would like to learn more about:");
        System.out.println("Would you like to learn about Control Structures , Primitives , Classes , Abstract , or Inheritance");
    }
}

