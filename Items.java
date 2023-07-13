class Items{
	
// 5 vegetables
 static String vegetables[] = {"carrot" ,"Beans" ,"Potato" ,"Brinjal","tomato"};
 
 
  // 10 Biscuits 
  static String biscuits[] = {"Oreo" ,"Gudde" ,"parle" ,"Cream" ,"Marie" ,"Cremica" ,"Bisk Farm" ,"Just Baked" ,"Britania" ,"Scones"};

 
 // 10 Perfumes
 static String perfumes[] = {"Wild Stone" ,"Gucci" ,"Chanel" ,"Tom Ford" ,"Guess" ,"Hugo Boss" , "Francis" ,"Dior" ,"Dolce" ,"Nautica"};

 
 // 10 Groceries 
 static String groceries[] = {"Yogurt" ,"Honey" ,"Flour" ,"Tuna" ,"Lucheon Meat" ,"Sugar" ,"Maida" ,"Rice" ,"Ragi" , "Rava"};

 
 public static void main(String items[]){
	 
  
  System.out.println(" Main Started");
  
  System.out.println("List Of 5 Vegetables");
  
getvegetables();
getbiscuits();
getperfumes();
getgroceries();
  
 
  
 
  System.out.println(" Main Ended");
  
 }
 public static void getvegetables(){
	  System.out.println("List Of 5 Vegetables");
  
 System.out.println( vegetables[0] + " , "+ vegetables[1] +" , " + vegetables[2] +" , " + vegetables[3] + " , "+ vegetables[4] );
	 
 }
 public static void getbiscuits(){
	 System.out.println( biscuits[0]+" ,"+biscuits[1]+", "+biscuits[2]+" , "+biscuits[3]+" ,"+biscuits[4]+" , "+biscuits[5]+",  "+biscuits[6]+" , "+biscuits[7]+"  ,"+biscuits[8]+" , "+biscuits[9] );
  System.out.println("--------------------------------------------------------------------------------------------");
	 
 }
 public static void getperfumes(){
	  System.out.println(perfumes[0]+" , "+perfumes[1]+",  "+perfumes[2]+" , "+perfumes[3]+" , "+perfumes[4]+"  ,"+perfumes[5]+" , "+perfumes[6]+" , "+perfumes[7]+" ,  "+perfumes[8]+"  , "+perfumes[9]);
 System.out.println("-----------------------------------------------------------------------------------------------");
 }
 public static void getgroceries(){
	  System.out.println( groceries[0]+"  ,"+ groceries[1]+" , "+ groceries[2]+",  "+ groceries[3]+" , "+ groceries[4]+" , "+  groceries[5]+" , "+  groceries[6] +" , "+ groceries[7]+" , "+  groceries[8] +" , "+ groceries[9]);

   System.out.println("----------------------------------------------------------------------------------------------");
 }
 
}
