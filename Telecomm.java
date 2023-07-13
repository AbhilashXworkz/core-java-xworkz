class Telecomm
{
static String simNames[]={null,null,null,null,null};
static int index;

public static boolean addSim(String sim )
{
boolean isAdded = false;
if(sim!= null)
{

simNames[index] = sim;
index++;
isAdded = true;
}
else
{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllSim()
{
/*for(int sim=0;sim<simNames.length;sim++)
{
String ref=simNames[sim];
System.out.println(ref);*/
for(String simName:simNames)
{
	System.out.println(simName);
}
}


public static boolean updateSimName(String existingSimName,String updatedSimName)
{
	boolean isUpdated=false;
	for(int j=0;j<simNames.length;j++)
	{
		if(simNames[j].equals(existingSimName))
		{
		simNames[j]=updatedSimName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
}