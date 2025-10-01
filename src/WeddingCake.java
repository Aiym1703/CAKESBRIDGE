// Concrete abstraction for Wedding Cake
class WeddingCake extends Cake {

    public WeddingCake(CakeType cakeType) {
        super(cakeType);
    }

    @Override
    public void decorate() {
        System.out.print("Decorating a Wedding Cake: ");
        cakeType.bakeCake();
        System.out.println("With flowers and a wedding message!");
    }
}
