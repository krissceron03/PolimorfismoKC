public class PaletaSombras extends ArticuloMaquillaje {
    private int numSombras;
    public PaletaSombras(String nombre, String marca) {
        super(nombre, marca);
    }
    @Override
    public void aplicar(){
        System.out.println("Se aplica en los párpados");
    }
}
