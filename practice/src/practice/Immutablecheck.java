package practice;

final class Immutablecheck {
	public static void main(String[] args) {
		String str = new String("");
		System.out.println(str.hashCode());
		str += "d";
		System.out.println(str.hashCode());
		String str1 = "sfd";
		System.out.println(str1.hashCode());
		str1 += "df";
		System.out.println(str1.hashCode());

		Integer ch = 20;
		ch = 30;
		if (ch == ch)
			System.out.println("Mutable");
		// It is because all primitive wrapper classes (Integer, Byte, Long, Float,
		// Double, Character, Boolean, and Short) are immutable in Java, so operations
		// like addition and subtraction create a new object and not modify the old.
		
		StringBuffer sb=new StringBuffer("svd");
		System.out.println(sb.hashCode());
		sb.append("fdsf");
		System.out.println(sb.hashCode());
		StringBuilder sbu=new StringBuilder("svd");
		System.out.println(sbu.hashCode());
		sb.append("fdsf");
		System.out.println(sbu.hashCode());
		
		
		
	}
}
