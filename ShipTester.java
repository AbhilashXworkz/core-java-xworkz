class ShipTester {
    public static void main(String s[]){
        Ship ship1 = new Ship();
        ship1.name = "Titanic";
        ship1.yearBuilt = 1912;
        ship1.length = 269.1; // in meters
        ship1.country = "United Kingdom";
        ship1.type = "Passenger Ship";
        ship1.captain = "Edward John Smith";
        ship1.displayInfo();
        System.out.println(ship1.name + "\n" + ship1.yearBuilt + "\n" + ship1.length + "\n" + ship1.country + "\n" + ship1.type + "\n" + ship1.captain);

        Ship ship2 = new Ship();
        ship2.name = "Queen Mary 2";
        ship2.yearBuilt = 2003;
        ship2.length = 345.03; // in meters
        ship2.country = "United Kingdom";
        ship2.type = "Passenger Ship";
        ship2.captain = "Kevin Oprey";
        ship2.displayInfo();
        System.out.println(ship2.name + "\n" + ship2.yearBuilt + "\n" + ship2.length + "\n" + ship2.country + "\n" + ship2.type + "\n" + ship2.captain);

        Ship ship3 = new Ship();
        ship3.name = "USS Enterprise (CVN-65)";
        ship3.yearBuilt = 1960;
        ship3.length = 342.3; // in meters
        ship3.country = "United States";
        ship3.type = "Aircraft Carrier";
        ship3.captain = "Captain J. C. Harvey, Jr.";
        ship3.displayInfo();
        System.out.println(ship3.name + "\n" + ship3.yearBuilt + "\n" + ship3.length + "\n" + ship3.country + "\n" + ship3.type + "\n" + ship3.captain);

        Ship ship4 = new Ship();
        ship4.name = "Bismarck";
        ship4.yearBuilt = 1936;
        ship4.length = 251.0; // in meters
        ship4.country = "Germany";
        ship4.type = "Battleship";
        ship4.captain = "Captain Ernst Lindemann";
        ship4.displayInfo();
        System.out.println(ship4.name + "\n" + ship4.yearBuilt + "\n" + ship4.length + "\n" + ship4.country + "\n" + ship4.type + "\n" + ship4.captain);

        Ship ship5 = new Ship();
        ship5.name = "Oasis of the Seas";
        ship5.yearBuilt = 2009;
        ship5.length = 360.0; // in meters
        ship5.country = "Bahamas";
        ship5.type = "Cruise Ship";
        ship5.captain = "Captain Sverre Ryan";
        ship5.displayInfo();
        System.out.println(ship5.name + "\n" + ship5.yearBuilt + "\n" + ship5.length + "\n" + ship5.country + "\n" + ship5.type + "\n" + ship5.captain);

        Ship ship6 = new Ship();
        ship6.name = "SS Great Eastern";
        ship6.yearBuilt = 1858;
        ship6.length = 211.8; // in meters
        ship6.country = "United Kingdom";
        ship6.type = "Steamship";
        ship6.captain = "Captain Robert Halpin";
        ship6.displayInfo();
        System.out.println(ship6.name + "\n" + ship6.yearBuilt + "\n" + ship6.length + "\n" + ship6.country + "\n" + ship6.type + "\n" + ship6.captain);

        Ship ship7 = new Ship();
        ship7.name = "USS Constitution";
        ship7.yearBuilt = 1797;
        ship7.length = 62.3; // in meters
        ship7.country = "United States";
        ship7.type = "Frigate";
        ship7.captain = "Captain Isaac Hull";
        ship7.displayInfo();
        System.out.println(ship7.name + "\n" + ship7.yearBuilt + "\n" + ship7.length + "\n" + ship7.country + "\n" + ship7.type + "\n" + ship7.captain);

        Ship ship8 = new Ship();
        ship8.name = "HMS Victory";
        ship8.yearBuilt = 1765;
        ship8.length = 69.3; // in meters
        ship8.country = "United Kingdom";
        ship8.type = "First-rate Ship of the Line";
        ship8.captain = "Admiral Lord Nelson";
        ship8.displayInfo();
        System.out.println(ship8.name + "\n" + ship8.yearBuilt + "\n" + ship8.length + "\n" + ship8.country + "\n" + ship8.type + "\n" + ship8.captain);

        Ship ship9 = new Ship();
        ship9.name = "RMS Lusitania";
        ship9.yearBuilt = 1906;
        ship9.length = 239.0; // in meters
        ship9.country = "United Kingdom";
        ship9.type = "Ocean Liner";
        ship9.captain = "Captain William Thomas Turner";
        ship9.displayInfo();
        System.out.println(ship9.name + "\n" + ship9.yearBuilt + "\n" + ship9.length + "\n" + ship9.country + "\n" + ship9.type + "\n" + ship9.captain);

        Ship ship10 = new Ship();
        ship10.name = "USS Nimitz";
        ship10.yearBuilt = 1972;
        ship10.length = 333.0; // in meters
        ship10.country = "United States";
        ship10.type = "Aircraft Carrier";
        ship10.captain = "Captain Max Clark";
        ship10.displayInfo();
        System.out.println(ship10.name + "\n" + ship10.yearBuilt + "\n" + ship10.length + "\n" + ship10.country + "\n" + ship10.type + "\n" + ship10.captain);
    }
}