package figuras;

public class Cuadrado extends Figura {
    
    public void calculos(){
        area=lado*lado;
        perimetro=lado*4;
        
    }
    public String toString(){
        return "El valor del area del cuadrado con lado de "+getLado()+" es "+getArea();
    }
    
}
