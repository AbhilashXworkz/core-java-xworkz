public static void main(String args[]){


Satellite sat=new Satellite();
sat.satelliteName="RISAT2";
sat.type="RadarSatellite";
sat.isSolarPanels=false;
sat.price=400000.0;
System.out.println("The first Satellite is:");
System.out.println(sat.satelliteName +" "+sat.type +" "+sat.isSolarPanels +" "+sat.price);

Satellite sat1=new Satellite();
sat1.satelliteName="RISAT1";
sat1.type="RemoteSensing";
sat1.isSolarPanels=true;
sat1.price=200000.0;
System.out.println("The second Satellite is:");
System.out.println(sat1.satelliteName +" "+sat1.type +" "+sat1.isSolarPanels +" "+sat1.price);

Satellite sat2=new Satellite();
sat2.satelliteName="IRNSS-1D";
sat2.type="NavigationSystem";
sat2.isSolarPanels=false;
sat2.price=15000000.0;
System.out.println("The third Satellite is:");
System.out.println(sat2.satelliteName +" "+sat2.type +" "+sat2.isSolarPanels +" "+sat2.price);

Satellite sat3=new Satellite();
sat3.satelliteName="SARAL";
sat3.type="CommunicationSystem";
sat3.isSolarPanels=true;
sat3.price=3500000.0;
System.out.println("The fourth Satellite is:");
System.out.println(sat3.satelliteName +" "+sat3.type +" "+sat3.isSolarPanels +" "+sat3.price);

Satellite sat4=new Satellite();
sat4.satelliteName="GSAT-4";
sat4.type="ObservationSystem";
sat4.isSolarPanels=false;
sat4.price=700000.0;
System.out.println("The fifth Satellite is:");
System.out.println(sat4.satelliteName +" "+sat4.type +" "+sat4.isSolarPanels +" "+sat4.price);

Satellite sat5=new Satellite();
sat5.satelliteName="INSAT-4CR";
sat5.type="HighTransponderSystem";
sat5.isSolarPanels=true;
sat5.price=1100000.0;
System.out.println("The sixth Satellite is:");
System.out.println(sat5.satelliteName +" "+sat5.type +" "+sat5.isSolarPanels +" "+sat5.price);

Satellite sat6=new Satellite();
sat6.satelliteName="CARTOSAT-2";
sat6.type="SunSyncronousSystem";
sat6.isSolarPanels=false;
sat6.price=2200000.0;
System.out.println("The seventh Satellite is:");
System.out.println(sat6.satelliteName +" "+sat6.type +" "+sat6.isSolarPanels +" "+sat6.price);

Satellite sat7=new Satellite();
sat7.satelliteName="GSAT-14";
sat7.type="In-OrbitCapacity";
sat7.isSolarPanels=true;
sat7.price=100000.0;
System.out.println("The eighth Satellite is:");
System.out.println(sat7.satelliteName +" "+sat7.type +" "+sat7.isSolarPanels +" "+sat7.price);

Satellite sat8=new Satellite();
sat8.satelliteName="IRNSS-1E";
sat8.type="ReginolNavigationalSystem";
sat8.isSolarPanels=true;
sat8.price=8800000.0;
System.out.println("The ninth Satellite is:");
System.out.println(sat8.satelliteName +" "+sat8.type +" "+sat8.isSolarPanels +" "+sat8.price);

Satellite sat9=new Satellite();
sat9.satelliteName="GSAT-16";
sat9.type="SignalSystem";
sat9.isSolarPanels=true;
sat9.price=9900000.0;
System.out.println("The tenth Satellite is:");
System.out.println(sat9.satelliteName +" "+sat9.type +" "+sat9.isSolarPanels +" "+sat9.price);
}
}