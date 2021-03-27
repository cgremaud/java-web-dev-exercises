package exercises;
import java.util.Locale;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        Scanner input;
        String searchTerm;
        boolean includes;
        int index;
        int length;
        String trimmedString;

        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or" +
                " conversation?'";
        alice = alice.toLowerCase();

        input = new Scanner(System.in);
        System.out.println("Enter a string to search for: ");
        searchTerm = input.nextLine();
        if (alice.contains(searchTerm.toLowerCase())) {
            index = alice.indexOf(searchTerm);
            trimmedString = alice.replace(searchTerm, "");
            System.out.println("The search term was found at index " + index + ". The search term was " + searchTerm.length() + " chars long." +
                    " The new string with your search removed is: " + trimmedString);
        } else {
            System.out.println("The search term was not found.");
        }
    }
}
