import java.io.IOException;
import java.io.File;
import java.util.Scanner;


public class Heatmap {

	private double[][] data;
	
	
	//Constructor that reads file for heatmap data
	public Heatmap (int rows, int cols, String filename) throws IOException {
		data = new double[rows][cols];
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		int i = 0;
		sc.nextLine();
		while (sc.hasNextLine()) {
			String[] line = sc.nextLine().split(",");
			for (int j = 0; j < cols; j++) {
				data[i][j] = Double.parseDouble(line[j+1]);
			}
			i++;
		}
		sc.close();
	}
	
	
	//Prints heatmap data in row-major order
	public void printHeatmap() {
		for (double[] row : data) {
			for (double col : row) {
				System.out.print(col + ", ");
			}
		}
	}
	
	
	//Returns sum of all heatmap temps
	public double sumHeatmap() {
		double sum = 0;
		for (double[] row : data) {
			for (double col : row) {
				sum += col;
			}
		}
		return sum;
	}
	
	
	//Returns avg of all heatmap temps
	public double avgHeatmap() {
		double sum = 0;
		int count = 0;
		for (double[] row : data) {
			for (double col : row) {
				sum += col;
				count++;
			}
		}
		double avg = sum / count;
		return avg;
	}
	
	
	//Returns sum of a column
	public double sumColumn(int col) {
		double sum = 0;
		for (double[] row : data) {
			sum += row[col];
		}
		return sum;
	}
	
	
	//Returns sum of a row
	public double sumRow(int row) {
		double sum = 0;
		for (double col : data[row]) {
			sum += col;
		}
		return sum;
	}
	
	
	//Returns # of temps >10 degrees
	public int areCold() {
		int count = 0;
		for (double[] row : data) {
			for (double col : row) {
				if (col < 10.0) {
					count++;
				}
			}
		}
		return count;
	}
	

}
