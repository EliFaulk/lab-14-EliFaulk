
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
					diagonal = diagonal + " " + board[j][k];
				}
			}
			System.out.println(diagonal);
		}
	
		
		//No missing ships
		//No duplicate ships
		return true;
	}
}
