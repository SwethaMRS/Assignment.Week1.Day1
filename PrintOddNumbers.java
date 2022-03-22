package week1.day1;

public class PrintOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		boolean flag = true;
		
		for(int i =1; i<num; i++)
		{
			if(num%2 == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("The given number is odd");
		}
		else
		{
			System.out.println("The given number is even");
		}

	}

}
