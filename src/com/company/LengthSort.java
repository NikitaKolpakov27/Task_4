package com.company;

class LengthSort {
    static String[] sortByLength(String[] array) {
        int redFactor = array.length;
        boolean swap = true;
        while (redFactor > 1 || swap) {
            if (redFactor > 1) {
                redFactor = (int) (redFactor / 1.247330950103979);
            }

            int i = 0;
            swap = false;
            while (i + redFactor < array.length) {
                if ((array[i + redFactor]).length() > (array[i]).length()) {
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
}
