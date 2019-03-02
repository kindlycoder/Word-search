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
}
