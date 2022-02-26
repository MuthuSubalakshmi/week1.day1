package week1.pgm2;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=123;
		int number,sum=0;
		while(input>0)
		{
			number=input%10;
			System.out.println(number);
			sum=sum+number;
input=input/10;
		}
System.out.println("Sum of digits:"+sum);
	}

}
