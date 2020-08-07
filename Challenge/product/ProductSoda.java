package product;

public class ProductSoda extends Product{
    private float litres;

    public ProductSoda(String name, int price, float litres) {
        super(name, price);
        this.litres = litres;
    }

    public float getLitres() {
        return litres;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getName() + " /// Litros: " + this.getLitres() + " /// Precio: $" + this.getPrice();
    }
}
