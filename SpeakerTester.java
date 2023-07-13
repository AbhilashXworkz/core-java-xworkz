class SpeakerTester{
 public static void main(String tester[]){
	 System.out.println("Main Started");
	 Speaker1.name = "JBL";
	 boolean connected =Speaker1.onOrOff();
	 System.out.println("Is Speaker Connected"+ connected);
	 System.out.println("Invoking On onOrOff Method");
   Speaker1.onOrOff();
   Speaker1.increaseVolume();
   Speaker1.increaseVolume();
  
    Speaker1.decreaseVolume();
	Speaker1.decreaseVolume();
    Speaker1.onOrOff();
    System.out.println("Main Ended");
 }
}