import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class day3part2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("day3.txt"));
		int sum = 0;
		int index = 0;
		Set<String> combined = new TreeSet<>();
		while(scanner.hasNext()){
			String line = scanner.nextLine();
			if(index == 0){
				combined.addAll(List.of(line.split("")));
			}else{
				combined.retainAll(List.of(line.split("")));
			}
			char x;
			int add;
			index++;
			if(index==3){
				index = 0;
				x = ((String) combined.toArray()[0]).charAt(0);
				if(x>96){
					add = x-96;
				}else {
					add = x-64+26;
				}
				sum+= add;
				combined.clear();
			}
		}
		System.out.println(sum);
	}
}
