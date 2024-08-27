package figuras;

public class Cuadrado {

    //Atributos
    private float lado;
    private float area;
    private float perimetro;

    //constructor
    //vamos a usar el default

    //metodos

    public void setLado(float lado){
        this.lado=lado;

    } 
    public float getLado(){
        return lado;
    }

    public float getArea(){
        return area;
    }

    public float getPerimetro(){
        return perimetro;
    }
    
    public void calculos(){
        area=lado*lado;
        perimetro=lado*4;
        
    }
    public String toString(){
        return "El valor del area del cuadrado con lado de "+getLado()+" es "+getArea();
    }
    
}
