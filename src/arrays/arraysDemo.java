package arrays;

public class arraysDemo {

    public static void main(String[] args) {
        int[] demo1 = new int[]{0, 1, 9, 7};

        System.out.println(IndexFinder.findIndexForNumber(demo1, 7));
        System.out.println(IndexFinder.findIndexForNumber(demo1, 2));

        System.out.println();

        for (int number : IndexFinder.findIndicesForExpectedSum(demo1, 8)) {
            System.out.print("" + number + " ");
        }
        System.out.println();
        for (int number : IndexFinder.findIndicesForExpectedSum(demo1, 2)) {
            System.out.print(number + " ");
        }
    }
}
