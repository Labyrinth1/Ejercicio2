import java.awt.*;
import java.text.DecimalFormat;
import java.util.Scanner;

    class DetalleDeFactura {
    public static double calcularIVA(double p) {
        double IVA;
        IVA = p * 0.190;
        return IVA;

    }
    public static void main(String[] args) {
        // El resultado de lo que va a aparecer en pantalla
        Scanner lector = new Scanner(System.in);
        double PrecioDeLaCompra, IVA;

        // Aquí tengo que insertar manualmente el precio del producto para calcular 19%.
        System.out.println("Insertar precio del producto: ");
        PrecioDeLaCompra = lector.nextDouble();

        IVA = calcularIVA(PrecioDeLaCompra);

        // Esto me muestra el porcentaje del IVA
        System.out.println("IVA: "+(IVA % PrecioDeLaCompra)) ;

        // Me muestra el valor del producto SIN IVA, que es el mismo que he insertado manualmente.
        System.out.println("Total sin IVA: " +PrecioDeLaCompra);

        // Me muestra el valor del producto con IVA INCLUIDO.
        System.out.println("Total (IVA incluido): "+(PrecioDeLaCompra+IVA));

    }
}
