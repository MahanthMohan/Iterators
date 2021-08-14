import java.util.ArrayList;

public class For {
	private ArrayList<Integer> values;

	public For() {
		values = new ArrayList<Integer>();
	}

	public For(int... values) {
		this.values = new ArrayList<Integer>();

		for (int idx = 0; idx < values.length; idx++) {
			this.values.add(values[idx]);
		}
	}

	public void iterate() {
		for (int idx = 0; idx < values.size(); idx++) {
			System.out.println(values.get(idx));
		}
	}
}
