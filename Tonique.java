class Tonique{
//alcohol 30
   static String alcohol[] = {"old monk" ,"Ot" ,"Wiskey" ,"King Fisher" ,"Rum" ,
   "Vodka" ,"Aperol" ,"Jägermeister" ,"Morosha Vodka" ,"Blender’s Pride Whisky",
   "McDowell’s No. 1 Celebration Rum","Ballantine’s Scotch Whisky","Baileys Irish Cream",
   "Crown Royal Whisky","Hlibny Dar Vodka","Jameson Irish Whiskey","8PM Whisky"," Zubrówka Vodka",
   "Khortytsa Vodka","Captain Morgan Rum","Jack Daniel’s Whiskey"," Bacardi Rum"," Royal Stag Whisky",
   "Emperador Brandy","Tanduay Rum","Imperial Blue Whisky","Smirnoff Vodka","Ginebra San Miguel Gin",
   "Jinro Soju","Jägermeister"};
   
   public static void main(String tonique[]){
	   System.out.println(" Main Started");
	    System.out.println("------------------------------------------------------------------------------------------");
		
		getalcohol();
	   
	    System.out.println("------------------------------------------------------------------------------------------");
	   System.out.println(" Main Ended");
   }
   public static void getalcohol(){
   	for( int indexab=0;indexab<alcohol.length;indexab++){

		System.out.println(alcohol[indexab]);
		}
   }
	   
}
