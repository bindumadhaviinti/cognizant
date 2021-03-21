import java.util.*;
public class TrafficLight {
	public static void main(String args [])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number from 1 to 3 to displaysignal:");
	System.out.println("1.red"+"2.green"+"3.yellow");
	int signal=sc.nextInt();
	if(signal==1)
	{
	System.out.println("stop");
	}
	else if(signal==2)
	{
	System.out.println("go");
	}
	else if(signal==3)
	{
	System.out.println("ready");
	}
	else
	System.out.println("please enter valid input");
	}
	}


