class OlaTester{

public static void main(String in[]) {

double priceOfVechile= Ola.search("Auto");
System.out.println("The price of the vechile is:" +priceOfVechile);

priceOfVechile= Ola.search("Mini car");
System.out.println("The price of the vechile is:" +priceOfVechile);

priceOfVechile= Ola.search("Sedan");
System.out.println("The price of the vechile is:" +priceOfVechile);

priceOfVechile= Ola.search("SUV");
System.out.println("The price of the vechile is:" +priceOfVechile);

priceOfVechile= Ola.search("Prime SUV");
System.out.println("The price of the vechile is:" +priceOfVechile);
} 
}