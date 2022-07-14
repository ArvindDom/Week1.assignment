package assignment;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -20;
		if(a<0)
		{
			System.out.println("The Given Number" + a + "is Negative");
			System.out.println("Conversion of Given Number");
			a = ~(a-1);
			System.out.println("The Converted Number is " + a + "Positive Number ");
		}
	}

}
