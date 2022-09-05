import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    static int suma = 0;

    public static void main(String[] args) throws Exception {
        // ? creamos el arraylist y un metodo para llenar el mismo
        ArrayList<Integer> numeros = new ArrayList<>();
        // para llenar el array
        llenarArrayList(numeros);
        imprimirMensaje("Los números son: ", numeros, JOptionPane.INFORMATION_MESSAGE);
        // para sumar sus valores
        sumarValoresArrayList(numeros);

        // para calcular la media
        calcularMedia(numeros.size());
    }

    // creamos el metodo para calcular la media de la suma de los numeros dentro del
    // arraylist
    private static void calcularMedia(int sizeArray) {

        imprimirMensaje("La media es: ", (suma / sizeArray), JOptionPane.INFORMATION_MESSAGE);

    }

    // creamos el metodo para sumar todos los numeros dentro del arraylist
    private static void sumarValoresArrayList(ArrayList<Integer> numeros) {
        // usamos una variable global llamada suma para guardar el resultado, iniciada
        // en 0

        for (Integer numero : numeros) {
            suma += numero;
        }
        imprimirMensaje("El resultado de la suma es: ", suma, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void llenarArrayList(ArrayList<Integer> numeros) {
        // vamos a pedir a traves de un JOptionPane los datos
        // en un ciclo infinito hasta que se lea por el JOptionPane el número 0

        while (true) {
            // creamos una variable "temporal y local dentro del while" llamada numero para
            // guardar el retorno del JOptionPane
            // el retorno del JOptionPane lo convertimos a entero, podriamos usar un Try
            // Catch para evitar que el programa
            // ejecute una excepcion y lo cierre sin más

            try {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));
                // aqui agregamos el numero ingresado al arraylist pasado por parametro y como
                // no retornamos nada
                // hacemos uso de paso por referencia y no por valor que seria haciendo un
                //* return
                //? con un if controlaremos el paso del número diciendo que el numero sea
                //! diferente de 0, caso contrario haremos una excepcion controlada
                if (numero != 0) {
                    numeros.add(numero);
                } else {
                    Exception e = new Exception();
                    e.wait();
                }
            } catch (Exception e) {
                // aqui daremos un mensaje diciendole al usuario que la ejecucion del programa
                // ha terminado y que se haran los siguientes paso
                imprimirMensaje("Se ha terminado la ejecucion ", -1, JOptionPane.ERROR_MESSAGE);

                break;
            }
        }

    }

    // creamos un metodo para imprimir los valores
    // 3 parametros
    // 1) Mensaje
    // 2) la variable
    // 3) el tipo de mensaje
    private static void imprimirMensaje(String mensaje, int variable, int tipoMensaje) {
        if (variable != -1) {
            JOptionPane.showMessageDialog(
                    null,
                    mensaje + variable,
                    "Mensaje",
                    tipoMensaje);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    mensaje,
                    "Mensaje",
                    tipoMensaje);
        }
    }

    // y uno especifico para el arraylist
    private static void imprimirMensaje(String mensaje, ArrayList<Integer> variable, int tipoMensaje) {

        JOptionPane.showMessageDialog(
                null,
                mensaje + variable,
                "Mensaje",
                tipoMensaje);

    }
}
