package interviewTask;

import java.util.*;

public class RemoveDup {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Jane");
		names.add("James");
		names.add("Jasmine");
		names.add("John");
		names.add("James");
		System.out.println(names);

		names.addAll(names);
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);

		Set<String> names1 = new LinkedHashSet<>(names);
		names1.addAll(names);
		System.out.println(names1);
		names1.add("Faina");
		names1.add("Alissa");
System.out.println(names1);
		List<String> names2 = new ArrayList<>(names1);
		System.out.println(names2.get(5));
		
		Object[] array=names1.toArray();
		System.out.println(array[0]);
		Arrays.sort(array);
		for(int i=0; i<array.length; i++) {
		System.out.print(array[i]+" ");
		}

	}

}
