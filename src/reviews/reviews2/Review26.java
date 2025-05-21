package reviews.reviews2;

public class Review26 {
    public static void main(String[] args) {
        int[] numArray = new int[] {1,2,2,3,3,3};
        int target = 2;
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == target) {
                count++;
            }
        }
        System.out.println("探索した値:" + target);
        System.out.println("一致した数:" + count);
    }
}
