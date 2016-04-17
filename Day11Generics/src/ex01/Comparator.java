package ex01;

public class Comparator<T extends Comparable<T>> {

	
	public  T getMax (T n, T m) {
		return (n.compareTo(m) > 0) ? n : m;
	}
	
	
	public static void main (String args[]) {
		
		Comparator<Integer> com = new Comparator<Integer>();
		
		int a = 2;
		int b = 3;
		int c = com.getMax(a, b);
		
		System.out.println(c);
		
	}
	
	
/*	public int getMax(int n, int m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}

	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}

	public String getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		if (n1 > n2) {
			return number1;
		} else {
			return number2;
		}
	}*/

}
