class Metro
{
static String stationNames[]={null,null,null,null,null,null,null};
static int index;

public static boolean addStation(String station )
{
boolean isAdded = false;
if(station!= null)
{
stationNames[index] = station;
index++;
isAdded = true;
}
else
{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllStation()
{
/*for(int station=0;station<stationNames.length;station++)
{
String ref=stationNames[station];
System.out.println(ref);*/
for(String stationName:stationNames)
{
	System.out.println(stationName);
}
}

public static boolean updateMetroName(String existingStationName,String updatedStationName)
{
	boolean isUpdated=false;
	for(int j=0;j<stationNames.length;j++)
	{
		if(stationNames[j].equals(existingStationName))
		{
		stationNames[j]=updatedStationName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
}