package practice;

import java.util.HashSet;
import java.util.TreeSet;

public class UncommonCharacters {
	static String  UncommonChars(String A, String B)
    {
        // code here
        String result="";
        TreeSet<String> r=new TreeSet();
        for(int i=0;i<A.length();i++){
            if(!B.contains(A.charAt(i)+""))r.add(A.charAt(i)+"");
        }
        for(int i=0;i<B.length();i++){
            if(!A.contains(B.charAt(i)+""))r.add(B.charAt(i)+"");
        }
        for(String str:r) {
        	result+=str;
        }
        return result;
    }
	
	public static void main(String[] args) {
		String uncommonChars = UncommonChars("geeks","g");
		System.out.println(uncommonChars);
		String str=new String("-1");
		char[] charArray = str.toCharArray();
		System.out.println(charArray[0]);
	}
}
