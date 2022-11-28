package SinHilo;

public class SinHilo {

    public final int[] array;

    public SinHilo(int[] array) {
        this.array = array;
        llenarArray();
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
}
