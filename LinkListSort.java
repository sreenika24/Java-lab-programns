import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;
public class LinkListSort {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>(Arrays.asList("beans", "oats", "avocados", "broccoli"));
		System.out.println("Before Sorting: "+list);
		list.sort(Comparator.naturalOrder());
		System.out.println("After Sorting: " + list);
	}
}