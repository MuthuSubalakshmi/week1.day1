package week1.pgm2;

public class Fibinnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8;
int firstNum=0;
int secNum=1;
int sum;
System.out.println(firstNum);

System.out.println(secNum);
for(int i=1;i<range;i++)
{
	
sum=firstNum+secNum;	

	firstNum=secNum;  // secNum=1
	secNum=sum;
	System.out.println(sum);
}

	}

}
