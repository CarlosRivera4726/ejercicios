import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // ? Variables: ArrayList<String> nombres = new ArrayList<>();
        // ? no pide entrada del usuario, así que se llenara con 5 nombres diferentes
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Felipe");
        nombres.add("Juan");
        nombres.add("Catalina");
        nombres.add("Gherson");

        // * imprimimos el arraylist
        System.out.println(nombres);
        nombres.add(1, "Carlos2");

        nombres.remove(0);

        nombres.add(0, "Charles");
        System.out.println(nombres);

        System.out.println(nombres.get(1));
        System.out.println(nombres.get((nombres.size() - 1)));

    }
}
