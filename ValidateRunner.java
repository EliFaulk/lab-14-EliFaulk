import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class ValidateRunner {

	public static void main(String[] args) throws IOException {
		
		//Get file name for battleship board
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a board (file name): ");
		String fileName = scanner.nextLine();
		scanner.close();
		
		
		//Create 2D array for battleship board & check validity
		String[][] board = new String[10][10];
		boolean validity = true;
		
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		
		int y = 0;
		while (sc.hasNextLine()) {
			String[] row = sc.nextLine().split(",");
			if (row.length != 10) {			//If # of columns 
				validity = false;
				break;
			}
			for (int i = 0; i < row.length; i++) {
				board[y][i] = row[i];
			}
			y++;
		}
		if (y != 9) {		//If # or rows isn't 10, invalid
			validity = false;
		}
		sc.close();
		
		
		if (!validity) {
			System.out.println("This board is invalid.");
		} else {
			System.out.println("This board is valid.");
		}

	}

}
