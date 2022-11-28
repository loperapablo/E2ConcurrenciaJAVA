package SinHilo;

public class Main {

    private static final int[] ARRAY = new int[90000000];

    public static void main(String[] args) {
        System.out.println("Inicia...");
        double inicio = System.currentTimeMillis();

        SinHilo A = new SinHilo(ARRAY);
        SinHilo B = new SinHilo(ARRAY);

        int cantidad = 90000000;

        int C[] = new int[cantidad];

        int mayor = B.encontrarMayor();

        //CREANDO C
        for (int i = 0; i < cantidad; i++) {
            if (A.array[i] == B.array[i]) {
                C[i] = A.array[i];
            }
            if (A.array[i] < B.array[i]) {
                C[i] = (B.array[i] - A.array[i]) * 2;
            } else {
                C[i] = B.array[i];
            }
        }

        double fin = System.currentTimeMillis();

        double total = fin - inicio;
        System.out.println("Total tardó: " + (total / 1000) + " s");
        System.out.println("El mayor pedido es: " + mayor);
        System.out.println("Se crearon " + (A.array.length + B.array.length + C.length) + " de datos.");

    }

}
