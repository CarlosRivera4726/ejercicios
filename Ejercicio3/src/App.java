import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    /*
     * Inicializar un ArrayList con los 20 primeros números pares ascendentemente /\
     * y realice lo siguiente:
     * a) Imprima el ArrayList leído. /\
     * b) Lea un numero cualquiera e insértelo en la posición correcta de acuerdo
     * con el orden del ArrayList. Imprima de nuevo el ArrayList para verificar que
     * el/\
     * valor se insertó en la posición correcta.
     * c) Borre un valor dentro del ArrayList solicitándolo al usuario. Imprima de
     * nuevo el arreglo para verificar que el valor se retiró.
     * 
     */

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numerosPares = new ArrayList<>();
        // for con el iterador 'i' que va desde 0 hasta 40 pero cada paso suma 2
        for (int i = 0; i < 40; i += 2) {
            numerosPares.add(i);
        }
        System.out.println(numerosPares);

        // pedimos el numero 'x' y lo almacenamos, con la funcion de Collections.sort()
        // le hacemos que se ajuste el arraylist y lo dejara en la posicion correcta
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        // se podria manejar una excepcion, pero vamos a intuir que el "cliente" va
        // ingresar un valor adecuado
        // lo normal seria colocar una excepcion
        numerosPares.add(input.nextInt());
        Collections.sort(numerosPares);
        System.out.println(numerosPares);

        System.out.print("Ingrese un valor para borrar: ");
        int valorARemover = input.nextInt();
        if (numerosPares.contains(valorARemover)) {
            // se usa esta funcion ya que el arraylist es de integer -> si le pasamos el int
            // normal java va pensar que es el index del array
            // entonces se emplea la funcion Integer.valueOf(int x); que recibe un entero y
            // lo transforma a Integer
            numerosPares.remove(Integer.valueOf(valorARemover));
        } else {
            System.out.println("No existe el número!");
        }
        System.out.println(numerosPares);

        input.close();
    }
}
