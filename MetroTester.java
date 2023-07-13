class MetroTester
{
public static void main(String station[])
{
//Metro.getStationName();
Metro.addStation("peenya industry");
Metro.addStation("yeshwanthpur");
Metro.addStation("goraguntepalya");
Metro.addStation("mahalakshi layout");
Metro.addStation("majestic");
Metro.addStation("banashankari");
Metro.addStation("rajajinagar");


boolean value=Metro.updateStationName("peenya industry","peenya ");
System.out.println(value);
boolean value1=Metro.updateStationName("yeshwanthpur","yeshwanth pur ");
System.out.println(value1);

boolean value2=Metro.updateStationName("goraguntepalya","goragunte pallya");
System.out.println(value2);

boolean value3=Metro.updateStationName("goraguntepalya ","goragunte pallya");
System.out.println(value3);

boolean value4=Metro.updateStationName("majestic"," majastic");
System.out.println(value4);

boolean value5=Metro.updateStationName("banashankari","Banashankari ");
System.out.println(value5);

Metro.getAllStation();
}
}