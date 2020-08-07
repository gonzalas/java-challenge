package product;

public class ProductShampoo extends Product{
    private int mililitres;

    public ProductShampoo(String name, int price, int mililitres) {
        super(name, price);
        this.mililitres = mililitres;
    }

    public int getMililitres() {
        return mililitres;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getName() + " /// Contenido: " + this.getMililitres() + "ml /// Precio: $" + this.getPrice();
    }
}
