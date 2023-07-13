public class MicrowaveTester {
    public static void main(String args[]) {
		 System.out.println("Main Started");
	 String Microwavename = "LG";
	 boolean connected =Microwave.onOrOff();
   System.out.println("Microwave is connected " +connected);
   Microwave.increaseTime();
   Microwave.increaseTime();
   boolean connected1 =Microwave.onOrOff();
   System.out.println("Microwave is connected " +connected1);
    Microwave.decreaseTime();
	Microwave.decreaseTime();
    
    System.out.println("Main Ended");

    }
}