import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = { 6, 5, 8, 7, 11 };
        System.out.println("Smallest: " + MainProgram.smallest(numbers));

        int[] numbers2 = { 6, 5, 8, 7, 11 };
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers2));

        int[] numbers3 = { -1, 6, 9, 8, 12 };
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 2));

        int[] numbers4 = { 3, 2, 5, 4, 8 };

        System.out.println(Arrays.toString(numbers4));
        MainProgram.swap(numbers4, 1, 0);
        System.out.println(Arrays.toString(numbers4));
        MainProgram.swap(numbers4, 0, 3);
        System.out.println(Arrays.toString(numbers4));

        int[] numbers5 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers5);

    }

    public static int smallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {        
        int smallestValue = array[0];
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestValue = table[startIndex];
        int smallestIndex = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallestValue) {
                smallestValue = table[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));

            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);    

            System.out.println(">"+Arrays.toString(array));
        }
    }
}
