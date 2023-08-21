//import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Movies extends Media {
    private String name;
    private String state;
    private String date;
    private String genre;
    private int rating;
    private int length;
    private static boolean loadMovies = true;

    public Movies(String userName, String userState, String userDate, String userGenre, int userRating, int userLength) {
        name = userName;
        state = userState;
        date = userDate;
        genre = userGenre;
        rating = userRating;
        length = userLength;
    }

    //maybe write it directly into a csv??

    public Movies() {
        name = "none";
        state = "none";
        date = "none";
        genre = "none";
        rating = -1;
        length = -1;
    }

    static ArrayList<Movies> movieList = new ArrayList<Movies>();
    static ArrayList<String> movieNames = new ArrayList<String>();

    public static void showList() {
        int numMovies = 0;

        /*if (loadMovies) {
            listName();
            loadMovies = false;
        }*/

        System.out.println();
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(i + " - " + movieList.get(i).getName());
            numMovies++;
        }

        System.out.println("\nIf you'd like to see more information for a movie, type the number next to the movie. Else type X");

        String userChoice = Logic.choose();
        if (userChoice.equalsIgnoreCase("X")) { //Checks if they exit the menu
            System.out.println("Goodbye");
        } else if (Helper.isNumber(userChoice)) { //Checks if its a number
            int userNum = Integer.parseInt(userChoice);
            if (userNum <= numMovies) { //Checks if its a valid option
                showMovie(userNum);
                //readMovie(userNum);
            }
        } else {
            Logic.clearConsole();
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
        Logic.clearConsole();
    }
    //writes the movie information into movie.csv using printwriter
    public static void saveMovie(Movies movie) throws FileNotFoundException {
        try {
            //File csvFile = new File("movie.csv");
            PrintWriter out = new PrintWriter(new FileWriter("movie.csv", true));

            out.printf("%s, %s, %s, %s, %d, %d\n", movie.getName(), movie.getState(), movie.getDate(), movie.getGenre(), movie.getRating(), movie.getLength());
            out.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //reads the movie information from movies.csv
    /*public static void readMovie(int userChoice) { might be useless if i load everything from the beginning 2 hours later: it was
        String path = "movie.csv";
        //String line = "";
        if (true) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(path));

                /*while((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    System.out.println(values[0]);
                }

                for (int i = 0; i <= userChoice; i++) {
                    //System.out.println(br.readLine());
                    String curLine = br.readLine();
                    //System.out.println(i);
                    if (i == userChoice)
                        System.out.println(curLine);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            showMovie(userChoice);
        }
    }
    //lists names of movies from the csv
    public static void listName() { //might be useless if I load everything from beginning
        String names[];
        String curLine;
        //ArrayList<String> movieNames = new ArrayList<String>();

        try {
            FileReader fr = new FileReader("movie.csv");
            BufferedReader br = new BufferedReader(fr);

            while ((curLine = br.readLine()) != null) {
                names = curLine.split(",");
                movieNames.add(names[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

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

    public void setState(String userInput) {
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
}

