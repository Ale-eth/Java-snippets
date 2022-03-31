package MetodosDeOrdenamiento;

import java.util.Scanner;

public class BusquedaSecuencial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arreglo[] = new int[]{ 8, 3, 4, 2, 6, 1, 9 };
        int numAbuscar;
        boolean encontrado = false;


        System.out.println("Ingrese el numero que quiere buscar en el arreglo: ");
        numAbuscar = scanner.nextInt();


        // Busqueda secuencial
        int i=0;
        while(i < arreglo.length && !encontrado){
            if (arreglo[i] == numAbuscar){
                encontrado = true;
            }
            i++;
        }

        if(encontrado){
            System.out.println("El numero existe en el arreglo");
        }else{
            System.out.println("El numero no existe en el arreglo");
        }
    }
}
