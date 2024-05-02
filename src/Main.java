//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArticuloMaquillaje rimel= new Rimel("RimelCZ-waterproof","Cyzone");
        System.out.println("El rimel con nombre: "+rimel.getNombre()+" y marca: "+rimel.getMarca());
        rimel.aplicar();
        ArticuloMaquillaje sombras = new PaletaSombras("Lindo Verano", "KCBeauty");
        System.out.println("La paleta de sombras llamada: "+sombras.getNombre()+" y con marca: "+sombras.getMarca());
        sombras.aplicar();

    }
}