public abstract class ArticuloMaquillaje {
    private String nombre;
    private String marca;

    public ArticuloMaquillaje(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void aplicar();
}
