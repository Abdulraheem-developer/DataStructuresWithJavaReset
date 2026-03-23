public static boolean search(int[] numbers, int target){

    for (int number : numbers) {
        if (number == target) {
            return true;
        }
    }
		return false;
}



void main() {
	int[] numbers = {5, 10, 15, 20, 25};

    System.out.println(search(numbers, 20));
}