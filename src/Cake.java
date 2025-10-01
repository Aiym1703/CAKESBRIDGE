// Abstract class for Cake, holds a reference to CakeType
abstract class Cake {
    protected CakeType cakeType;

    // Constructor accepts CakeType as an implementation
    public Cake(CakeType cakeType) {
        this.cakeType = cakeType;
    }

    // Abstract method for decorating the cake
    public abstract void decorate();
}