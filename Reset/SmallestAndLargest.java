public class SmallestAndLargest{
   public static void main(String... args){

	int [] numbers = new int[5];

	int smallest = numbers[0];
	int largest = numbers[0];

numbers[0] = 25;
numbers[1] = 5;
numbers[2] = 34;
numbers[3] = 56;
numbers[4] = 67;

	for(int index = 1; index < numbers.length; index++){
		if(numbers[index] < smallest){
			smallest = numbers[index];
		}

		if(numbers[index] > largest){
			largest = numbers[index];
		
		}
		
	}
		System.out.println(smallest + " is the smallest number in the Array");
		 System.out.println(largest + " is the largest number in the Array");

}
}