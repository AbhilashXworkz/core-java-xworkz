class Ola{
    
    public static double search(String vechileType) {
        
        if("Auto"==vechileType) {
            System.out.println("The type of vechile is:" +vechileType);
            return 197.89;
        }
        
        if("Mini car"==vechileType) {
            System.out.println("The type of the vechile is:" +vechileType);
            return 200.89;
        }
        
        if("Sedan"==vechileType) {
            System.out.println("The type of the evchile is:" +vechileType);
            return 250.70;
        }
        
        if("SUV"==vechileType) {
            System.out.println("The type of vechile is:" +vechileType);
            return 300.90;
        }
        
        if("Prime SUV"==vechileType) {
            System.out.println("The type of vechile is:" +vechileType);
            return 350.87;
        }
		return 0.0;
	}
}