package assignment;

public class Mymobile {
	String Name = "Arvind Dom" ;
	String PhoneNumber = "904351****" ;
	String Msgto = "904351****" ;
	public void makecall() {
		System.out.println("Make a Call ");
		}
	public void sendMsg() {
		System.out.println("Hello");
		}
private void payBills() {
	System.out.println("My Mobile Bills is :159 Rs");
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymobile mob = new Mymobile();
		System.out.println(mob.Name);
		System.out.println(mob.PhoneNumber);
		System.out.println(mob.Msgto);
		mob.makecall();
		mob.sendMsg();
		mob.payBills();

	}

}
