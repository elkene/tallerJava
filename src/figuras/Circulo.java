package figuras;
public class Circulo extends Figura {
    private float diametro;
    private float radio;

    public void setDiametro(float diametro){
        this.diametro = diametro;
        this.radio = diametro / 2;
    }

    public float getDiametro(){
        return diametro;
    }

    public float getRadio(){
        return radio;
    }

    public void calculosC(){
        area = (float)(Math.PI * (radio * radio));
        perimetro = (float)(Math.PI * diametro);
        
    }
    public String toString(){
        return "\nEl valor del area del circulo con diametro de "+getDiametro()+" es "+getArea();
    }
}
