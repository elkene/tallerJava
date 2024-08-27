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
        int opc1 = 0;
        while (opc1 != 4) {
            opc1 = Integer.parseInt(JOptionPane.showInputDialog(" MENU \n" +
                "1. Cuadrados \n" +
                "2. Círculos \n" +
                "3. Triángulos \n" +
                "4. Salir \n" +
                "Ingresa una opción: "));
    
            switch (opc1) {
                case 1:
                    int opc = 0;
                    while (opc != 3) {
                        opc = Integer.parseInt(JOptionPane.showInputDialog(" MENU \n" +
                            "1. Crear Cuadrado \n" +
                            "2. Mostrar Cuadrados \n" +
                            "3. Regresar al menú principal \n" +
                            "Ingresa una opción: "));
    
                        switch (opc) {
                            case 1:
                                crearCuadrado();
                                break;
    
                            case 2:
                                mostrarCuadrados();
                                break;
    
                            case 3:
                                break;
    
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresa un número válido...");
                                break;
                        }
                    }
                    break;
    
                case 2:
                    int opc3 = 0;
                    while (opc3 != 3) {
                        opc3 = Integer.parseInt(JOptionPane.showInputDialog(" MENU \n" +
                            "1. Crear Círculo \n" +
                            "2. Mostrar Círculos \n" +
                            "3. Regresar al menú principal \n" +
                            "Ingresa una opción: "));
    
                        switch (opc3) {
                            case 1:
                                crearCirculo();
                                break;
    
                            case 2:
                                mostrarCirculo();
                                break;
    
                            case 3:
                                break;
    
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresa un número válido...");
                                break;
                        }
                    }
                    break;
    
                case 3:
                    int opc4 = 0;
                    while (opc4 != 3) {
                        opc4 = Integer.parseInt(JOptionPane.showInputDialog(" MENU \n" +
                            "1. Crear Triángulo \n" +
                            "2. Mostrar Triángulos \n" +
                            "3. Regresar al menú principal \n" +
                            "Ingresa una opción: "));
    
                        switch (opc4) {
                            case 1:
                                crearTriangulo();
                                break;
    
                            case 2:
                                mostrarTriangulo();
                                break;
    
                            case 3:
                                break;
    
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresa un número válido...");
                                break;
                        }
                    }
                    break;
    
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
    
                default:
                    JOptionPane.showMessageDialog(null, "Ingresa un número válido...");
                    break;
            }
        }
    }

    //Metodos 
    private void crearCuadrado() {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(Float.parseFloat(JOptionPane.showInputDialog("¿Cuál es el lado del cuadrado?")));
        cuadrado.calculos(); // Realiza los cálculos necesarios
        String mensaje = AlmacenDeFiguras.insertarCuadrado(cuadrado);
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private void mostrarCirculo() {
        StringBuilder sb = new StringBuilder();
        for (Circulo circulo : AlmacenDeFiguras.miscirculos) {
            if (circulo != null) {
                sb.append(circulo.toString()).append("\n");
            }
        }
        
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No hay cuadrados almacenados.");
        }
    }

    private void crearCirculo() {
        Circulo circulo = new Circulo();
        circulo.setDiametro(Float.parseFloat(JOptionPane.showInputDialog("¿Cuál es el diametro del circulo?")));
        circulo.calculosC(); // Realiza los cálculos necesarios
        String mensaje = AlmacenDeFiguras.insertarCirculo(circulo);
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
            JOptionPane.showMessageDialog(null, "No hay circulos almacenados.");
        }
    }
    private void crearTriangulo() {
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(Float.parseFloat(JOptionPane.showInputDialog("¿Cuál es la altura del triangulo?")));
        triangulo.setBase(Float.parseFloat(JOptionPane.showInputDialog("¿Cuál es la base del triangulo?")));
        triangulo.calculosT(); // Realiza los cálculos necesarios
        String mensaje = AlmacenDeFiguras.insertarTriangulo(triangulo);
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private void mostrarTriangulo() {
        StringBuilder sb = new StringBuilder();
        for (Triangulo triangulo : AlmacenDeFiguras.mistriangulos) {
            if (triangulo != null) {
                sb.append(triangulo.toString()).append("\n");
            }
        }
        
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No hay triangulos almacenados.");
        }
    }

    
}
