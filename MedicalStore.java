class MedicalStore
{
static String medicineNames[]={null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addMedicine(String medicine )
{
boolean isAdded = false;
if(medicine!= null)
{
medicineNames[index] = medicine;
index++;
isAdded = true;
}
else
{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllMedicine()
{
/*for(int medicine =0;medicine<medicineNames.length;medicine++)
{
String ref=medicineNames[medicine];
System.out.println(ref);*/

for(String medicineName:medicineNames)
{
	System.out.println(medicineName);
}
}


public static boolean updateMedicineName(String existingMedicineName,String updatedMedicineName)
{
	boolean isUpdated=false;
	for(int j=0;j<medicineNames.length;j++)
	{
		if(medicineNames[j].equals(existingMedicineName))
		{
		medicineNames[j]=updatedMedicineName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
}