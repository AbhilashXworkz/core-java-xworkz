class StationaryTester{
	public static void main(String st[]){
	//create, save, add
	Stationary.addStationaryItems("Books");
	Stationary.addStationaryItems("Pencil");
	Stationary.addStationaryItems("Pen");
	Stationary.addStationaryItems("Chart");
	Stationary.addStationaryItems("Copy");
	Stationary.addStationaryItems("Sharpner");
	Stationary.addStationaryItems("Ruler");
	Stationary.addStationaryItems("Rubber");
	Stationary.getAllstationaryItem();
	String stationaryName = Stationary.searchStationaryItemByName("Sharpner");
	System.out.println("The found stationary Item is :" + stationaryName);
	
	//read, get, fetch
	// Stationary.getAllStationaryItems();
	//update, edit
	// Stationary.editStationaryItemName();
	// Stationary.getAllStationaryItems();
	//Stationary.getAllStationaryItem();
	Stationary.updateItemName("Rubber","Eraser");
	Stationary.getAllstationaryItem();
	
	Stationary.deleteStationaryItem("chart");
	Stationary.getAllStationaryItemPostDeletetion();
	}
}