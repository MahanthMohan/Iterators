import java.util.ArrayList;

public class Iterator {
	private ArrayList<Integer> values;

	public Iterator() {
		values = new ArrayList<Integer>();
	}

	public Iterator(int... values) {
		this.values = new ArrayList<Integer>();

		for (int value : values) {
			this.values.add(value);
		}
	}

	public void iterate() {
		values.iterator().forEachRemaining((value) -> {
			System.out.println(value);
		});
	}
}
