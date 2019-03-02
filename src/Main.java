public class Main {
	
	public static void main(String arg[]) {
		
		char adjacency_matrix[][] = {
				{'A', 'B', 'C', 'E'},
				{'S', 'F', 'C', 'S'},
				{'A', 'D', 'E', 'E'},
		};
		
		Matrix matrix = new Matrix(adjacency_matrix);
		System.out.println(matrix.wordExists("CESEE"));
	}
}
