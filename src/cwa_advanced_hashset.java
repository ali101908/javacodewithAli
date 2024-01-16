import java.util.HashSet;

public class cwa_advanced_hashset {
    public static void main(String[] args) {
        HashSet<Integer> MyHashSet=new HashSet<>(6,0.5f);
        MyHashSet.add(3);
        MyHashSet.add(5);
        MyHashSet.add(6);
        MyHashSet.add(7);
        MyHashSet.add(6);
        System.out.println(MyHashSet);
    }
}
