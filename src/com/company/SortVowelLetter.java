package com.company;

class SortVowelLetter {
    static String[] sortByVowelLetters(String[] array, char[] vowel) {
        int redFactor = array.length;
        boolean swap = true;
        while (redFactor > 1 || swap) {
            if (redFactor > 1) {
                redFactor = (int) (redFactor / 1.247330950103979); //Фактор уменьшения. Число получено путем 1/(1-e^f). f - золотое сечение. e - экспонента
            }

            int i = 0;
            swap = false;
            while (i + redFactor < array.length) {
                if (VowelLetterCounter(array, i+redFactor, vowel) > VowelLetterCounter(array, i, vowel)) {
                    String temp = array[i];
                    array[i] = array[i + redFactor];
                    array[i + redFactor] = temp;
                    swap = true;
                }

                i++;
            }
        }
        return array;
    }

    private static int VowelLetterCounter(String[] array, int index, char[] vowel) {
        int count = 0;
        for (int i = 0; i < array[index].length(); i++)  {
            for (char j : vowel) {
                if (j == array[index].charAt(i)) {
                    count++;
                }
            }
        }
        return count;

    }
}
