public class Supermarket2{
     
    static String vegetables[] ={"potato", "carrot", "beans", "badaneakyi", "onion"};
    static String biscuits[] = {"oreo", "Parle-G", "bourbon", "good day", "krack hack", "krack hack", "dark fantasy", "jimjam", "sunfeast", "marie gold"};
    static String perfumes[] = {"Chanel No. 5", "Dior Sauvage", "Versace Bright Crystal", "Paco Rabanne 1 Million", "Giorgio Armani Acqua di Gio", "park avenue", "villion", "fog", "engage", "man"};
    static String groceries[]= {"rice", "pasta", "bread", "milk", "eggs", "sugar", "salt", "coffee", "tea", "flour"};
    static String alcohols[] = {"Whiskey","Vodka","Rum","Gin","Tequila", "Beer", "Wine","Champagne", "Brandy", "Sake","Scotch","Bourbon","Cognac",
        "Absinthe","Martini","Mojito", "Margarita","Piña Colada","Old Fashioned", "Negroni","Manhattan","Bloody Mary","Cosmopolitan","Screwdriver",
        "Long Island Iced Tea","Irish Coffee", "White Russian", "Mimosa","Bellini","Caipirinha"};
    
        public static void main(String[] args) {
   
    getvegetables();
	getbiscuits();
	getperfumes();
	getgroceries();
	getalcohols();
    }


public static void getvegetables()
{
    for(String  vegetable:vegetables){
            System.out.println(vegetable);
        }
     
}
public static void getbiscuits() {
    for(String biscuit:biscuits){
            System.out.println(biscuit);
        }
}
public static void getperfumes() {
    for(String perfume:perfumes){
         System.out.println(perfume);
       }
}

public static void   getgroceries() {
    
     for(String grocerie:groceries){
            System.out.println(grocerie);
         }
}
public static void getalcohols() {
   for(String alcohol:alcohols){
            System.out.println(alcohol);
        }
}
}