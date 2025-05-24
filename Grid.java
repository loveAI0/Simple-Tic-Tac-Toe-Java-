
class Grid {
    static int countX = 0, countO = 0, count_ = 0;
    static char[][] GridPattern(String choices){
       char[][] tictactoe = new char[3][3];
        
        int index = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tictactoe[i][j] = choices.charAt(j + index);
                if(tictactoe[i][j] == 'X'){
                    countX++;
                }
                else if(tictactoe[i][j] == 'O'){
                    countO++;
                }
                else count_++;
            }
            index += 3;
        }
        return tictactoe;
        
        
    }
    static void printGrid(char[][] tictactoe){
        System.out.println("---------");
        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for(int j = 0; j < 3 ; j++){
                System.out.print(tictactoe[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
         System.out.println("---------");
    }
}
