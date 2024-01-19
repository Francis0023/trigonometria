import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("seno");
        frame.setContentPane(new forma4().seno);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1750,3280);
        frame.pack();
        frame.setVisible(true);

    }
}

// SEno normal
//bseno.addActionListener(new ActionListener() {
//@Override
//public void actionPerformed(ActionEvent e) {
//        System.out.println("Prueba botton1");
//
//        String n1 = textoField1.getText();
//        double numero1 = Double.parseDouble(n1);
//
//        // Operation
//        double resul1 = Math.sin(Math.toRadians(numero1));
//
//        // Resultado con decimales
//        String r1 = String.format("%.2f", resul1);
//        resultado1Lbl.setText("Resultado: " + r1);
//        }
//        });

// Coseno normal

//bcoseno.addActionListener(new ActionListener() {
//@Override
//public void actionPerformed(ActionEvent e) {
//        System.out.println("Prueba botton2");
//
//        String n1 = textoField1.getText();
//        double numero1 = Double.parseDouble(n1);
//
//        // Operation
//        double resul1 = Math.cos(Math.toRadians(numero1));
//
//        // Resultado con decimales
//        String r1 = String.format("%.2f", resul1);
//        resultado1Lbl.setText("Resultado: " + r1);
//        }
//        });
//tangente normal
//btangente.addActionListener(new ActionListener() {
//@Override
//public void actionPerformed(ActionEvent e) {
//        System.out.println("Prueba botton3");
//
//        String n1 = textoField1.getText();
//        double numero1 = Double.parseDouble(n1);
//
//        // Operation
//        double resul1 = Math.tan(Math.toRadians(numero1));
//
//        // Resultado con decimales
//        String r1 = String.format("%.2f", resul1);
//        resultado1Lbl.setText("Resultado: " + r1);
//        }
//        });

// Secante normal
// bsecante.addActionListener(new ActionListener() {
//@Override
//public void actionPerformed(ActionEvent e) {
//        System.out.println("Prueba botton3");
//
//        String n1 = textoField1.getText();
//        double numero1 = Double.parseDouble(n1);
//
//        // Operation
//        double resul1 = 1 / Math.cos(Math.toRadians(numero1));
//
//        // Resultado con decimales
//        String r1 = String.format("%.2f", resul1);
//        resultado1Lbl.setText("Resultado: " + r1);
//        }
//        });

