import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class forma4 {
    private JButton bcoseno;
    private JTextField textoField1;
    private JLabel text1Lbl;
    private JLabel resultado1Lbl;
    JPanel seno;
    private JButton bseno;
    private JButton btangente;
    private JButton bsecante;

    // Botton del coseno

    public forma4() {
        // Boton del coseno
        bcoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener el valor del campo de texto
                    String n1 = textoField1.getText();

                    // Validar si el input es un número
                    if (n1.matches("-?\\d+(\\.\\d+)?")) {
                        double numero1 = Double.parseDouble(n1);

                        // Realizar la operación
                        double resul1 = Math.cos(Math.toRadians(numero1));

                        // Resultado con decimales
                        String r1 = String.format("%.2f", resul1);
                        resultado1Lbl.setText("Resultado: " + r1);
                    } else {
                        // Mostrar mensaje de error si no es un número válido
                        resultado1Lbl.setText("Error: Ingrese un número válido");
                    }
                } catch (Exception ex) {
                    // Capturar excepciones generales y mostrar mensaje de error
                    resultado1Lbl.setText("Error: " + ex.getMessage());
                }
            }
        });


        // Boton del Seno
        bseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener el valor del campo de texto
                    String n1 = textoField1.getText();

                    // Validar si el input es un número
                    if (n1.matches("-?\\d+(\\.\\d+)?")) {
                        double numero1 = Double.parseDouble(n1);

                        // Realizar la operación
                        double resul1 = Math.sin(Math.toRadians(numero1));

                        // Resultado con decimales
                        String r1 = String.format("%.2f", resul1);
                        resultado1Lbl.setText("Resultado: " + r1);
                    } else {
                        // Mostrar mensaje de error si no es un número válido
                        resultado1Lbl.setText("Error: Ingrese un número válido");
                    }
                } catch (Exception ex) {
                    // Capturar excepciones generales y mostrar mensaje de error
                    resultado1Lbl.setText("Error: " + ex.getMessage());
                }
            }
        });

        //Boton de la Tangente
        btangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener el valor del campo de texto
                    String n1 = textoField1.getText();

                    // Validar si el input es un número
                    if (n1.matches("-?\\d+(\\.\\d+)?")) {
                        double numero1 = Double.parseDouble(n1);

                        // Validar si el ángulo es un múltiplo de 90 grados
                        if (Math.abs(numero1 % 90) == 0) {
                            resultado1Lbl.setText("Error: Tangente indefinida para ángulos de 90 y 270 grados");
                        } else {
                            // Realizar la operación
                            double resul1 = Math.tan(Math.toRadians(numero1));

                            // Resultado con decimales
                            String r1 = String.format("%.2f", resul1);
                            resultado1Lbl.setText("Resultado: " + r1);
                        }
                    } else {
                        // Mostrar mensaje de error si no es un número válido
                        resultado1Lbl.setText("Error: Ingrese un número válido");
                    }
                } catch (Exception ex) {
                    // Capturar excepciones generales y mostrar mensaje de error
                    resultado1Lbl.setText("Error: " + ex.getMessage());
                }
            }
        });


        // Boton de la Secante
        bsecante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener el valor del campo de texto
                    String n1 = textoField1.getText();

                    // Validar si el input es un número
                    if (n1.matches("-?\\d+(\\.\\d+)?")) {
                        double numero1 = Double.parseDouble(n1);

                        // Validar si el ángulo es un múltiplo de 90 grados
                        if (Math.abs(numero1 % 90) == 0) {
                            resultado1Lbl.setText("Error: Tangente indefinida para ángulos de 90 y 270 grados");
                        } else {
                            // Realizar la operación
                            double resul1 = 1 / Math.cos(Math.toRadians(numero1));

                            // Resultado con decimales
                            String r1 = String.format("%.2f", resul1);
                            resultado1Lbl.setText("Resultado: " + r1);
                        }
                    } else {
                        // Mostrar mensaje de error si no es un número válido
                        resultado1Lbl.setText("Error: Ingrese un número válido");
                    }
                } catch (Exception ex) {
                    // Capturar excepciones generales y mostrar mensaje de error
                    resultado1Lbl.setText("Error: " + ex.getMessage());
                }
            }
        });

    }

}



