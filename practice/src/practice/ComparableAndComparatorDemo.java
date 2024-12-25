package practice;

public class ComparableAndComparatorDemo implements Comparable<ComparableAndComparatorDemo>{
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ComparableAndComparatorDemo(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComparableDemo [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(ComparableAndComparatorDemo comparableDemo) {
		if (comparableDemo.getId() > id)
			return -1;
		if (comparableDemo.getId() < id)
			return 1;
		else
			return 0;
	}

//	@Override
//	public int compare(ComparableAndComparatorDemo o1, ComparableAndComparatorDemo o2) {
//		if (o1.getId() > o2.getId())
//			return -1;
//		if (o1.getId() < o2.getId())
//			return 1;
//		else
//			return 0;
//	}

}
