public class AirCondTester {
    public static void main(String[] args) {
		 System.out.println("Main Started");
	 String AirCondname = "Samsung";
	 boolean connected =AirCond.onOrOff();
   System.out.println("AC is connected " +connected);
   AirCond.increaseTemperature();
   AirCond.increaseTemperature();
   boolean connected1 =AirCond.onOrOff();
   System.out.println("AC is connected " +connected1);
    AirCond.decreaseTemperature();
	AirCond.decreaseTemperature();
    
    System.out.println("Main Ended");

    }
}