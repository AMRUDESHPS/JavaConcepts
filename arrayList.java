public class Collections {

	public static void main(String[] args) {

		Collection<Integer> list = new ArrayList<Integer>();
		boolean exists, empty;
		int size;
		// 1. Adding elements
		list.add(1);  // Adds element to the end
		System.out.println("list elements are : " + list);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		// 2. Removing elements
		list.remove(5);  // Removes by element value
		System.out.println("list elements are : " + list);
		list.add(5);
//		list.clear();  // Removes all elements
		System.out.println("list elements are : " + list);
		
		
		// 3. Checking elements
		exists = list.contains(5);    // Check if element exists
		empty = list.isEmpty();       // Check if list is empty
		size = list.size();              // Get number of elements
		System.out.println("exist : " + exists + "\nempty : " + empty + "\nsize : " + size);

		
		// 4. Iterating
		// Using forEach
		System.out.println("Iteration using forEach : ");
		for (Integer num : list) {
		    System.out.print(" " + num);
		}
		System.out.println("\n");

		// Using iterator
		System.out.println("Iteration using iterator : ");
		Iterator<Integer> iterator =  list.iterator();
		while (iterator.hasNext()) {
		    System.out.print(" "+ iterator.next());
		}

		
		// 5. Accessing elements
		// Note: Collection interface doesn't provide get() method so cast it to arrayList
		ArrayList<Integer> arrayList = (ArrayList<Integer>) list;
		int element = arrayList.get(0);       // Get element at index
		arrayList.set(0, 10);                // Set element at index
		System.out.println("\nelement : " + element);
		System.out.println("element : " + arrayList);
		
	}
	
}
