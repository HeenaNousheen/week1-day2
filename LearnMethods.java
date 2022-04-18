package week1.day2;

public class LearnMethods {
public void printCarName()
{
	System.out.println("Toyota Fortuner");
}
public int getCarRegNumber()
{
	int getCarRegNumber = 5555;
	return getCarRegNumber;
}
public String getCarVarient()
{
	return "SUV";
}
public int multiplyTwoNumbers(int a, int b)
{
return a*b;
}

public static void main(String[] args) {
LearnMethods obj = new LearnMethods();

obj.printCarName();

int carRegNumber = obj.getCarRegNumber();
System.out.println(carRegNumber);

String carVarient = obj.getCarVarient();
System.out.println(obj.getCarVarient());

int multiply = obj.multiplyTwoNumbers(56, 10);
System.out.println(multiply);
}
}	