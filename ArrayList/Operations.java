import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        // add - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        // get - O(1)
        System.out.println(list.get(1));
        // remove - O(n)
        list.remove(2);
        // set
        list.set(1, 6);
        // contains - O(n)
        System.out.println(list.contains(6));
        // add(index, value) - O(n)
        list.add(1, 8);
        // size()
        System.out.println(list.size());
        System.out.println(list);
    }
}
