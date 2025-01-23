package trabajofinal;

import java.util.Scanner;

public class TRABAJOFINAL {
    public static void main(String args[]) {
        int vt1, vt2, vt3;
        double sm, pt, c;
        String vendedor;

        Scanner lectura = new Scanner(System.in);

        System.out.print("Nombre del Vendedor: ");
        vendedor = lectura.next();
        System.out.print("Sueldo Mensual: ");
        sm = lectura.nextDouble();
        System.out.print("Venta 1: ");
        vt1 = lectura.nextInt();
        System.out.print("Venta 2: ");
        vt2 = lectura.nextInt();
        System.out.print("Venta 3: ");
        vt3 = lectura.nextInt();

        // Cálculos
        c = (vt1 + vt2 + vt3) * 0.25; // Calcular comisión (corrección de vt14 a vt1)
        pt = sm + c; // Sueldo total con comisión

        // Resultados
        System.out.println("Resumen:");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Sueldo Mensual: " + sm);
        System.out.println("Ventas Totales: " + (vt1 + vt2 + vt3));
        System.out.println("Comisión: " + c);
        System.out.println("Sueldo Total: " + pt);

        lectura.close();
    }
}
