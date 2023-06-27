import java.util.InputMismatchException;
import java.util.Scanner;
public class Logic {
    static Scanner scnr = new Scanner(System.in);

    //method that clears the console
    public static void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    //method that separates information with -
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    //method that prints a header
    public static void printTitle(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    //method waits for user input
    public static void waiting() {
        System.out.println("\nEnter anything to continue");
        scnr.next();
    }

    //showcases the main menu
    public static void showMenu() {
        clearConsole();
        printSeparator(30);
        System.out.println("MENU");
        System.out.println("A - Show Movies\nB - Show Japanese TV Shows\nC - Show American TV Shows\nD - Show Korean TV Shows\nE - Add Media");
        printSeparator(30);

        String userChoice = choose();
        switch (userChoice.toUpperCase()) {
            case "A":
                System.out.println("Showing movies");
                break;
            case "B":
                System.out.println("Showing Japanese TV Shows");
                break;
            case "C":
                System.out.println("Showing American TV Shows");
                break;
            case "D":
                System.out.println("Showing Korean TV Shows");
                break;
            case "E":
                //System.out.println("Adding Media");
                addMedia();
                break;
        }
    }

    //add media to the lists
    public static void addMedia() {
        String mediaName;

        clearConsole();
        printSeparator(30);
        System.out.println("What type of media do you want to add?");
        System.out.println("A - Movie\nB - Japanese TV Show\nC - American TV Show\nD - Korean TV Show");
        printSeparator(30);

        String userChoice = choose();
        switch (userChoice.toUpperCase()) {
            case "A":
                //System.out.println("What is the name of the movie?");
                //mediaName = scnr.nextLine();
                //Movies newMovie = new Movies(mediaName); Trying to figure out a way to write down the information - maybe just go directly into movies?

                break;
            case "B":
                System.out.println("Adding Japanese TV Shows");
                break;
            case "C":
                System.out.println("Adding American TV Shows");
                break;
            case "D":
                System.out.println("Adding Korean TV Shows");
                break;
        }
        waiting();
    }

    //menu input - single letter
    public static String choose() {
        String userChoice = "z";
        try {
            userChoice = scnr.next().substring(0, 1);
        } catch (Exception e) {
            System.out.println("Please input a valid choice");
        }
        return userChoice;
    }
}

