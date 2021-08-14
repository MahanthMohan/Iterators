import java.util.ArrayList;

public class ForEach {
	private ArrayList<Integer> values;

	public ForEach() {
		values = new ArrayList<Integer>();
	}

	public ForEach(int... values) {
		this.values = new ArrayList<Integer>();

		for (int value : values) {
			this.values.add(value);
		}
	}

	public void iterate() {
		for (int value : values) {
			System.out.println(value);
		}
	}
}
