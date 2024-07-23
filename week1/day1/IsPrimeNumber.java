package week1.day1;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		
		//n is the input number
		
int n= 17;

//prime number only divides by 1 and itself. 
//if it divides by any other number apart from 1 and itself its a non prime number

for (int i = 2; i <= n-1; i++) {
	
	if(n%i==0) 
	{
		
		System.out.println("Non Prime number :" +n );
		break;
	}
	
	else
		
		System.out.println("Prime number :" +n );
	break;
}

	}

}
