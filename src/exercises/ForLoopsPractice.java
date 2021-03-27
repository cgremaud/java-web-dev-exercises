package exercises;

public class ForLoopsPractice {
    public static void main(String[] args) {
        //for-each loop
        int nums[] = {1, 1, 2, 3, 5, 8, 13, 21};
        for(int i: nums) {
            System.out.println(i);
        }

        for (int i = 100; i >= 0; i = i-5) {
            System.out.println(i);
        }
    }
}
