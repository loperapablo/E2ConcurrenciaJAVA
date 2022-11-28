package ConHilo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainConHilo {

    private static final int[] ARRAY = new int[90000000];

    public static void main(String[] args) {
        System.out.println("Inicia...");
        double inicio = System.currentTimeMillis();

        ExecutorService ex = Executors.newCachedThreadPool();
        ConHilo A = new ConHilo(ARRAY);
        ConHilo B = new ConHilo(ARRAY);

        ex.execute(A);
        ex.execute(B);

        ex.shutdown();

        while (!ex.isTerminated()) {

        }

        int mayor = B.encontrarMayor();

        int cantidad = 90000000;

        int C[] = new int[cantidad];

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
        System.out.println("Total tardó: " + (total / 1000) + "s");
        System.out.println("El mayor pedido es: " + mayor);
        System.out.println("Se crearon " + (A.array.length + B.array.length + C.length) + " de datos.");
    }

}
