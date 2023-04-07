public class Arrays {
    public static void main(String[] args) {
        char[] myName = {'A', 'Z', 'I', 'Z', ' ', 'K', 'A', 'R', 'A', 'M', 'I', 'A', 'N', 'I'};
        for (char c : myName) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("-----------");
        for (int i = 0; i < myName.length; i++) {
            System.out.print(myName[i]);
        }
    }
}
