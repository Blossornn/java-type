package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> msgs = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			String line = scan.nextLine();
			msgs.add(line);
		}
		for(String tmp : msgs) {
			System.out.println(tmp);
		}
	}
}
