package ConHilo;

public class ConHilo implements Runnable {

    public final int[] array;

    public ConHilo(int[] array) {
        this.array = array;
    }

    // definiendo el rango de los valores
    int max = 100;
    int min = 0;
    int rango = max - min + 1;

    private void llenarArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * rango);
        }
    }

    public int encontrarMayor() {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public void run() {
        llenarArray();
    }
}
