import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    /*
     * 
     * Inicializar un ArrayList de cinco objetos de tipo persona. Los datos de la
     * persona deben ser los siguientes: El nombre, la edad y la cedula. Para lo
     * cual
     * debe crear una clase llamada persona que tenga los datos solicitados.
     * a) Imprima el arreglo con todos los datos de cada persona
     * b) Adicione una persona en la última posición (con todos los datos de la
     * persona)
     * c) Solicite el nombre de una persona y borre todos sus datos del ArrayList.
     * 
     */
    public static void main(String[] args) throws Exception {
        // creamos el arraylist
        ArrayList<Persona> personas = new ArrayList<>();
        int i = 0;

        while (i < 5) {
            // pedimos los valores de la persona con una sola instancia del objeto Persona
            // dentro del ciclo while
            try {
                Persona p1 = new Persona(
                        JOptionPane.showInputDialog(null, "Ingrese su nombre: ", "Persona: " + String.valueOf(i + 1),
                                JOptionPane.INFORMATION_MESSAGE),
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad: ",
                                "Persona: " + String.valueOf(i + 1),
                                JOptionPane.INFORMATION_MESSAGE)),
                        Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese su cedula: ",
                                "Persona: " + String.valueOf(i + 1),
                                JOptionPane.INFORMATION_MESSAGE)));
                personas.add(p1);

                i++;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "HA OCURRIDO UN ERROR!",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                i++;
            }

        }

        

        personas.add(new Persona("RAMIRO", 45, 123456789L));
        System.out.println(personas);

        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de una persona: ", "Persona a eliminar!",
                JOptionPane.INFORMATION_MESSAGE);
        for (Persona p : personas) {
            if (p.getNombre().equals(nombre)) {
                personas.remove(p);
                break;
            }
        }
        System.out.println(personas);

    }
}
