public class DescubrirPrecioAntesDelDescuento {
    public static void main(String[] args) {
        float valorPantalones     = 34;
        float descuentoPantalones = 15 / 100;
        float valorOriginalPantalones = valorPantalones / (1 - descuentoPantalones);

        System.out.println("El valor real de los pantalones es: "+valorOriginalPantalones+"€");
    }
}
