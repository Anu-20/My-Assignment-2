package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
    int number=34343,i, temp=0, reminder=0;
    i=number;		
    for(;number>0;)		
    {
    	reminder=number%10; //getting reminder
    	number=number/10; //getting quotient and assign value to i
    	temp=(temp*10)+reminder; //adding reminder and multiply by 10
    	
       }
    if(i==temp) 
    {
    System.out.println("The given number is palindrome");
	}
    else
    {
    System.out.println("The given number is not palindrome");
    }
}
}
