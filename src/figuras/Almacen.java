package figuras;

public class Almacen {
    private static Figura misFiguras[]=new Figura[10];
    private static int indice;


    public static String insertar (Figura f){
        if (indice<misFiguras.length){
            misFiguras[indice]=f;
            indice++;
            return "Figura ingresada";
        }else
        return "almacen lleno";
    }

    public static Figura[] getmisFiguras(){
        return misFiguras;
    }
    public static void setmisFiguras(Figura[] misFiguras){
        Almacen.misFiguras=misFiguras;
    }
}