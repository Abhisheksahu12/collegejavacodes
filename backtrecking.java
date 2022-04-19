package Dhruv_Java;
import java.util.*;
public class backtrecking{
    //q1 permutaions of a string
//     public static void printpermutation(String s, String permutation,int idx){
//         if (s.length()==0) {
//             System.out.println(permutation);
//             return;
//         }
//         for (int i = 0; i < s.length(); i++) {
//             char currchar=s.charAt(i);
//             String newstr=s.substring(0,i)+s.substring(i+1);
//             printpermutation(newstr, permutation+currchar, idx+1);
//         }
//     }
// //q2 n queens problems
// // print nxn chessboard for n queens where all queens are safe
// public static boolean issafe(int row,int col,char board[][]){
//     //horizontal;
//     for (int i = 0; i < board.length; i++) {
//         if (board[row][i]=='Q') {
//             return false;
//         }
//     }
//     //vertical
//     for (int j = 0; j < board[0].length; j++){
//         if (board[j][col]=='Q') {
//             return false;
//         }
//     }
//     //upper left
//     int r=row;
//     for (int c=col; c>=0 && r>=0;c--,r--){
//         if (board[r][c]=='Q') {
//             return false;
//         }   
//     }
//     //upper right
//     r=row;
//     for (int c=col; c<board.length && r>=0;c++,r--){
//         if (board[r][c]=='Q') {
//             return false;
//         }   
//     }
//     //lower left
//     r=row;
//     for (int c=col; r<board.length && c>=0;r++,c--){
//         if (board[r][c]=='Q') {
//             return false;
//         }   
//     }
//     //lower right
//     r=row;
//     for (int c=col; r<board.length && c<board.length;r++,c++){
//         if (board[r][c]=='Q') {
//             return false;
//         }   
//     } 
//     return true;
// }
// public static void saveboard(char board[][],List<List<String>> allboards){
//     String row="";
//     List<String> newboard= new ArrayList<>();
//     for (int i = 0; i < board.length; i++) {
//         row="";
//         for (int j = 0; j < board[0].length; j++) {
//             if (board[i][j]=='Q') {
//                 row+='Q';
//             }
//             else{
//                 row+='.';
//             }
//         }
//         newboard.add(row);
//     }
//     allboards.add(newboard);
// }
// public static void helperqueenfunc(char board[][],List<List<String>> allboards,int col){
//           for (int row = 0; row < board.length; row++) {
//               if (col==board.length) {
//                   saveboard(board,allboards);
//                   return;
//               }
//               if (issafe(row,col,board)){
//                   board[row][col]='Q';
//                   helperqueenfunc(board, allboards, col+1);
//                   board[row][col]='.';
//               }              
//           }

// }
// public static List<List<String>> solvenqueens(int n){
//     List<List<String>> allboards= new ArrayList<>();
//     char [][] board=new char[n][n];
//     helperqueenfunc(board, allboards,0);
//     return allboards;
// }

//q3 sudoku solver 

public static boolean issafe(char[][]board,int row,int col,int number){
//row&column
for (int i = 0; i < board.length; i++) {
    if (board[i][col]==(char)(number+'0')){
        return false;    
    }
    if (board[row][i]==(char)(number+'0')){
        return false;
    }
}
    //grid
    int start_row=(row/3) * 3;
    int start_col=(col/3) * 3;
    for (int j = start_row; j < start_row+3; j++) {
        for (int j2 = start_col; j2 < start_col+3; j2++) {
            if (board[j][j2]==(char)(number+'0')){
                return false;
            }
        }
        
    }
    return true;
}

public static boolean helpsudoku(char[][] board,int row,int col){
    if(row==board.length){
        return true; 
    }
int newrow=0;
int newcol=0;
if (col!=board.length-1) {
    newrow=row;
    newcol=col+1;    
}
else{
    newrow=row+1;
    newcol=0;
}
if (board[row][col]!='.') {
    if(helpsudoku(board, newrow, newcol)){
        return true;
    }
}
   else{
       //fill the place
       for (int i = 1; i <=9; i++) {
           if(issafe(board,row,col,i)){
               board[row][col]=(char)(i+'0');
               if(helpsudoku(board,newrow,newcol)){
                   return true;
               }
               else{
                   board[row][col]='.';
               }
           } 
       }
   } 
   return false;
}
public static void solvesudoku(char[][] board){
    helpsudoku(board,0,0);
    printBoard(board);
}
private static void printBoard(char[][] board) {
    for (int row = 0; row < board.length; row++) {
        for (int column = 0; column < board.length; column++) {
            System.out.print(board[row][column] + " ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
// String permutation="";
// int n=sc. nextInt();
// printpermutation(s, permutation,0);


// System.out.println(solvenqueens(n));

//solvesudoku
// char [][]board=new char[9][9];
// board = [['5','3','.','.','7','.','.','.','.'],['6','.','.','1','9','5','.','.','.'],['.','9','8','.','.','.','.','6','.'],['8','.','.','.','6','.','.','.','3'],['4','.','.','8','.','3','.','.','1'],['7','.','.','.','2','.','.','.','6'],['.','6','.','.','.','.','2','8','.'],['.','.','.','4','1','9','.','.','5'],['.','.','.','.','8','.','.','7','9']];
char [][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
printBoard(board);
System.out.println();
solvesudoku(board);
sc.close(); 





 
}
 
}
