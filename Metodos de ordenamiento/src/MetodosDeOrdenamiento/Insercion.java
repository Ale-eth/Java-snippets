package MetodosDeOrdenamiento;

public class Insercion {
    public static void main(String[] args) {

        int arreglo[] = new int[]{ 8, 3, 4, 2, 6, 1, 9 };
        int posicion, auxiliar;


        // Imprime arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < (arreglo.length); i++) {
            System.out.print(arreglo[i] +", ");
        }


        // Ordenamiento por insercion
        for (int i = 0; i < (arreglo.length) ; i++) {
            posicion = i;
            auxiliar = arreglo[i];

            while ((posicion>0 && (arreglo[posicion-1] > auxiliar))){
                arreglo[posicion] = arreglo[posicion-1];
                posicion--;
            }
            arreglo[posicion] = auxiliar;
        }

        // Imprime arreglo ordenado ascendente
        System.out.println("");
        System.out.println("Ascendente: ");
        for (int i = 0; i < (arreglo.length) ; i++) {
            System.out.print(arreglo[i]+", ");
        }

        // Imprime arreglo ordenado descendente
        System.out.println("");
        System.out.println("Descendente: ");
        for (int i = (arreglo.length -1); i >=0 ; i--) {
            System.out.print(arreglo[i]+", ");
        }
    }
}
