import java.util.*;
public class OddsnEvens
{
public static void main(String []args)
{
	System.out.println("***********Let`s play the game Odds And Evens***********\nWhat is your name?");
	Scanner a=new Scanner(System.in);
	String name=a.nextLine();
	System.out.println(name+"\nHii "+name+" which do you want to choose?\n1.(O)dds\n2.(E)vens");
	String s1="o";
	String s2="e";
	Scanner b=new Scanner(System.in);
	String input=b.next();
	if(s1.equalsIgnoreCase(input))
	{
		System.out.println(name+" has picked odds and Computer will be Evens.");
	}
	else if(s2.equalsIgnoreCase(input))
	{
		System.out.println(name+" has picked Evens and Computer will be Odds.");
	}
	else 
	{
		System.out.println("Error:You have choosen wrong character.Please choose O or E.");
	}
	System.out.println("How many fingers do you want to putout?");
	Scanner c=new Scanner(System.in);
	int fin=c.nextInt();
	Random ran=new Random();
	int r=ran.nextInt(5)+1;
	if(fin<=5&&fin!=0)
	{
	System.out.println(name+" = "+fin);
	System.out.println("Computer = "+r);
	}
	else 
	{
		System.out.println("Error:You have to choose numbers between 1 to 5.");
	}
	int sum=fin+r;
	System.out.println("Sum of numbers = "+sum);
	if((sum)%2==0)
	{
		System.out.println("Number is Even.");
		if(s2.equalsIgnoreCase(input))
		{
	System.out.println(name+" won the match.");
		}
	}
    else
	{
	System.out.println("Number is odd.\nComputer won the match.");
	}
	System.exit(0);
	
}
}	
	
	
		
		
	


	