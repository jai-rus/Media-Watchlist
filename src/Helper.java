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
}