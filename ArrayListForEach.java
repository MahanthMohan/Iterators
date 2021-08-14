import java.util.ArrayList;

public class ArrayListForEach {
	private ArrayList<Integer> values;

	public ArrayListForEach() {
		values = new ArrayList<Integer>();
	}

	public ArrayListForEach(int... values) {
		this.values = new ArrayList<Integer>();

		for (int value : values) {
			this.values.add(value);
		}
	}

	public void iterate() {
		values.forEach((value) -> {
			System.out.println(value);
		});
	}
}
