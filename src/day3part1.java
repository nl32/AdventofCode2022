import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class day3part1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("day3.txt"));
		int sum = 0;
		while(scanner.hasNext()){
			String line = scanner.nextLine();
			String first = line.substring(0,line.length()/2);
			String second = line.substring(line.length()/2);
			Set<String> w = new TreeSet<>(List.of(first.split("")));
			w.retainAll(List.of(second.split("")));
			char x = ((String) w.toArray()[0]).charAt(0);
			int add;
			if(x>96){
				add = x-96;
			}else {
				add = x-64+26;
			}
			sum+= add;
			System.out.println(add);
		}
		System.out.println(sum);
	}
}
