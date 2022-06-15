import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        ArraysExamples arrayObj = new ArraysExamples();
        arrayObj.arrayFunc();
    }

    public void arrayFunc() {
        boolean isMatch = false;
        int position = 0;
        int[] intArray = {3, 3, 87, 56, 1, 87, 3, 2};
        int[] newIntArray = new int[5];

        for (int k : intArray) {
            for (int j : newIntArray) {
                if (k == j) {
                    isMatch = true;
                    break;
                } else {
                    isMatch = false;
                }
            }
            if (!isMatch) {
                newIntArray[position] = k;
                position++;
            }
        }

        for (int j : newIntArray) {
            System.out.print(j + " ");
        }
    }
}
