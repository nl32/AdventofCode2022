import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2part1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("day2.txt"));
		int score = 0;
		while(scanner.hasNext()){
			String[] line = scanner.nextLine().split(" ");
			switch ((line[1])){
				case "X" -> {
					score +=1;
					switch (line[0]){
						case "A" ->
							score += 3;
						case "C" ->
							score += 6;
					}
				}
				case "Y" -> {
					score +=2;
					switch (line[0]){
						case "A" ->
							score += 6;
						case "B" ->
							score += 3;
					}
				}
				case "Z" -> {
					score +=3;
					switch (line[0]){
						case "B" ->
							score+=6;
						case "C" ->
							score+=3;
					}
				}
			}
		}
		System.out.println(score);
	}
}
