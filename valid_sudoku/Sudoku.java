package leet;

public class Sudoku {

    public static boolean isValidSudoku(char[][] board) {
        boolean ans = true;
        int i = 0;
        int j = 0;
        
        char elem;
        while(i < 9 && j < 9) {
        	elem = board[i][j];
        	for(int k = i + 1; k < 9; ++k) {
        		if(board[k][j] == elem && elem != 0) {
        			
        			return false;
        		}
        	}
        	for(int l = j + 1; l < 9 ; ++l) {
        		if(board[i][l] == elem && elem != 0) {
        			
        			return false;
        		}
        	}
        	for(int m = i - i % 3; m < i + (3- (i % 3)); ++m ) {
        		for(int n = j - j % 3; n < j + (3 - (j % 3)); ++n ) {
        			if(board[m][n] == elem 
        					&& elem != 0
        					&& m != i && n != j) {
        				
        				return false;
        			}
        		}
        	}
        	
        	++j;
        	if(j == 9) {
        		j = 0;
        		++i;
        	}
        }
        
        return ans;
    	
    }
	
	
	
}
