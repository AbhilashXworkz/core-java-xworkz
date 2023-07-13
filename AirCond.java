public class AirCond {
    
    static int minTemperature = 5;
    static int currentTemperature;
    static int maxTemperature = 15;
    static boolean isConnected;

    // Methods
    public static boolean onOrOff() {
        System.out.println("Invoking onOrOff()");
        
        if (isConnected==false) {
            isConnected = true;
            System.out.println("Air Conditioner is turned on");
        } else {
            isConnected = false;
            System.out.println("Air Conditioner is turned off");
			System.out.println("turn on the AC First");
        }
        
        return isConnected;
    }

    public static void increaseTemperature() {
        if (isConnected) {
            if (currentTemperature < maxTemperature) {
                currentTemperature++;
                System.out.println("Temperature increased to " + currentTemperature);
            } else {
                System.out.println("Maximum temperature reached");
            }
        } else {
            System.out.println("Turn on the Air Conditioner first");
        }
    }

    public static void decreaseTemperature() {
        if (isConnected) {
            if (currentTemperature > minTemperature) {
                currentTemperature--;
                System.out.println("Temperature decreased to " + currentTemperature);
            } else {
                System.out.println("Minimum temperature reached");
            }
        } else {
            System.out.println("Turn on the Air Conditioner first");
        }
    }
}