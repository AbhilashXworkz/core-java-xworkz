 public class Karnataka{
	
     static String cityNames[]={null,null,null,null,null,null,null,null};
	static int index;
	  public static boolean addCity(String city){
		 boolean isAdded=false;
		 if(index<cityNames.length){
		   if(city!=null){
			    cityNames[index++]=city;				
			   isAdded=true;
			   System.out.println("Is city Added" + isAdded);			     
		   }else{
			   System.out.println("Cannot add city as it is null");
			   System.out.println("cities are full");
		   }		
	 }  
	 return isAdded;
		   
	  }
      public static void getAllCitiesAvailable(){
     System.out.println("Invoking addCity");
	 for(int cityIndex=0;cityIndex<cityNames.length;cityIndex++){
		  String reference=cityNames[cityIndex];
		 System.out.println(reference);
	 }
	System.out.println("End of Invoking");
}	
 
public static boolean updateCityName(String existingCityName, String updatedCityName) {
	boolean isUpdated=false;
	for(int cityIndex=0; cityIndex<cityNames.length; cityIndex++){
		if(cityNames[cityIndex].equals(existingCityName)) {
			cityNames[cityIndex]= updatedCityName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
  
}