import java.util.HashSet;
import java.util.Iterator;

public class HashBrowns {
	public static void main(String[] args) {
		HashSet<Integer> hashbrowns = new HashSet<Integer>();
		hashbrowns.add(10);
		hashbrowns.add(20);
		hashbrowns.add(2);
		Iterator<Integer> it = hashbrowns.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
