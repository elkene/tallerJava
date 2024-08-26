package figuras;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Main myprograma = new Main();
        myprograma.iniciarPrograma();
    }

    public void iniciarPrograma() {
        // Inicializar el método estático, uso el nombre de la clase
        AlmacenDeFiguras.inicializa();

        // Mostrar el menú
        menu();
    }

    private void menu() {
        int opc1=0;
        while (opc1!=4){
            opc1 = Integer.parseInt(JOptionPane.showInputDialog(" MENU \n" +
            "1. Cuadrados \n" +
            "2. Circulos \n" +
            "3. Triangulos \n" + // Nueva opción para mostrar áreas
            "4. Salir \n" +
            "Ingresa un numero entero: "));

            switch (opc1){
            case 1:
                int opc = 0;
                while (opc != 4) { // Ajuste para incluir una opción adicional
                opc = Integer.parseInt(JOptionPane.showInputDialog(" MENU \n" +
                        "1. Crear Cuadrado \n" +
                        "2. Mostrar Cuadrados \n" +
                        "3. Calcular y mostrar áreas \n" + // Nueva opción para mostrar áreas
                        "4. Regresar al menu principal \n" +
                        "Ingresa un numero entero: "));

                switch (opc) {
                    case 1:
                        crearCuadrado();
                        break;

                    case 2:
                        mostrarCuadrados();
                        break;

                    case 3:
                        //calcularYMostrarAreas();
                        break;

                    case 4:
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Ingresa un numero valido...");
                        break;
                }
            }
        }
    }
    
    }
    private void crearCuadrado() {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(Float.parseFloat(JOptionPane.showInputDialog("¿Cuál es el lado del cuadrado?")));
        cuadrado.calculos(); // Realiza los cálculos necesarios
        String mensaje = AlmacenDeFiguras.insertarCuadrado(cuadrado);
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private void mostrarCuadrados() {
        StringBuilder sb = new StringBuilder();
        for (Cuadrado cuadrado : AlmacenDeFiguras.miscuadrados) {
            if (cuadrado != null) {
                sb.append(cuadrado.toString()).append("\n");
            }
        }
        
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No hay cuadrados almacenados.");
        }
    }

    // private void calcularYMostrarAreas() {
    //     // Crear un objeto de cada tipo y realizar cálculos
    //     Cuadrado cuadrado = new Cuadrado();
    //     Circulo circulo = new Circulo();
    //     Triangulo triangulo = new Triangulo();

    //     // Cuadrado
    //     float l = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del lado del cuadrado"));
    //     cuadrado.setLado(l);
    //     cuadrado.calculos();

    //     // Círculo
    //     float diametro = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del diámetro del círculo"));
    //     circulo.setDiametro(diametro);
    //     circulo.calculosC();

    //     // Triángulo
    //     float altura = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de la altura del triángulo"));
    //     float base = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de la base del triángulo"));
    //     float ladoT = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del lado del triángulo"));

    //     triangulo.setAltura(altura);
    //     triangulo.setBase(base);
    //     triangulo.setLado(ladoT);
    //     triangulo.calculosT();

    //     // Mostrar resultados
    //     JOptionPane.showMessageDialog(null, "El valor del área del cuadrado con lado de " + cuadrado.getLado() + " es " + cuadrado.getArea() + 
    //         "\nEl valor del área del círculo con diámetro de " + circulo.getDiametro() + " es " + circulo.getArea() + 
    //         "\nEl valor del área del triángulo con lado de " + triangulo.getLado() + " es " + triangulo.getArea());
    // }
}
