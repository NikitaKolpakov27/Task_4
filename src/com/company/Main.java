package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Alice", "Alexei", "Mikhail", "Lena", "Leonid", "Olga", "Timofei", "Maria", "Evgenia", "Uliyana", "Sasha", "Sergei"};
        char[] vowel = {'A', 'E', 'I', 'U', 'Y', 'O', 'a','e','y','u','i','o'};
        System.out.println(Arrays.toString(array));
        String[] newVowelArray = SortVowelLetter.sortByVowelLetters(array, vowel);
        System.out.println("По гласным: " + Arrays.toString(newVowelArray));
        String[] newLenArray = LengthSort.sortByLength(array);
        System.out.println("По длине: " + Arrays.toString(newLenArray));
    }
}

