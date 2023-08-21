import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Helper {

    //check if a string can be turned into a number
    public static boolean isNumber(String userInput) {
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void loadMovies() {
        String data[];
        String curLine;

        try {
            BufferedReader br = new BufferedReader(new FileReader("movie.csv"));
            while ((curLine = br.readLine()) != null) {
                data = curLine.split(",");
                Movies movie = new Movies();

                movie.setName(data[0]);
                movie.setState(data[1]);
                movie.setDate(data[2]);
                movie.setGenre(data[3]);
                movie.setRating(Integer.parseInt(data[4].replaceAll("\\s+","")));
                movie.setLength(Integer.parseInt(data[5].replaceAll("\\s+","")));
                Movies.movieList.add(movie);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}