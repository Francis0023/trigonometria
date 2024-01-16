import java.util.Scanner;

public class trigono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ángulo en grados: ");
        double angle = scanner.nextDouble();

        double sine = Math.sin(Math.toRadians(angle));
        double cosine = Math.cos(Math.toRadians(angle));
        double tangent = Math.tan(Math.toRadians(angle));

        System.out.println("El seno de " + angle + " grados es: " + sine);
        System.out.println("El coseno de " + angle + " grados es: " + cosine);
        System.out.println("La tangente de " + angle + " grados es: " + tangent);
    }
}