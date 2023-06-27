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

    public Movies(String userName) {
        name = userName;
        state = "none";
        date = "none";
        genre = "none";
        rating = -1;
        length = -1;
    }

    public int getLength() {
        return length;
    }

    private void setLength(int userInput) {
        length = userInput;
    }

    public addMovie() {
        //make the user input the information here
    }
}
