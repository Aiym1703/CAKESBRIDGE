public class Main{
    public static void main(String[] args) {
        // Choosing cake type
        CakeType chocolateCake = new ChocolateCake();
        CakeType vanillaCake = new VanillaCake();
        Cake weddingChocolateCake = new WeddingCake(chocolateCake);
        weddingChocolateCake.decorate(); // Output: Decorating a Wedding Cake: Baking a Chocolate Cake! With flowers and a wedding message!
        System.out.println();
        Cake birthdayVanillaCake = new BirthdayCake(vanillaCake);
        birthdayVanillaCake.decorate(); // Output: Decorating a Birthday Cake: Baking a Vanilla Cake! With candles and a happy birthday message!
    }
}
