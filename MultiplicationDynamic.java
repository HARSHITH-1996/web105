package LetsLearn;
import java.util.Scanner;
public class MultiplicationDynamic {

public static void main(String[] args) {
	
//program to find multiplication of two number Dynamic
//For Creating New Object
Scanner sc=new Scanner(System.in); 

//Display output console
System.out.println("Enter first number: ");
//My next number should be in next line
int number_one=sc.nextInt(); 
System.out.println("Enter second number: ");
//My next number should be in next line
int number_two=sc.nextInt();
//Logic of multiplication by dynamic
int result=number_one*number_two;
System.out.println("Multiplication of two numbers is : " + result);	
}
}
		