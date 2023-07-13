class TravellAgency
{
static String touristNames[]={null,null,null,null,null,null,null,null};
static int index;

public static boolean addTourist(String tourist )
{
boolean isAdded = false;
if(tourist!= null)
{
touristNames[index] = tourist;
index++;
isAdded = true;
}
else
{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllTourist()
{
/*for(int tourist =0;tourist<touristNames.length;tourist++)
{
String ref=touristNames[tourist];
System.out.println(ref);*/
for(String touristName:touristNames)
{
	System.out.println(touristName);
}
}


public static boolean updateTouristName(String existingTouristName,String updatedTouristName)
{
	boolean isUpdated=false;
	for(int j=0;j<touristNames.length;j++)
	{
		if(touristNames[j].equals(existingTouristName))
		{
		touristNames[j]=updatedTouristName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
}