package ex02;

public class TreeIntTester {

	public static void main(String[] args) {
		
	int datx = 5;
	TreeIntSet tree = new TreeIntSet();
	
	launch(tree);

	}

	static void launch(TreeIntSet tree) {
		
		tree.add(3);
		tree.add(5);
		tree.add(19);
		tree.add(2);
		tree.add(33);
		
		
		tree.contains(5);
		

		System.out.println("2 methods");	
		
		
	}
	
	
	
	
	
}
