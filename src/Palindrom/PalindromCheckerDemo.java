package Palindrom;

import java.util.ArrayList;

public class PalindromCheckerDemo {

    public static void main(String[] args) {
        ArrayList<Integer> demo = new ArrayList<>();
        ArrayList<Integer> demo1 = new ArrayList<>();
        ArrayList<Integer> demo2 = new ArrayList<>();
        ArrayList<Integer> demo3 = new ArrayList<>();

        demo.add(1);

        demo1.add(1);
        demo1.add(2);
        demo1.add(1);

        demo2.add(1);
        demo2.add(2);
        demo2.add(3);
        demo2.add(3);
        demo2.add(2);
        demo2.add(1);

        demo3.add(1);
        demo3.add(2);
        demo3.add(3);

        System.out.println(PalindromChecker.checkPalindrom(demo));
        System.out.println(PalindromChecker.checkPalindrom(demo1));
        System.out.println(PalindromChecker.checkPalindrom(demo2));
        System.out.println(PalindromChecker.checkPalindrom(demo3));


    }
}
