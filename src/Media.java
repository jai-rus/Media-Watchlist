
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


}
