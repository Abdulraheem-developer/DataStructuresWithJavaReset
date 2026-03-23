public class MasteringArrays{
   public static void main(String... args){

	int [] numbers = new int[5];

numbers[0] = 25;
numbers[1] = 5;
numbers[2] = 34;
numbers[3] = 56;
numbers[4] = 67;

for(int index = 0; index < numbers.length; index++){
	System.out.print(numbers[index] + " ");
}

	System.out.println(numbers[0]);
	System.out.println(numbers[numbers.length - 1]);

}
}

