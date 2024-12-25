package practice.diamond_problem.interfaces;

public interface B {
	default  void testA() {
		System.out.println("From B");
	}
}
