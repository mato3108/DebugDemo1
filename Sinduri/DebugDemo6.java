import java.util.Arrays;

public class DebugDemo6 {

    public static void main(String[] args) {

        int[] a = {10,16,20,6,1,3,5,25,31,34,7,8,22};
        int[] sorted = sort(a);
        for(int element : sorted) {
            System.out.print(element + " ");
        }

        Arrays.sort(a);
        System.out.println("\nExpected Output: ");
        for(int element : sorted) {
            System.out.print(element + " ");
        }


    }

    public static int[] sort(int[] array) {
        int temp = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] =  array[j];
                    array[j] = temp;
                }

            }
        }
        return array;
    }
}