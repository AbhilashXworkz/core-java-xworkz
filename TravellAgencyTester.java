class TravellAgencyTester
{
public static void main(String tourist[])
{
//Travell.gettouristName();
TravellAgency.addTourist("goa");
TravellAgency.addTourist("agra");
TravellAgency.addTourist("rajasthan");
TravellAgency.addTourist("delhi");
TravellAgency.addTourist("munnar");
TravellAgency.addTourist("coorg");
TravellAgency.addTourist("manali");
TravellAgency.addTourist("ooty");




boolean value=TravellAgency.updateTouristName("goa","goaaa");
System.out.println(value);
boolean value1=TravellAgency.updateTouristName("agra"," Agra ");
System.out.println(value1);

boolean value2=TravellAgency.updateTouristName("rajasthan","rajasthannii");
System.out.println(value2);

boolean value3=TravellAgency.updateTouristName("delhi","delhiii");
System.out.println(value3);

boolean value4=TravellAgency.updateTouristName("munnar","munnari");
System.out.println(value4);


TravellAgency.getAllTourist();
}
}