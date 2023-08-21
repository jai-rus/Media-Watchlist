//import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Logic {
    static Scanner scnr = new Scanner(System.in);

    //maybe if I need to get information for another class
    /*public static String getString() {
        return scnr.nextLine();
    }*/

    public static int getInt() {
        return scnr.nextInt();
    }

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
        String userChoice = "Z";
        clearConsole();

        while (!userChoice.equalsIgnoreCase("X")) {
            printSeparator(30);
            System.out.println("MENU");
            System.out.println("A - Show Movies\nB - Show Japanese TV Shows\nC - Show American TV Shows\nD - Show Korean TV Shows\nE - Add Media\nX - Exit Program");
            printSeparator(30);

            userChoice = choose();
            clearConsole();
            switch (userChoice.toUpperCase()) {
                case "A":
                    printTitle("Showing Movie List");
                    Movies.showList();
                    //System.out.println("Back in logic");
                    //waiting();
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
                    try {
                        addMedia();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case "X":
                    System.out.println("Goodbye");
                    userChoice = "X";
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
                    waiting();
                    clearConsole();
                    break;
            }
        }
    }

    //add media to the lists
    public static void addMedia() throws FileNotFoundException {
        String mediaName;
        String mediaState;
        String mediaDate;
        String mediaGenre;
        int mediaRating;
        int mediaLength;

        clearConsole();
        printSeparator(30);
        System.out.println("What type of media do you want to add?");
        System.out.println("A - Movie\nB - Japanese TV Show\nC - American TV Show\nD - Korean TV Show");
        printSeparator(30);

        try {
            String userChoice = choose();
            scnr.nextLine(); //buffer
            switch (userChoice.toUpperCase()) {
                case "A":
                    Movies movie = new Movies();

                    System.out.println("What is the name of the movie?");
                    mediaName = scnr.nextLine();
                    movie.setName(mediaName);

                    System.out.println("Planned or Finished?");
                    mediaState = scnr.nextLine();
                    movie.setState(mediaState);

                    System.out.println("When did you watch this?");
                    mediaDate = scnr.nextLine();
                    movie.setDate(mediaDate);

                    System.out.println("What is the genre?");
                    mediaGenre = scnr.nextLine();
                    movie.setGenre(mediaGenre);

                    System.out.println("What is your rating from 1 - 10?");
                    mediaRating = scnr.nextInt();
                    movie.setRating(mediaRating);

                    System.out.println("What is the length in minutes?");
                    mediaLength = scnr.nextInt();
                    movie.setLength(mediaLength);

                    Movies.movieList.add(movie);
                    //Movies.movieNames.add(mediaName);
                    Movies.saveMovie(movie);
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
                default:
                    throw new IllegalStateException("Unexpected value: " + userChoice.toUpperCase());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        showMenu();
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

