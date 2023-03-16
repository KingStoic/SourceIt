import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hi \nWhat should I call you");
        String name = scan.nextLine();

        //System.out.println("Hello " + name);
        System.out.println("I'm K8, your virtual assistant. I can help you with digital task, questions and suggestions. \nGo ahead and give it a shot. \nWhat can i help you with, " + name + "?");

        String skill = scan.nextLine();

        if (skill.isBlank()) {
            System.out.println("Ok, GoodBye");

        } else {
            switch (skill) {
                case "name" -> System.out.println("im your case 1");
                case "age" -> System.out.println("im your case 2");
                case "menu" -> System.out.println("im your case 3");
                case "gas" -> GasBudget.summary();
               // case "gas" -> System.out.println(GasBudget.class);
                default -> System.out.println("That is not a skill yet :)");

            }
        }
    }
}