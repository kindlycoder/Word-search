/**
 * This class is for applying depth first search functionalities
 * @author Noei
 */
public class DFS {
	
	/**
	 * search in a given matrix and the specific start node 
	 * @param matrix the given matrix
	 * @param i the index of row
	 * @param j the index of column
	 * @param word the given word for searching in the matrix
	 * @param the stage that we are in, the stage increases after finding every successful character incrementally
	 * @return Boolean
	 * @author Noei
	 */
    public static boolean search(char[][] matrix, int i, int j, String word, int stage){
        
    	/**
    	 * Checks the word length and the number of successful stages
    	 */
    	if(stage == word.length()){
            return true;
        }
		
        /** 
         * Checks if the given node is in the matrix
         */
        if (i<0 || i >= matrix.length ||
    		j<0 || j >= matrix[i].length) {
            return false;
        }
        
        /**
         * Checks if the element has been checked already or is equal to the character that we are looking for in the given step
         */
        if((matrix[i][j] - word.charAt(stage)) != 0){
            return false;
        }
        
        /**
         * Records the element before marking it as visited
         */
        char value = matrix[i][j];
        
        /**
         * Setting the element as visited by assigning '#' char to it
         */
        matrix[i][j] = '#';
        
        /**
         * If we are successful in the current step navigates to other 4 possible positions
         */
        boolean result = search(matrix,i-1,j,word,stage+1) ||
        			     search(matrix,i,j-1,word,stage+1) ||
        			     search(matrix,i,j+1,word,stage+1) ||
        			     search(matrix,i+1,j,word,stage+1);
        
        /**
         * Setting back the element to its prior value
         */
        matrix[i][j] = value;
        
        /**
         * Return the result
         */
        return result;
        
    }
}
