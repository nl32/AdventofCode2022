import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2part2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("day2.txt"));
		int score = 0;
		while(scanner.hasNext()){
			String[] round = scanner.nextLine().split(" ");
			switch(round[0]){
				case "A" -> {
					switch (round[1]){
						case "X" ->
							score += 3;
						case "Y" ->
							score += 1 + 3;
						case "Z" ->
							score += 2 + 6;
					}
				}
				case "B" -> {
					switch (round[1]){
						case "X" ->
							score+=1;
						case "Y" ->
							score += 2+3;
						case "Z" ->
							score += 3+6;
					}
				}
				case "C" -> {
					switch (round[1]){
						case "X" ->
							score+=2;
						case "Y" ->
							score+= 3 + 3;
						case "Z" ->
							score += 1 + 6;
					}
				}
			}
		}
		System.out.println(score);
	}
}
