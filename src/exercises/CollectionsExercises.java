package exercises;

public class CollectionsExercises {

    public static void main(String[] args) {
        int[] numArray = {1, 1, 2, 3, 5, 8};
        for (Integer i : numArray) {
            System.out.println(i);
        }
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a" +
                " house. I will not eat them with a mouse.";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        String[] sentences = str.split("\\.");
        sentences[0] = " " + sentences[0];
        for (String sentence : sentences) {

            System.out.println(sentence + ".");
        }
    }
}
