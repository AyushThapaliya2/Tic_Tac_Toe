import java.util.*;


public class Main {

    private static Scanner s = new Scanner(System.in);
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        System.out.println("Whats player1 name: ");
        String player1 = s.nextLine();
        System.out.println("whats player2 name: ");
        String player2 = s.nextLine();
        int position = 0;

        boolean isplayer2 = true;
        boolean isplayer1 = true;


        Initalization();
        drawBoard(board);
        boolean quit = false;
        while (!quit) {
            System.out.println("Whose turn(press 1 for player 1 and 2 for player 2:");
            int press = s.nextInt();
            if (press == 1) {
                System.out.println(player1 + " turn");
                System.out.println("Which position you want to draw x on: ");
                position = s.nextInt();
                if (isplayer1) {
                    switch (position) {
                        case 1:
                            board[0][0] = 'x';
                            break;
                        case 2:
                            board[0][1] = 'x';
                            break;
                        case 3:
                            board[0][2] = 'x';
                            break;
                        case 4:
                            board[1][0] = 'x';
                            break;
                        case 5:
                            board[1][1] = 'x';
                            break;
                        case 6:
                            board[1][2] = 'x';
                            break;
                        case 7:
                            board[2][0] = 'x';
                            break;
                        case 8:
                            board[2][1] = 'x';
                            break;
                        case 9:
                            board[2][2] = 'x';
                            break;

                            default:
                            break;

                    }


                }
            } else if (press == 2) {
                System.out.println(player2 + " turn");
                System.out.println("Which position you want to draw O on: ");
                position = s.nextInt();
                if (isplayer2) {
                    switch (position) {
                        case 1:
                            board[0][0] = 'O';
                            break;
                        case 2:
                            board[0][1] = 'O';
                            break;
                        case 3:
                            board[0][2] = 'O';
                            break;
                        case 4:
                            board[1][0] = 'O';
                            break;
                        case 5:
                            board[1][1] = 'O';
                            break;
                        case 6:
                            board[1][2] = 'O';
                            break;
                        case 7:
                            board[2][0] = 'O';
                            break;
                        case 8:
                            board[2][1] = 'O';
                            break;
                        case 9:
                            board[2][2] = 'O';
                            break;
                            default:
                            break;

                    }


                }
            }
            drawBoard(board);

            boolean win = winner(board, isplayer1, isplayer2);
            if(win){
                quit = true;
            }
        }
    }


    public static boolean winner(char[][] board,boolean player1,
            boolean player2) {

        if (player1) {
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == 'x') {
                    System.out.println("player 1 is the winner");
                    return true;

                }
                for (int j = 0; j < 3; j++) {
                    if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] == 'x') {
                        System.out.println("player 1 is the winner");
                        return true;
                    }

                    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'x') {
                        System.out.println("player 1 is the winner");
                        return true;
                    }
                    if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == 'x') {
                        System.out.println("player 1 is the winner");
                        return true;


                    }
                }


            }

            if (player2) {
                for (int i = 0; i < 3; i++) {
                    if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == 'O') {
                        System.out.println("player 2 is the winner");
                        return true;

                    }
                    for (int j = 0; j < 3; j++) {
                        if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] == 'O') {
                            System.out.println("player 2 is the winner");
                            return true;
                        }
                    }
                    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'O') {
                        System.out.println("player 1 is the winner");
                        return true;
                    }
                    if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == 'O') {
                        System.out.println("player 1 is the winner");
                        return true;
                    }


                }

            }

        }
        return false;
    }
    public static void Initalization() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';

                }
            }
        }
        public static void drawBoard(char[][] board){
            for(int i = 0; i < 3; i++){
            for(int j=0; j < 3; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }

    }
}











































































