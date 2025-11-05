import java.io.IOException;
import java.io.File;
import java.util.Scanner;


public class Heatmap {

	private double[][] data;
	
	public Heatmap (int rows, int cols, String filename) throws IOException {
		data = new double[rows][cols];
		Scanner sc = new Scanner(filename);
		sc.nextLine();
		while (sc.hasNextLine()) {
			
		}
	}

}
