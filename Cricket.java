public class Cricket {
    
	static String topMostBatsman[]={"Virat Kohli", "Steve Smith", "Kane Williamson", "Joe Root", "Babar Azam", "David Warner",
	"Rohit Sharma",  "Kumar Sangakkara", "AB de Villiers", "Ross Taylor"};
	
	static String topTeamNames[]={"India", "Australia", "England", "New Zealand", "Pakistan", "South Africa",
	"West Indies", "Sri Lanka", "Bangladesh", "Afghanistan"};
	
    static String iplTeamNames[]={"Mumbai Indians", "Chennai Super Kings", "Royal Challengers Bangalore",
	"Kolkata Knight Riders", "Delhi Capitals", "Punjab Kings", "Rajasthan Royals", "Sunrisers Hyderabad",
	"Gujarat Titans", "Lucknow Super Gaints"};	
	
	public static void main(String ct[]){
         System.out.println(" Main Started");
        System.out.println(topMostBatsman[0] + " " + topMostBatsman[1] + " " + topMostBatsman[2] + " " + 
        topMostBatsman[3] + " " + topMostBatsman[4] + " " + topMostBatsman[5] + " " +topMostBatsman[6] +
		" " +topMostBatsman[7] + " " +topMostBatsman[8] + " " + topMostBatsman[9] + "\n " );
		System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(topTeamNames[0]+" "+topTeamNames[1]+" "+topTeamNames[2]+" "+topTeamNames[3]+
		" "+topTeamNames[4]+" "+topTeamNames[5]+" "+topTeamNames[6]+" "+topTeamNames[7]+" "+topTeamNames[8]+
		" "+topTeamNames[9]+"\n");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(iplTeamNames[0]+" "+iplTeamNames[1]+" "+iplTeamNames[2]+" "+iplTeamNames[3]+
		" "+iplTeamNames[4]+" "+iplTeamNames[5]+" "+iplTeamNames[6]+" "+iplTeamNames[7]+" "+iplTeamNames[8]
		+"  "+iplTeamNames[9]+"\n ");
System.out.println(" Main Ended");
    }
}