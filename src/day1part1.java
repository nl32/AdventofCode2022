import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1part1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("day1.txt"));
		int largest= 0;
		int sum = 0;
		while(scanner.hasNext()){
			String s = scanner.nextLine();
			if(s.isBlank()){
				if(sum>largest)
					largest= sum;
				sum = 0;
			}else {
				sum += Integer.parseInt(s);
			}
		}
		System.out.println(largest);

	}
}
