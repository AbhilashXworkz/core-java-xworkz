class Speaker1{
  static String name = "JBL";
  static int minVolume;
  static  int maxVolume=30;
  static  int currentVolume;
  static  boolean isConnected;
   
   public static boolean onOrOff(){
	   System.out.println("Invoking onOrOff");
	   System.out.println("parameter"+ 0);
	   if(isConnected==false){
		   isConnected=true;
		   System.out.println("Speaker is turned On Enjoy");
		   
	   }else if(isConnected==true){
		   isConnected=false;
		   System.out.println("Speaker is turned OFF");
	   }
	   return isConnected;
   }
   //increase
   
  public static void increaseVolume(){
	  	 System.out.println("Invoking IncreaseVolume()");
		 System.out.println("list of parameters"+ 1);
	   if(isConnected==true){
		   
		  if(currentVolume<maxVolume){
		  currentVolume=currentVolume+1;
			  System.out.println("The current Volume is " + currentVolume);
		  } else{
			  System.out.println("Maximum Volume Reached");
		  }
		   
	  }else{
		   System.out.println("Goobe turn on madu first");
	   }
	   }
	   
    //decrease
    public static void decreaseVolume(){
		 System.out.println("Invoking decreaseVolume()");
		 System.out.println("list of parameters"+ 2);
	   if(isConnected==true){
		  if(currentVolume>minVolume){
		  currentVolume=currentVolume-1;
			  System.out.println("The current Volume is " + currentVolume);
		  } else{
			  System.out.println("Minimum Volume Reached");
		  }
		   
	  }else{
		   System.out.println("turn off can't decreaseVolume");
	   }
	   
	    System.out.println("End of Decrease volume");
   }
}