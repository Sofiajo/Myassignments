package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		//fibonacci series ( each number is sum of 2 preceeeding ones): 0 1 1 2 3 5 8 13...
		
		int a= 0;
		int b= 1;
		int c;
		int range = 8;
		
	        System.out.println(a);
			System.out.println(b);	
		
		for (int i=2; i<range; i++)
			
			//i<range = 2,3,4,5,6,7
		{
		 c=a+b;
				
			System.out.println(c);
			
			a=b;
			b=c;
			
		
			
		}
		

	}

}
