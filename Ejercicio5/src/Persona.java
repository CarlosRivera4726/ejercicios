public class Persona {
    /*
     * 
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
     * 
     */
    private String nombre;
    private int edad;
    private long cedula;

    public Persona(String nombre, int edad, long cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Persona [cedula=" + cedula + ", edad=" + edad + ", nombre=" + nombre + "]\n";
    }

}
