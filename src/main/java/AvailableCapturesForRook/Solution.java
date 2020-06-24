package AvailableCapturesForRook;

public class Solution {
    public int numRookCaptures(char[][] board) {
        int n=0;
        for(int i=0; i<8; i++) {
            int count = 0;
            for(int j=0; j<8; j++) {
                if (board[i][j]=='R') {
                    for(int k=i+1; k<board.length; k++) {
                        if(board[k][j] == 'p') {
                            count++;
                            break;
                        } else if(board[k][j] != '.')
                            break;
                    }
                    for(int k=i-1; k>=0; k--) {
                        if(board[k][j] == 'p') {
                            count++;
                            break;
                        } else if(board[k][j] != '.')
                            break;
                    }
                    for(int k=j-1; k>=0; k--) {
                        if(board[i][k] == 'p') {
                            count++;
                            break;
                        } else if(board[i][k] != '.')
                            break;
                    }
                    for(int k=j+1; k<board.length; k++) {
                        if(board[i][k] == 'p') {
                            count++;
                            break;
                        } else if(board[i][k] != '.')
                            break;
                    }
                }
            }
            n += count;
        }
        return n;
    }
}
