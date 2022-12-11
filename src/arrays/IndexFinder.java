package arrays;

public class IndexFinder {
    public static int findIndexForNumber(int[] numbers, int searchNumber) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchNumber) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int[] findIndicesForExpectedSum(int[] numbers, int expectedSum) {
        int[] indices = new int[]{-1, -1};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == expectedSum) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }

            }

        }
        return indices;

    }

}
