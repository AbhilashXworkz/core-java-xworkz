public class Stationary {
    static String stationaryItem[] = {null, null, null, null, null,null,null,null,};
    static int index;

    public static boolean addStationaryItems(String item) {
        boolean isAdded = false;

        if (item != null) {
            if (index < stationaryItem.length) {
                stationaryItem[index] = item;
                index++;
                isAdded = true;
            } else {
                System.out.println("Cannot add item. Either item is null or maximum capacity reached.");
            }
        } else {
            System.out.println("Cannot add more items. Maximum capacity reached.");
        }

        return isAdded;
    }

    public static boolean updateItemName(String existingItemName, String updatedItemName) {
        boolean isUpdated = false;

        for (int itemIndex = 0; itemIndex < stationaryItem.length; itemIndex++) {
            if (stationaryItem[itemIndex]==existingItemName) {
                stationaryItem[itemIndex] = updatedItemName;
                isUpdated = true;
            }
        }

        return isUpdated;
    }

    public static void getAllstationaryItem() {
        System.out.println("Invoking getAllstationaryItem\n");

        for (int i = 0; i < index; i++) {
            String reference = stationaryItem[i];
            System.out.println("Item: " + reference);
        }

        System.out.println("End of invoking getAllstationaryItem\n");
    }

    public static boolean deleteStationaryItem(String deletedItemName){
        System.out.println("invoking deleteStationaryItem");
       
        boolean isDeleted=false;
        int itemIndex;
        int noofElements=index;

        for(itemIndex=0; itemIndex<index;itemIndex++){
            if(stationaryItem[itemIndex].equals(deletedItemName)){
				isDeleted=true;
                break;
            }
        }

        if(itemIndex<noofElements){
            noofElements=noofElements-1;
        }

        for(int newItemIndex=itemIndex;newItemIndex<noofElements;newItemIndex++){
            stationaryItem[newItemIndex]=stationaryItem[newItemIndex+1];
        }
		index--;
        return isDeleted;

    }
    
    public static void getAllStationaryItemPostDeletetion(){
        for(int itemIndex=0;itemIndex<index; itemIndex++){
            System.out.println(stationaryItem[itemIndex]);
    }
}

  public static String searchStationaryItemByName(String itemName){
	  System.out.println("Invoking searchStationaryItemByName");
	  System.out.println("No of Parameters 1, Type String");
	  String sName = null;
	  for(String name: stationaryItem){
		  if(name.equals(itemName)){
			 sName = name;
			 System.out.println("Item Name found");
		  }  
	  }
return  sName;	  
	  
  }
}