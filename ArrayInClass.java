import java.util.Random;

public class ArrayInClass 
{
	public static void main(String[] args) 
	{
		int[] ar = new int[5];
		Random r = new Random(); 
		
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = r.nextInt(10); //Numbers between zero and nine placed into bucket "i" of array
		}
		

		//ArrayInClass.display(ar); //calls the display method of display
		//System.out.println(ArrayInClass.posOfSmallest(ar)); //shows array + which bucket holds the smallest integer 
		
		int[] answer = new int[ar.length]; 
		int pos = 0; 
		
		ArrayInClass.display(ar); 
		
		for(int i = 0; i < answer.length; i++)
		{
			
		int smallestPos = ArrayInClass.posOfSmallest(ar); //get the position of ar of the smallest value 
		//copy the value of that position into answer at index pos
		
		answer[pos] = ar[smallestPos]; 
		//remove from ar the element at index smallestPos
		
		ar = ArrayInClass.removeAtIndex(smallestPos, ar); 
		}
		
		ArrayInClass.display(answer);
		ArrayInClass.display(ar);
	}
	static void display(int[] array)
	{
		System.out.println("****"); 
		for(int i =  0; i < array.length; i++)
		{
			System.out.println(array[i]); //prints out a MEMORY ADDRESS of i
		}
		System.out.println("****"); 
	}
	
	//identifies position/bucket of the smallest value
	static int posOfSmallest(int[] ar) //identify where an integer lives
	{
		int pos = 0; 
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] < ar[pos])
			{
				pos = i; 
			}
		}
		return pos; 
	}
	static int[] removeAtIndex(int index, int[] ar)
	{
		int[] temp = new int[ar.length-1]; //make a new array one bucket smaller 
		
		for(int i = 0; i < index; i++)//copy everything from ar into temp
		{
			temp[i] = ar[i]; 
		}
		for(int i = index+1; i < ar.length; i++)//copy everything from after
		{
			temp[i-1] = ar[i]; 
		}
		return temp;  
	}
}

