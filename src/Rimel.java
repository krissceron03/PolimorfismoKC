public class Rimel extends ArticuloMaquillaje {
    private String tipoAplicador;

    public Rimel(String nombre, String marca) {
        super(nombre, marca);
    }

    @Override
    public void aplicar(){
        System.out.println("Se aplica en las pestañas");
    }
}
