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

            printTask();

        }
    }

    public static void printTask() {

        String weekDay = userChoice.trim().toLowerCase();

        for (int i = 0; i < schedule.length; i++) {
            if(schedule[i][0].toLowerCase().equals(weekDay)) {
                System.out.println("Your tasks for " + weekDay + ": ");
                System.out.println(schedule[i][1]);
            }
        }



    }
}
