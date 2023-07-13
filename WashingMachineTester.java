public class WashingMachineTester {
    public static void main(String[] args) {
		 System.out.println("Main Started");
	 String WashingMachinename = "LG";
	 boolean connected =WashingMachine.onOrOff();
	 
	 System.out.println("AC is connected " +connected);
    WashingMachine.increaseTime();
  WashingMachine.increaseTime();
   boolean connected1 =WashingMachine.onOrOff();
   System.out.println("WashingMachine is connected " +connected1);
    WashingMachine.decreaseTime();
	WashingMachine.decreaseTime();
    System.out.println("Main Ended");

    }
}