public class MixerTester {
    public static void main(String[] args) {
		 System.out.println("Main Started");
	 String AirCondname = "BAJAJ";
	 boolean connected =Mixer.onOrOff();
   System.out.println("Mixer is connected " +connected);
   Mixer.increaseSpeed();
   Mixer.increaseSpeed();
   boolean connected1 =Mixer.onOrOff();
   System.out.println("Mixer is connected " +connected1);
    Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
    
    System.out.println("Main Ended");

    }
}