package com.Matrix;

public class TicTacToeValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char board[] =  {'X', 'X', 'O',
                'O', 'O', 'X',
                'X', 'O', 'X'};
		boolean flag= validate(board);
		System.out.println(flag);
	}
	static int win[][] = {{0, 1, 2}, // Check first row.
            {3, 4, 5}, // Check second Row
            {6, 7, 8}, // Check third Row
            {0, 3, 6}, // Check first column
            {1, 4, 7}, // Check second Column
            {2, 5, 8}, // Check third Column
            {0, 4, 8}, // Check first Diagonal
            {2, 4, 6}};
	private static boolean checkWin(char[] board, char c) {
		for(int i=0;i<8;i++){
			if(board[win[i][0]]==c && board[win[i][1]]==c && board[win[i][2]]==c){
				return true;
			}
		}
		return false;
	}
	private static boolean validate(char[] board) {
		int xCount = 0,oCount= 0;
		for(int i=0;i<board.length;i++){
			if(board[i]=='X')xCount++;
			if(board[i]=='O')oCount++;
		}
		
		if(xCount==oCount || xCount == oCount+1){
			if(checkWin(board,'O')){
				if(checkWin(board,'X')) return false;
				
				return (xCount==oCount);
			}else
			{
				if(checkWin(board,'X') && xCount != oCount+1) return false;
				return true;
			}
		}
		return false;
		
	}


}
