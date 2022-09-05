import java.util.ArrayList;

public class App {
    /*
     * k) Crear un segundo ArrayList (nómbrelo =&gt;(b)) con 3 objetos enteros
     * 111,222 y 333 e imprímalo.
     * l) Crear un tercer ArrayList (nómbrelo =&gt;(c)) con 2 objetos enteros 77777
     * y
     * 88888 e imprímalo.
     * m) Agregar a la lista llamada (b) los elementos de las listas (a) y (c) e
     * imprima
     * la lista (b).
     * n) Adicionar un nuevo valor (99999) a la lista (a) e imprímala.
     * o) Borre de la lista (b) UNICAMENTE los elementos de la lista (a) e imprima
     * la lista (b). Se puede hacer? Revise como quedo la lista (a).
     * p) Borre TODOS los elementos de la lista (a) y verifique que quedo vacía.
     * 
     */
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);

        System.out.println("Números Iniciales: " + numeros);

        numeros.add(1, 1000);
        numeros.add(3, 2000);

        System.out.println("Números Agregados: " + numeros);

        numeros.set(0, 5000);
        numeros.set(2, 10000);

        System.out.println("Números Modificados: " + numeros);
        System.out.println("Primer Ocurrencia: " + numeros.indexOf(2000));
        System.out.println("Ultima Ocurrencia: " + numeros.lastIndexOf(2000));

        numeros.add(2000);
        System.out.println("Primer Ocurrencia: " + numeros.indexOf(2000));
        System.out.println("Ultima Ocurrencia: " + numeros.lastIndexOf(2000));

        if (numeros.contains(40)) {
            System.out.println("Posicion del numero 40: " + numeros.indexOf(40));
        }

        System.out.println("Número removido: " + numeros.remove(5));
        System.out.println(numeros);
        if (numeros.isEmpty()) {
            System.out.println("Vacio");
        } else {
            System.out.println("Tamaño: " + numeros.size());
        }
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        b.add(111);
        b.add(222);
        b.add(333);

        c.add(77777);
        c.add(88888);

        b.addAll(numeros);
        b.addAll(c);
        System.out.println("Numeros lista B: " + b);
        numeros.add(99999);
        System.out.println( "Numeros lista A: " + numeros);

        b.removeAll(numeros);
        System.out.println("Numeros lista B: " + b);

        numeros.clear();

        if(numeros.isEmpty()){
            System.out.println("Lista Vacia!");
        }

    }
}
