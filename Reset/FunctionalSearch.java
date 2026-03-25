public static int search(int[] numbers, int target){

            int count = 0;

    for (int number : numbers) {

        if (number == target) {
            count++;
        }
    }
		return count;
}



void main() {
	int[] numbers = {5, 10, 15, 20, 25, 20};

    System.out.println(search(numbers, 20));
}