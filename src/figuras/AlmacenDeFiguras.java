package figuras;

public class AlmacenDeFiguras {
    //Cuadrado
    private static Cuadrado[] miscuadrados;
    private static int indiceCuadrado;

    //Circulo
    private static Circulo[] miscirculos;
    private static int indiceCirculo;

    //Triangulo
    private static Triangulo[] mistriangulos;
    private static int indiceTriangulo;

    // Getters y Setters
    public static Cuadrado[] getMisCuadrados() {
        return miscuadrados;
    }

    public static void setMisCuadrados(Cuadrado[] misCuadrados) {
        AlmacenDeFiguras.miscuadrados = misCuadrados;
    }

    public static int getIndiceCuadrado() {
        return indiceCuadrado;
    }

    public static void setIndiceCuadrado(int indiceCuadrado) {
        AlmacenDeFiguras.indiceCuadrado = indiceCuadrado;
    }

    public static Circulo[] getMisCirculos() {
        return miscirculos;
    }

    public static void setMisCirculos(Circulo[] misCirculos) {
        AlmacenDeFiguras.miscirculos = misCirculos;
    }

    public static int getIndiceCirculo() {
        return indiceCirculo;
    }

    public static void setIndiceCirculo(int indiceCirculo) {
        AlmacenDeFiguras.indiceCirculo = indiceCirculo;
    }

    public static Triangulo[] getMisTriangulos() {
        return mistriangulos;
    }

    public static void setMisTriangulos(Triangulo[] misTriangulos) {
        AlmacenDeFiguras.mistriangulos = misTriangulos;
    }

    public static int getIndiceTriangulo() {
        return indiceTriangulo;
    }

    public static void setIndiceTriangulo(int indiceTriangulo) {
        AlmacenDeFiguras.indiceTriangulo = indiceTriangulo;
    }

    public static void inicializa() {
        //Cuadrado
        setMisCuadrados(new Cuadrado[5]);
        setIndiceCuadrado(0);
        //Circulo
        setMisCirculos(new Circulo[5]);
        setIndiceCirculo(0);
        //Triangulo  
        setMisTriangulos(new Triangulo[5]);
        setIndiceTriangulo(0);
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


