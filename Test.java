public class Test {

	public static int[] gen(int max) {
		int[] nums = new int[max];
		for (int i = 0; i < max; i++) {
			nums[i] = i + 1;
		}

		return nums;
	}

	public static void main(String[] args) {
		// Generate 1000 values
		int[] values = gen(1000);

		// ArrayList initialization for all types of iterators
		For forTest = new For(values);
		ForEach forEachTest = new ForEach(values);
		Iterator iteratorTest = new Iterator(values);
		ArrayListForEach alTest = new ArrayListForEach(values);

		// Testing
		long ct = System.currentTimeMillis();
		alTest.iterate();
		long at = System.currentTimeMillis();
		System.out.println(at - ct);
	}
}
