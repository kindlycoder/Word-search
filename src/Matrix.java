/**
 * This class is for defining a matrix and its operations
 * @author Noei
 */
public class Matrix {
	
	/**
	 * @author Noei
	 */
	private char matrix[][];
	/**
	 * Get matrix variable
	 * @return Matrix
	 * @author Noei
	 */
	public char[][] getMatrix() {
		return matrix;
	}

	/**
	 * Set matrix variable
     * {@link Matrix#getMatrix()}
     * @param matrix the given matrix
     * @author Noei
     */
	public void setMatrix(char[][] matrix) {
		this.matrix = matrix;
	}

	/**
	 * The constructor that sets the matrix
     * {@link Matrix#getMatrix()}
     * @param matrix the given matrix
     * @author Noei
     */
	public Matrix(char[][] matrix) {
		super();
		this.matrix = matrix;
	}

	/**
	 * This method checks the existence of the given words in the matrix by applying depth first search
     * @param matrix the given matrix
     * @return Boolean
     * @author Noei
     */
	public boolean wordExists(String word) {
        
		/**
		 * In case of empty input returns false
		 */
		
		if (word.length() == 0) return false;
				
		/**
		 * The nested loop navigates the given matrix elements and applies depth first search on each of them as a start point
		 */
		for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (DFS.search(matrix, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
