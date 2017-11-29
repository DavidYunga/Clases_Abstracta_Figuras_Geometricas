/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PrincipalFigura {

    public static void main(String[] args) {

        boolean d = true;

        do {
            int menu = JOptionPane.showOptionDialog(null, "Calcular Area y Perimetro, Figuras Geometricas",
                    "UNL", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                    new Object[]{"Rectangulo",
                        "Circulo",
                        "Triangulo",
                        "Salir del programa."}, null);

            switch (menu) {
                case 0:
                    double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura"));
                    Rectangulo rec = new Rectangulo(base, altura);
                    JOptionPane.showMessageDialog(null, "Rectangulo:\n Area: " + rec.area() + "\nPerimetro: " + rec.perimetro(), "Figuras Geometricas", JOptionPane.QUESTION_MESSAGE);
                    break;
                case 1:
                    double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese radio del circulo"));
                    Circulo rad = new Circulo(radio);
                    JOptionPane.showMessageDialog(null, "Circulo:\n Area: " + rad.area() + "\nPerimetro: " + rad.perimetro(), "Figuras Geometricas", JOptionPane.QUESTION_MESSAGE);
                    break;
                case 2:
                    double bas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base"));
                    double altur = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura"));
                    Triangulo tri = new Triangulo(bas, altur);
                    JOptionPane.showMessageDialog(null, "Triangulo:\n Area: " + tri.area() + "\nPerimetro: " + tri.perimetro(), "Figuras Geometricas", JOptionPane.QUESTION_MESSAGE);
                    break;
                case 3:
                    d = false;
                    break;
            }
        } while (d == true);
    }
}
