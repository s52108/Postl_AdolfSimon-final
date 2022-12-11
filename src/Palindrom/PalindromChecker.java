package Palindrom;

import java.util.ArrayList;

public class PalindromChecker {

    public static boolean checkPalindrom(ArrayList<Integer> numbers) {
        if (numbers.size() <= 1) {
            return true;
        }
        if (numbers.get(0) == numbers.get(numbers.size() - 1)) {
            numbers.remove(0);
            numbers.remove(numbers.size() - 1);
            return checkPalindrom(numbers);
        } else return false;
    }

}


