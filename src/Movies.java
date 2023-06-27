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
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(movieList.get(i).getName());
        }
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
