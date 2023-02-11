public class ComparingStrings {
    public static void main(String[] args) {
        String str1 = "Ali Daei";
        String str2 = "Ali Karimi";
        String firstName1 = str1.substring(0 ,3);
        String firstName2 = str2.substring(0, 3);
        System.out.println(firstName1);
        System.out.println(firstName2);

        boolean c1 = firstName1 == firstName2;
        System.out.println(c1);

        boolean c2 = firstName1.equals(firstName2);
        System.out.println(c2);
    }
}
