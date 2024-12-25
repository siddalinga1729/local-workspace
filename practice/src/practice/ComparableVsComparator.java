package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComparableVsComparator {// comparable is easy ,if you use comparator we cant do for long datatype
	public static void main(String[] args) {
		List<ComparableAndComparatorDemo> lists = new ArrayList<>();
		lists.add(new ComparableAndComparatorDemo(36, "siddu"));
		lists.add(new ComparableAndComparatorDemo(39, "Ram"));
		lists.add(new ComparableAndComparatorDemo(1, "Siva"));
		System.out.println(lists.stream().sorted().toList());// implementation of comparable for entity is mandatory

		// with comparator
		// sorted((e1,e2)->e1.getId()-e2.getId())//if id is int datatype
		System.out.println(lists.stream().sorted((e1, e2) -> {//if id is long datatype
			if (e1.getId() > e2.getId())
				return 1;
			if (e1.getId() < e2.getId())
				return -1;
			else
				return 0;
		}).toList());// implementation of comparator for entity is not required

		System.out.println(lists.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).toList());
		
	}
}
