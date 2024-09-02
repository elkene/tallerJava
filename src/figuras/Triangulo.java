package figuras;

public class Triangulo extends Figura {
        
    private float base;
    private float altura;

    public void setBase(float base){
        this.base=base;

    } 
    public float getBase(){
        return base;
    }

    public void setAltura(float altura){
        this.altura=altura;

    } 
    public float getAltura(){
        return altura;
    }

   

    public void calculosT(){
        area=(base*altura)/2;
        perimetro=lado*3;
        
    }
    public String toString(){
        return     "\nEl valor del area del triangulo con base de "+getBase()+ " y con altura de "+getAltura() + " es "+getArea();

    }
}
