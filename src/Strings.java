public class Strings {
    public static void main(String[] args) {
        String str = "I am a programmer.";
        System.out.println("Length : " + str.length());
        System.out.println("ToUpper : " + str.toUpperCase());
        System.out.println("ToLower : " + str.toLowerCase());
        System.out.println(str.startsWith("I"));
        System.out.println(str.startsWith("i"));
        System.out.println(str.indexOf("am"));
        System.out.println(str.indexOf("Am"));
        System.out.println(str.substring(7));
        System.out.println(str.substring(7, 17));
    }
}
