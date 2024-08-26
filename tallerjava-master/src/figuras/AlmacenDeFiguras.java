package figuras;

public class AlmacenDeFiguras {
    static Cuadrado[] miscuadrados;
    static Circulo[] miscirculos;
    static Triangulo[] mistriangulos;
    static int indiceCuadrado;  

    public static void inicializa() {
        miscuadrados = new Cuadrado[5];
        miscirculos = new Circulo[5];  // Agregar inicialización de los otros arrays si se necesitan
        mistriangulos = new Triangulo[5];
        indiceCuadrado = 0;
    }

    public static String insertarCuadrado(Cuadrado c) {
        if (indiceCuadrado < miscuadrados.length) {
            miscuadrados[indiceCuadrado] = c;
            indiceCuadrado++;
            return "Cuadrado insertado correctamente";
        } else {
            return "Almacen lleno";
        }
    }
    
}


