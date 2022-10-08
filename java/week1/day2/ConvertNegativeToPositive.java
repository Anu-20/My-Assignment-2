package week1.day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number=-40, pnumber=0;
    if(number<0)
    {
    	pnumber = -(number); //-(-40)
    	System.out.println("The number "+number+" is converted to "+pnumber);   
    }
    
    else
    {
    System.out.println("The given number " +number+ " is positive");    }
}

}