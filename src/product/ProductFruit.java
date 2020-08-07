package product;

public class ProductFruit extends Product {
    private String unit;

    public ProductFruit(String name, int price, String unit) {
        super(name, price);
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getName() + " /// Precio: $" + this.getPrice() + " /// Unidad de venta: " + this.getUnit();
    }
}
