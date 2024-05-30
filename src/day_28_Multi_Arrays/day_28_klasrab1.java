package day_28_Multi_Arrays;

public class day_28_klasrab1 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j<chessBoard[i].length; j++) {
                if ((i+j)%2 == 0){
                    System.out.print(chessBoard[i][j] = "[W] ");
                }else {
                    System.out.print(chessBoard[i][j] = "[B] ");
                }
            }
            System.out.println();
        }

    }
}
