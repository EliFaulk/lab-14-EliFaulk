
public class Validate {
	
	public static boolean boardValidator(String[][] board) {
	
		//Check for diagonals
		String diagonal = "";
		
		for (int i = 0; i <= 2 * (board.length - 1); i++) {		//iterate through largest possible coordinate sum for each element diagonally  https://stackoverflow.com/questions/21346343/traverse-an-array-diagonally
			diagonal = "";
			for (int j = 0; j < board.length; j++) {
				int k = i - j;
				if (k < 0 || k >= board.length) {
					continue;
				} else {
					diagonal = diagonal + board[j][k];
				}
			}

			for (int a = 1; a < diagonal.length(); a++) {
				if (diagonal.charAt(a) != '0' && diagonal.charAt(a) == diagonal.charAt(a-1)) {
					return false;
				}
			}
		}
		
		
		//Check for correct number of ship placements
		int carr = 0;
		int battle = 0;
		int cruise = 0;
		int sub = 0;
		int destr = 0;
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board.length; y++) {
				if (board[x][y].equals("C")) {
					carr++;
				} else if (board[x][y].equals("B")) {
					battle++;
				} else if (board[x][y].equals("R")) {
					cruise++;
				} else if (board[x][y].equals("S")) {
					sub++;
				} else if (board[x][y].equals("D")) {
					destr++;
				}
			}
		}
		if (carr != 5 || battle != 4 || cruise != 3 || sub != 3 || destr != 2) {
			return false;
		}

		return true;
	}
	
	
	//Checks for separation of ships (two ships per column and row)
	public static boolean balanced(String[][] board) {
		String row = "0";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (row.indexOf(board[i][j]) == -1) {
					row = row + board[i][j];
				}
			}
			if (row.length() > 3) {
				System.out.println("rows unbalanced");
				return false;
			}
			row = "0";
		}
		
		String column = "0";
		for (int y = 0; y < board.length; y++) {
			for (int x = 0; x < board.length; x++) {
				if (column.indexOf(board[x][y]) == -1) {
					column = column + board[x][y];
				}
			}
			if (column.length() > 3) {
				System.out.println("columns unbalanced");
				return false;
			}
			column = "0";
		}
		
		return true;
	}
	
}
