import java.util.HashSet;

public class Hashsets {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Aziz");
        hs.add("Aziz");
        hs.add("Aziz");
        hs.add("Aziz");
        hs.add("Mina");
        hs.add("Darya");
        hs.add("Reza");
        hs.add("Mohsen");

        for (String s : hs) {
            System.out.println(s);
        }

    }
}
