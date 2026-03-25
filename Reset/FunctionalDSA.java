import java.util.Arrays;

public class FunctionalDSA {

    public static void insert(int[] arr, int size, int indexToInsert, int value){
        for(int index = size - 1; index >= indexToInsert; index--){
            arr[index + 1] = arr[index];
        }
        arr[indexToInsert] = value;
    }

   public  static void main() {

        int[] arr = {5, 10, 15, 20, 25, 0, 0};
        int size = 5;
        insert(arr, size, 3, 67);
        size++;


            System.out.println(Arrays.toString(arr));



    }
}
