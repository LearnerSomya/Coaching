import java.io.*;
import java.util.*;
class WordSearch {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter grid row");
        int row = scn.nextInt();
        System.out.println("enter grid coloumn");
        int col = scn.nextInt();
        System.out.println("Enter grid character");
        char[][] board = new char[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                board[i][j] = scn.next().charAt(0);
            }
        }
        scn.nextLine();
        System.out.println("Enter word which you want to search in grid");
        String word = scn.nextLine();
        //here "WordSearchFunctionsClass" is instance for the class WordSearchFunctions
        WordSearchFunctions WordSearchFunctionsClass = new WordSearchFunctions();
        System.out.println(WordSearchFunctionsClass.exist(board, word));
    }
}
//we made exist and find function of class WordSearchFunctions non static because we are calling these function using instance
class WordSearchFunctions{
    static int m,n;
    public  boolean exist(char[][] board, String word){
        m = board.length;
        n = board[0].length;
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0) && find(board, i, j, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }

    private static int[][] direction = {{1,0}, {-1,0}, {0,1},{0,-1}};
    private  boolean find(char[][] boards, int i, int j, int idx, String word){
        if(idx == word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= m || j >= n || boards[i][j] == '$'){
            return false;
        }
        if(boards[i][j] != word.charAt(idx)){
            return false;
        }

        char temp = boards[i][j];
        boards[i][j] = '$';
        for(int[] dir : direction){
            int newI = i + dir[0];
            int newJ = j + dir[1];

            if(find(boards, newI, newJ,idx + 1, word)){
                return true;
            }
        }
        boards[i][j] = temp;
        return false;
    }
}


