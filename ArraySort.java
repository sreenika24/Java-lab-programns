import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		String[] countries = {"India","United States","Malaysia","Australia","Lundon"};
		Arrays.sort(countries);
		for(int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}
	}
}