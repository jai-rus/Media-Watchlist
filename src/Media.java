
//Base class for all the media
public abstract class Media {
    private String name;
    private String state;
    private String date;
    private String genre;
    private int rating;

    /*public media(String userName, String userState, String userDate, String userGenre, int userRating) {
        name = userName;
        state = userState;
        date = userDate;
        genre = userGenre;
        rating = userRating;
    }*/

    public String getName() {
        return name;
    }

    private void setName(String userInput) {
        name = userInput;
    }

    public int getRating() {
        return rating;
    }

    private void setRating(int userInput) {
        rating = userInput;
    }

    public String getState() {
        return state;
    }

    private void setState(String userInput){
        state = userInput;
    }

    public String getDate() {
        return date;
    }

    private void setDate(String userInput) {
        date = userInput;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String userInput) {
        genre = userInput;
    }


}
