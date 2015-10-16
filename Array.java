
public class Array 
{
	public static void main(String[] args) 
	{
		int number [] = {490, 22, 32, 578, 3}; 
		
		int temp; 
		boolean fixed = false;
				while(fixed==false)
				{
					fixed=true; 
					
		for(int i = 0; i < number.length - 1; i++)
		{
			if (number[i] > number[i + 1])// if 22>490
			{
				temp = number[i+1]; //store 22 in temp
				number[i + 1] = number[i]; //putting 490 in 22's place
				number[i] = temp; 
				fixed=false; //swap until you can't swap any more
			
				}
		
		}
		}
		for(int i = 0; i < number.length; i++)	
		{	
			System.out.println(number[i]); 
		}
		
		
	}

	}

