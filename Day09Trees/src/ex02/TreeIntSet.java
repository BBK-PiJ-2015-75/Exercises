package ex02;

public class TreeIntSet implements IntSet {

	public int data;
	TreeIntSet left;
	TreeIntSet right;

	public TreeIntSet() {
		left = null;
		right = null;
	}

	public TreeIntSet(int data) {
		this.data = data;
	}

	@Override
	public void add(int x) {

		if (!contains(x)) {

			if (x < this.data) {
				if (left == null) {
					left = new TreeIntSet(x);
				}
				left.add(x);
			}

			if (x > this.data) {
				if (right == null) {
					right = new TreeIntSet(x);
					
				}
				right.add(x);
			}
		}
	}
		
		
		

	@Override
	public boolean contains(int x) {

		if (x == this.data) {
			return true;
		} 
		if ((x > this.data) && (right != null)){
					System.out.println("Right " +right.contains(x));
					return right.contains(x);
		}
		if (left != null) {
			System.out.println("Left "+ left.contains(x));
			return left.contains(x);
			}
		return false;
		}
		
		
	


	@Override
	public boolean containsVerbose(int x) {

		boolean result = true;
		if (x == this.data) {
			result = true;
			System.out.println(result);
		}
		if (x > this.data) {
			if (right == null) {
				result = false;
			} else
				result = true;
			System.out.println(result);
		}

		else {
			if (x < this.data) {
				if (left == null) {
					result = false;
					System.out.println(result);
				}
			} else
				result = true;
			System.out.println(result);

		}
		System.out.println(result);
		System.out.println(this.data);
		return result;
	}
	

}






