class TelecommTester
{
public static void main(String city[])
{
//Telecomm.getsimName();
Telecomm.addSim("jio");
Telecomm.addSim("Airtel");
Telecomm.addSim("vadafone");
Telecomm.addSim("BSNL");
Telecomm.addSim("idea");




boolean value=Telecomm.updateSimName("jio","jio infocom limited");
System.out.println(value);
boolean value1=Telecomm.updateSimName("Airtel","airtel pvt ltd");
System.out.println(value1);

boolean value2=Telecomm.updateSimName("vadafone","vadofone");
System.out.println(value2);

boolean value3=Telecomm.updateSimName("BSNL","bsnl");
System.out.println(value3);

boolean value4=Telecomm.updateSimName("idea","IDEA");
System.out.println(value4);


Telecomm.getAllSim();
}
}