package practice.diamond_problem.interfaces;

public class C implements A,B{
public static void main(String[] args) {
}

@Override
public void testA() {
	A.super.testA();
}
}
