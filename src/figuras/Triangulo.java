package figuras;

public class Triangulo {


    private float area;
    private float perimetro;
    private float base;
    private float altura;
    private float lado;

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
    
    public void calculosT(){
        area=(base*altura)/2;
        perimetro=lado*3;
        
    }
    public String toString(){
        return     "\nEl valor del area del triangulo con base de "+getBase()+ " y con altura de "+getAltura() + " es "+getArea();

    }
}
