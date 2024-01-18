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
        bcoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Prueba botton2");

                String n1 = textoField1.getText();
                double numero1 = Double.parseDouble(n1);

                // Operation
                double resul1 = Math.cos(Math.toRadians(numero1));

                // Resultado con decimales
                String r1 = String.format("%.2f", resul1);
                resultado1Lbl.setText("Resultado: " + r1);
            }
        });

        // Boton del Seno
        bseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Prueba botton1");

                String n1 = textoField1.getText();
                double numero1 = Double.parseDouble(n1);

                // Operation
                double resul1 = Math.sin(Math.toRadians(numero1));

                // Resultado con decimales
                String r1 = String.format("%.2f", resul1);
                resultado1Lbl.setText("Resultado: " + r1);
            }
        });

        //Boton de la Tangente
        btangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Prueba botton3");

                String n1 = textoField1.getText();
                double numero1 = Double.parseDouble(n1);

                // Operation
                double resul1 = Math.tan(Math.toRadians(numero1));

                // Resultado con decimales
                String r1 = String.format("%.2f", resul1);
                resultado1Lbl.setText("Resultado: " + r1);
            }
        });

        // Boton de la Secante
        bsecante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Prueba botton3");

                String n1 = textoField1.getText();
                double numero1 = Double.parseDouble(n1);

                // Operation
                double resul1 = 1 / Math.cos(Math.toRadians(numero1));

                // Resultado con decimales
                String r1 = String.format("%.2f", resul1);
                resultado1Lbl.setText("Resultado: " + r1);
            }
        });
    }

}



