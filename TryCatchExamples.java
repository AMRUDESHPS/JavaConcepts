public class TryCatchExample {

	public static void main(String[] args) {
		
		try {
			int[] a = {10};
			System.out.println(a[1]);
		} catch(NullPointerException e) {
			System.out.println("Your array is null!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Your index is out of bounds!");
		} catch(Exception e) {
			System.out.println("Something else went wrong!");
		}
	}
}
