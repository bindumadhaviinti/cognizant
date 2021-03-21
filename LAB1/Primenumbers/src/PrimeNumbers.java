import java.util.*;
public class PrimeNumbers {
	public static void main(String args [])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	int i=0,n=0;
	String primenumbers="";
	for(i=1;i<=num;i++)
	{
	int counter=0;
	for(n=i;n>=1;n--)
	{
	if(i%n==0)
	{
	counter=counter+1;
	}
	}
	if(counter==2)
	{
	primenumbers=primenumbers+i+" ";
	}
	}
	System.out.println("primenumbers are:" + primenumbers);
	}
	}

