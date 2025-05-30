package TicTacToe;

import java.util.Arrays;

class GamePlay {
    static char[][] choices  = new char[3][3];

    static int countX = 0, countO = 0, row = 0, column = 0;
    static char move = ' ';

    static void defaultBoard(){
        for(char[] c : choices){
            Arrays.fill(c, ' ');
        }
    }
    
    static void printGrid(){
        System.out.println("---------");
        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for(int j = 0; j < 3 ; j++){
                
                System.out.print(choices[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
         System.out.println("---------");
         
    }
    static void  fillGrid(Grid grid) {
        row = grid.row;
        column = grid.column;
        move = grid.move;
        choices [row][column] = move;

        if (move == 'X') {
            countX++;
           
        } else {
            countO++;
            
        }
         System.out.println("countX"+countX);
         System.out.println("countO"+countO);
       
    }
    

    static boolean WinDiagonal(){

        int count = 1;
        char topLeftChar = choices[0][0];
        char bottomLeftChar = choices[2][0];

        if(topLeftChar != ' '){
            
            for(int i = 1; i < 3; i++){
                if(choices[i][i] == topLeftChar){
                    count++;
                }
                else break;
                
            }
        
            if(count == 3){
                System.out.println(choices[0][0] + " wins");
                return false;
            }
        }    
        if(bottomLeftChar != ' '){
            if(choices[0][2] == choices[1][1] && choices[1][1] == choices[2][0]){
                System.out.println(choices[0][2] + " wins");
                return false;
            }
        }
        return true;
    }


    static boolean row(){
        int coutX = 0, countY = 0;

        
        for(int i = 0; i < 3; i++){
            coutX = 0;
            countY = 0;
            
            for(int j =0; j < 3; j++){
                
                if(choices[i][j] == 'X' ){
                    
                    coutX++;
                }
                if(choices[i][j] == 'O'){
                    countY++;
                } 
                if(choices[i][j] == ' '){
                    coutX = 0;
                    countY = 0;
                    break;
                }
                
            }
            if(coutX == 3){
                System.out.println("X "+ "wins");
                return false;
            }
            if(countY == 3){
                System.out.println("O "+ "wins");
                return false;
            }

                
        }
            
        return true;
    }

    static boolean column(){
        int count = 0;
        char c = 'a';
       
        for(int i = 0; i < 3; i++){
            count = 0;
            c = choices[0][i];
            for(int j =0; j < 3; j++){
                
                if(c != ' ' && choices[j][i] == c){
                    count++;
                }
                else{
                    
                    break;
                } 
            }
            if(count == 3){
                
                System.out.println(c + "wins");
                return false;
            }
        }
        return true;
    }
}
