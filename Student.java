public class Student{
	public static void main(String[] args){
	int test1=85;
	int test2=90;
	int test3=78;
	// implicit typecasting.
	// calculate average with decimal
	double average=(test1+test2+test3)/3.0;
	// explicit typecasting
	int roundedDownAverage=(int)average;
System.out.println("Student Test Scores : "+test1+","+test2+","+test3);
System.out.println("Average(Decimal ): "+average);
System.out.println("Average(Rounded Down ) "+roundedDownAverage);
	}
}