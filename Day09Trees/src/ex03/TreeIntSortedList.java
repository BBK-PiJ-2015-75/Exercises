package ex03;

public class TreeIntSortedList implements IntSortedList {

	TreeIntSortedList left;
	TreeIntSortedList right;
	public int value;

	public TreeIntSortedList(int value) {
		left = null;
		right = null;
		this.value = 0;
	}

	@Override
	public void add(int x) {
		if (!contains(x))

			if ((x < value) && (left == null)) {
				left = new TreeIntSortedList(x);
			}
		if ((x < value) && (left != null)) {
			left.add(x);
		}
		if ((x > value) && (right == null)) {
			right = new TreeIntSortedList(x);
		} else {
			right.add(x);
		}
	}

	@Override
	public boolean contains(int x) {
		if (x == value) {
			return true;
		} else if ((x < value) && (left != null)) {
			return this.left.contains(x);
		} else if ((x > value) && (right != null)) {
			return this.right.contains(x);
		}
		return false;
	}

}
