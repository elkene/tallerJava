package figuras;

public class AlmacenDeFiguras {
    //Cuadrado
    static Cuadrado[] miscuadrados;
    static int indiceCuadrado;

    //Circulo
    static Circulo[] miscirculos;
    static int indiceCirculo;

    //Triangulo
    static Triangulo[] mistriangulos;
    static int indiceTriangulo;

    public static void inicializa() {
        //Cuadrado
        miscuadrados = new Cuadrado[5];
        indiceCuadrado = 0;
        //Circulo
        miscirculos = new Circulo[5];
        //Triangulo  
        mistriangulos = new Triangulo[5];
    }

    public static String insertarCuadrado(Cuadrado cuadrado) {
        if (indiceCuadrado < miscuadrados.length) {
            miscuadrados[indiceCuadrado] = cuadrado;
            indiceCuadrado++;
            return "Cuadrado insertado correctamente";
        } else {
            return "Almacen lleno";
        }
    }
    public static String insertarCirculo(Circulo circulo) {
        if (indiceCirculo < miscirculos.length) {
            miscirculos[indiceCirculo] = circulo;
            indiceCirculo++;
            return "Circulo insertado correctamente";
        } else {
            return "Almacen lleno";
        }
    }

    public static String insertarTriangulo(Triangulo triangulo) {
        if (indiceTriangulo < mistriangulos.length) {
            mistriangulos[indiceTriangulo] = triangulo;
            indiceTriangulo++;
            return "Triangulo insertado correctamente";
        } else {
            return "Almacen lleno";
        }
    }
    
}


