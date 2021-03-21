import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		//Create a new array String type
		
		Integer [] arr = new Integer[list.size()];
		
		//convert ArrayList into the string Array
		list.toArray(arr);
		System.out.println("Array");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1)
				System.out.println(arr[i]);
			else
				System.out.println(arr[i]+",");		}
		

	}

}
