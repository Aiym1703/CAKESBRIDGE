// Concrete abstraction for Birthday Cake
class BirthdayCake extends Cake {

    public BirthdayCake(CakeType cakeType) {
        super(cakeType);
    }

    @Override
    public void decorate() {
        System.out.print("Decorating a Birthday Cake: ");
        cakeType.bakeCake();  // Calls the bake method of the specific cake type
        System.out.println("With candles and a happy birthday message!");
    }
}