import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class forma4 {
    private JButton boton8;
    private JTextField textoField1;
    private JLabel text1Lbl;
    private JLabel resultado1Lbl;
    JPanel seno;

    public forma4() {
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Prueba botton");

                String n1 = textoField1.getText();
                double numero1 = Double.parseDouble(n1);

                // Operation
                double resul1 = Math.cos(Math.toRadians(numero1));

                // Resultado con decimales
                String r1 = String.format("%.2f", resul1);
                resultado1Lbl.setText("Resultado: " + r1);
            }
        });
    }

}



