import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
      
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        System.out.println("ArrayList: " + arrayList);
        
        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        System.out.println("LinkedList: " + linkedList);
        
        // Set demonstrations
        System.out.println("\n=== Set Demonstrations ===");
        
        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2); // Duplicate won't be added
        System.out.println("HashSet: " + hashSet);
        
        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("TreeSet (sorted): " + treeSet);
        
        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
    }
}
