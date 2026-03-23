public class EvenAndGreaterThan30{
public static void main(String... args){
	
int [] numbers = new int[5];

numbers[0] = 25;
numbers[1] = 5;
numbers[2] = 34;
numbers[3] = 56;
numbers[4] = 67;

for(int index = 0; index < numbers.length; index++){

	if(index % 2 == 0 && numbers[index] > 30){
		System.out.println(numbers[index]);
	}
}

}
}