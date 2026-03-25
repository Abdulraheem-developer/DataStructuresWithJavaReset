import java.util.Arrays;

public class FunctionalRemove {


    public static void remove(int[] arr, int indexToRemove, int size) {
        for(int index = indexToRemove; index < size - 1; index++) {
            arr[index] = arr[index + 1];
        }
        arr[size - 1] = 0;
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25};
        int size = 5;
        remove(arr, 2, 5);
        size--;


        for(int index = 0; index < size; index++) {
            System.out.print(arr[index] + " ");
        }



    }
}
