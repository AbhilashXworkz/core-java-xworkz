class ChaiPoint{
  /* static String tea="masala Tea";
   static String tea1="ginger tea";
   static String tea2="lemon tea";
   static String tea3="Black Tea";
   static String tea4="orange tea";
   static String tea5="herbal Tea";
   static String tea6="rose tea";
   static String tea7="white tea";
   static String tea8="tulsi tea";
   static String tea9="chocolate tea";
   static String tea10="rooibos tea";
   static String tea11="mate tea";
   static String tea12="jasmine tea";
   static String tea13="green tea";*/
   static int index;
static String chaiAvailable[] = {/*tea,tea1,tea2,tea3,tea4,tea5,tea6,tea7,tea8,tea9,tea10,tea11,tea12,tea13*/
                                  null,null,null,null,null,null,null,null,null,null,null,null,null,null};
  public static boolean addChai(String chai){
	 
	  boolean isAdded = false;
	   if (chai!=null){
		   chaiAvailable[index]=chai;
		   index++;
			isAdded=true;
			   
		   }else{
		   System.out.println("cannot add chai as it is a null value");
	   }
	  return isAdded;
	  
	  
	  
  }
    public static void getAllChaiAvailable(){
	   System.out.println("invoking get all chai availbale ");
	   for(int chaiIndex=0;chaiIndex<chaiAvailable.length;chaiIndex++){
	      String reference = chaiAvailable[chaiIndex];
	     System.out.println(reference);
		 
	   }
	     System.out.println("End of invoking get all chai availbale ");
	}
	
	}
