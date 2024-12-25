package practice;

import java.util.HashSet;

public class ClassLloaderImpl extends ClassLoader{
public static void main(String[] args) {
	ClassLoader classLoader = A.class.getClassLoader();
	System.out.println(classLoader);//Application Class Loader
	ClassLoader classLoader2 = HashSet.class.getClassLoader();
	System.out.println(classLoader2);
	ClassLoader classLoader3 = Object.class.getClassLoader();
	System.out.println(classLoader3);
}
}
