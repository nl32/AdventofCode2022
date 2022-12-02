import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class day1part2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("day1.txt"));
		PriorityQueue<Integer> most = new PriorityQueue<>(Collections.reverseOrder());
		int sum = 0;
		while(scanner.hasNext()){
			String s = scanner.nextLine();
			if(s.isBlank()){
				most.add(sum);
				sum = 0;
			}else {
				sum += Integer.parseInt(s);
			}
		}
		int total = 0;
		for (int i = 0; i < 3; i++) {
			total += most.remove();
		}
		System.out.println(total);

	}
}
