package hw3.planner;

import java.util.Scanner;

public class Planner {
    public static String userChoice = "";
    public static String[][] schedule = new String[7][2];

    public static void main(String[] args) {

        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "Learn Java";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "Repeat JS";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "Do coding in React";
        schedule[5][0] = "Friday";
        schedule[5][1] = "Switch Redux to MobX";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "Classes at Dan-It";

        Scanner scan = new Scanner(System.in);

        while (!userChoice.trim().equalsIgnoreCase("exit")) {

            System.out.print("Please, input the day of the week: ");
            userChoice = scan.next();

            switchChoice();

        }
    }

    public static void switchChoice() {

        switch (userChoice.trim().toLowerCase()) {
            case "sunday":
                System.out.println("Your tasks for Sunday:");
                System.out.println(schedule[0][1]);
                break;

            case "monday":
                System.out.println("Your tasks for Monday:");
                System.out.println(schedule[1][1]);
                break;

            case "tuesday":
                System.out.println("Your tasks for Tuesday:");
                System.out.println(schedule[2][1]);
                break;

            case "wednesday":
                System.out.println("Your tasks for Wednesday:");
                System.out.println(schedule[3][1]);
                break;

            case "thursday":
                System.out.println("Your tasks for Thursday:");
                System.out.println(schedule[4][1]);
                break;

            case "friday":
                System.out.println("Your tasks for Friday:");
                System.out.println(schedule[5][1]);
                break;

            case "saturday":
                System.out.println("Your tasks for Saturday:");
                System.out.println(schedule[6][1]);
                break;
            case "exit":
                System.out.println("Application is closing...");
                break;

            default:
                System.out.println("Sorry, I don't understand you, please try again.");
        }

    }
}
