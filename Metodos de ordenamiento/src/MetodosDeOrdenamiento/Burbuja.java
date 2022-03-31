package MetodosDeOrdenamiento;

public class Burbuja {
    public static void main(String[] args) {

        int arreglo[] = new int[]{ 6, 8, 3, 4, 2, 6, 1, 9 };
        int auxiliar;

        // Imprime arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < (arreglo.length); i++) {
            System.out.print(arreglo[i] +", ");
        }

        // Metodo burbuja ascendente
        for (int i = 0; i < (arreglo.length -1); i++) {
            for (int j = 0; j < (arreglo.length -1); j++) {
                if (arreglo[j] > arreglo[j+1]){
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }

        // Metodo burbuja descendente
        for (int i = 0; i < (arreglo.length -1); i++) {
            for (int j = 0; j < (arreglo.length -1); j++) {
                if (arreglo[j] > arreglo[j+1]){
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }

        // Imprimie arreglo ordenado ascendente
        System.out.println();
        System.out.println("Arreglo ordenado ascendente:");
        for (int i = 0; i < (arreglo.length); i++) {
            System.out.print(arreglo[i] +", ");
        }

        // Imprimie arreglo ordenado descendente
        System.out.println();
        System.out.println("Arreglo ordenado ascendente:");
        for (int i = (arreglo.length -1); i >= 0; i--) {
            System.out.print(arreglo[i] +", ");
        }
    }
}
