package week1.pgm2;

public class MyCalculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator calc=new Calculator();
int value=calc.add(4,2,1);
System.out.println(value);
int diff=calc.sub(4,2);
System.out.println(diff);
double mul=calc.mul(42.3,22.34);
System.out.println(mul);
float div=calc.divide(10.0f,2.0f);
System.out.println(div);	
}

}
