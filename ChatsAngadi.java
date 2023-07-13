class ChatsAngadi{ 

 public static void main(String chat[]){
	  String chatNames[]={"pani puri","samosa","bale puri",};
  getchatNames(chatNames);
 }
 public static void getchatNames(String chatNames[]){
	 System.out.println("Inside getchatsName");
	 for(String chatName:chatNames)
	 {
		 System.out.println(chatName);
	 }
 }
}