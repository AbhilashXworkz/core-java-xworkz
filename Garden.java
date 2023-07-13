class Garden{
    static int index;
   static String flowersAvailable[]={null,null,null,null,null,null,null,null};
   
    public static boolean addFlowers(String flower){
	 boolean isFlower=false;
	  if(flower!=null){
	  flowersAvailable[index]=flower;
	  index++;
	   isFlower=true;
	  }else{
	  System.out.println("Cannot add flowers ");
	  }
	return isFlower;
	}
	public static void getAllFlowers(){
	   for(int flowerIndex=0;flowerIndex<flowersAvailable.length;flowerIndex++){
	   String refernce = flowersAvailable[flowerIndex];
	   System.out.println(refernce);
	   }
	
	}
}