import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for (Object s : arrayList) {
            System.out.println(s);
        }
    }
}
