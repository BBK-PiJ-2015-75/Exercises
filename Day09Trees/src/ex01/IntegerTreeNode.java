package ex01;

public class IntegerTreeNode {

	public int value;
	public IntegerTreeNode left;
	public IntegerTreeNode right;

	public IntegerTreeNode() {
		left = null;
		right = null;
	}

	public IntegerTreeNode(int value) {
		this.value = value;
	}

	// add method
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	// checks the tree contains the element being searched for
	public boolean contains(int n) {
		if (n == value) {
			return true;
		}
		if ((n > value) && (right != null)) {
			return right.contains(n);
		}

		if ((n > value) && (left != null)) {
			return left.contains(n);
		}
		return false;
	}

	// returns the max element in the tree
	public int getMax() {
		if (right == null) {
			return this.value;
		} else
			return right.getMax();
	}

	// returns the min element in the tree
	public int getMin() {
		if (left == null) {
			return this.value;
		} else
			return left.getMin();
	}

	public String toString() {

		String convert = "";
		convert = "[" + Integer.toString(value) + "]" + "";
		if (left == null) {
			convert = convert + "[]";
		} else {
			convert = convert = " L" + "[" + left.toString() + "]";
		}
		if (right == null) {
			convert = "[]";
		} else {
			convert = convert + " R" + "[" + right.toString() + "]";
		}

		System.out.println("Complex tree " + convert);
		return convert;
	}

	public String toString2() {

		String convert = "";
		convert = "[" + Integer.toString(value) + "]" + "";
		if (left == null) {
			convert = convert + "";
		} else {
			convert = convert = "[" + left.toString() + "]";
		}
		if (right == null) {
			convert = "";
		} else {
			convert = convert + "[" + right.toString() + "]";
		}

		System.out.println("Complex tree " + convert);
		return convert;
	}

	public int depth(IntegerTreeNode node) {
		int leftDepth;
		int rightDepth;

		if (node == null) {
			return 0;
		}

		else {
			leftDepth = depth(node.left);
			rightDepth = depth(node.right);
		}
		if (leftDepth > rightDepth) {
			System.out.println("Left hasmore levels: " + leftDepth + " levels");
			return leftDepth;
		} else
			System.out.println(rightDepth + leftDepth);
		System.out.println("Right has more levels: " + rightDepth + " levels");
		return rightDepth;
	}

	public void remove(IntegerTreeNode tree, int remove) {

		if (tree.contains(remove)) {

		}
	}
}



