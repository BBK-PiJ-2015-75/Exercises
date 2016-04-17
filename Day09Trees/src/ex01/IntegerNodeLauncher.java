package ex01;

// node.left.tostring method doesnt work

public class IntegerNodeLauncher {

	public static void main(String[] args) {

		IntegerTreeNode node = new IntegerTreeNode();
		launch();

		// node.toString();
		// node.toString2();
		node.depth(node);
		node.add(1);
	}

	static void launch() {
		// create a new tree
		IntegerTreeNode noder = new IntegerTreeNode();
		noder.add(66);
		noder.add(77);
		noder.add(54);
		noder.add(98);
		noder.add(69);
		noder.add(93);
		noder.add(183);
		noder.value = 9;

		int check = 7;
		if (noder.contains(check)) {
			System.out.println("Yes it's here");
		} else {
			System.out.println("Can't find..");
		}

		System.out.println("The biggest number is " + noder.getMax());
		System.out.println("The smallest number is " + noder.getMin());
	}
}
