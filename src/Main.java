public class Main {
    public static void main(String[] args) throws Exception {
        
        Car Audi = new Car("Audi", "A5",2020,2021,
        new Tire ("Firestone",20),
        new Tire ("Firestone",20), 
        new Tire ("Firestone",20),
        new Tire ("Firestone",20),
        new Tire ("Michelin",20));
        
        Car Volvo = new Car("Volvo", "XC40",2021,2022,
        new Tire ("Bridgestone",19),
        new Tire ("Bridgestone",19), 
        new Tire ("Bridgestone",19),
        new Tire ("Bridgestone",19),
        new Tire ("Pireli",19));
        
        Car Tesla = new Car("Tesla","Model S Plaid",2022,2022,
        new Tire ("Goodyear",20),
        new Tire ("Goodyear",20), 
        new Tire ("Goodyear",20),
        new Tire ("Goodyear",20),
        new Tire ("Firestone",20));

        System.out.println(Audi);
        System.out.println(Volvo);
        System.out.println(Tesla);
    }
}