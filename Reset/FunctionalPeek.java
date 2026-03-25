public class FunctionalPeek {

    public static int peek(int[] numbers, int index) {
        return numbers[index];
    }

    public static void main() {

        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println(peek(numbers, 2));

    }
}
