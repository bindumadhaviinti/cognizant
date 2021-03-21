import java.util.*;

import java.util.stream.*;

public class SoerListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//returns a list view
		List<String> slist = Arrays.asList("Tanu","Kamal","Suman","Lucky","Bunty","Amit");
		List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);

	}

}
