//import java.util.Scanner;
import java.util.ArrayList;

public class Movies extends Media{
    private String name;
    private String state;
    private String date;
    private String genre;
    private int rating;
    private int length;

    public Movies(String userName, String userState, String userDate, String userGenre, int userRating, int userLength) {
        name = userName;
        state = userState;
        date = userDate;
        genre = userGenre;
        rating = userRating;
        length = userLength;
    }

    //maybe write it directly into a csv??

    public Movies () {
        name = "none";
        state = "none";
        date = "none";
        genre = "none";
        rating = -1;
        length = -1;
    }

    static ArrayList<Movies> movieList = new ArrayList<Movies>();

    public static void showList() {
        int numMovies = 0;
        System.out.println();
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(i + " - " + movieList.get(i).getName());
            numMovies++;
        }

        System.out.println("\nIf you'd like to see more information for a movie, type the number next to the movie. Else type X");

        String userChoice = Logic.choose();
        if(userChoice.toUpperCase().equals("X")) { //Checks if they exit the menu
            System.out.println("Goodbye");
        } else if (Helper.isNumber(userChoice)) { //Checks if its a number
            int userNum = Integer.parseInt(userChoice);
            if (userNum <= numMovies) { //Checks if its a valid option
                showMovie(userNum);
            }
        } else {
            System.out.println("Goodbye");
        }
    }

    public static void showMovie(int userInt) {
        Logic.clearConsole();
        Logic.printSeparator(30);
        System.out.println("Here are the stats");
        System.out.println("Name: " + movieList.get(userInt).getName());
        System.out.println("State: " + movieList.get(userInt).getState());
        System.out.println("Date: " + movieList.get(userInt).getDate());
        System.out.println("Genre: " + movieList.get(userInt).getGenre());
        System.out.println("Rating: " + movieList.get(userInt).getRating());
        System.out.println("Length: " + movieList.get(userInt).getLength() + " minutes");
        Logic.printSeparator(30);
        Logic.waiting();
    }

    public String getName() {
        return name;
    }

    public void setName(String userInput) {
        name = userInput;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int userInput) {
        rating = userInput;
    }

    public String getState() {
        return state;
    }

    public void setState(String userInput){
        state = userInput;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String userInput) {
        date = userInput;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String userInput) {
        genre = userInput;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int userInput) {
        length = userInput;
    }

    /*public static void addMovie() {
        Logic.printTitle("Add Movie");
        System.out.println("What is the name of the movie?");
        setName(Logic.getString());
        System.out.println("The movie name")
    }*/
}
