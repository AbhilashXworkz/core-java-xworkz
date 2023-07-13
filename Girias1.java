class Girias1 {
	static String electronicDevices[] = {"refrigerator" , "Washing Machine" , "Television" , "LED" ,
   "Grinder" , "AC" , "IronBox" ,"MicroWave"};
  static double priceOfElectronicDevices[] = {50000.00 , 40000.00 , 75000.50 , 15000.89 , 8000.60 , 
                                                45000.70 , 0.0 , 6000.45};
public static void main (String args[]){
	
   System.out.println("Main Started");
   
     //System.out.println(electronicDevices[0] + " "+ electronicDevices[2] );
   System.out.println("List Of Electronic Devises Are:");
      //0<8
 // for(int index =0 ; index<electronicDevices.length ; ){
  // System.out.println(electronicDevices[index] );
  // index++;
   

   
   /*for(String electronicDevice : electronicDevices){
	   System.out.println(electronicDevice);
     for(double  priceOfElectronicDevice: priceOfElectronicDevices ){
   System.out.println(priceOfElectronicDevice);  
   }	    
   }*/
   System.out.println("Main Ended");
   getElectronicDevices();
}

public static void getElectronicDevices(){
  for(int index =0 ; index<electronicDevices.length ;  index++){
   System.out.println(electronicDevices[index] );
  }

   for(String electronicDevice : electronicDevices){
	   System.out.println(electronicDevice); 
     for(int  index=0;index< priceOfElectronicDevices.length;index++ ){
		  System.out.println(priceOfElectronicDevices[index]);		    		  						 
	 }
	 }					    
   }
  }
