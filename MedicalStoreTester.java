class MedicalstoreTester
{
public static void main(String medicine[])
{
//Medicine.getMedicineName();
MedicalStore.addMedicine("acetaminophen");
MedicalStore.addMedicine("cipla");
MedicalStore.addMedicine("amlodipine");
MedicalStore.addMedicine("aspirin");
MedicalStore.addMedicine("naproxen");
MedicalStore.addMedicine("diazepam");
MedicalStore.addMedicine("loratadine");
MedicalStore.addMedicine("ativan");
MedicalStore.addMedicine("amoxicillin");
MedicalStore.addMedicine("spironolactone");



boolean value=MedicalStore.updateMedicineName("acetaminophen","acetaminop");
System.out.println(value);
boolean value1=MedicalStore.updateMedicineName("cipla"," cip ");
System.out.println(value1);

boolean value2=MedicalStore.updateMedicineName("amlodipine","amlod");
System.out.println(value2);

boolean value3=MedicalStore.updateMedicineName("aspirin","aspir");
System.out.println(value3);

boolean value4=MedicalStore.updateMedicineName("naproxen","naprox");
System.out.println(value4);


MedicalStore.getAllMedicine();
}
}