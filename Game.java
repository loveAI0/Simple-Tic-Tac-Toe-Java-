public class Game {
    char WinDiagonal(char[][] choices){
        if(choices[0][0] == 'X' && choices[1][1] == 'X' && choices[2][2] == 'X'){
            return 'X';
        }
        else if(choices[0][2] == 'X' && choices[1][1] == 'X' && choices[2][0] == 'X'){
            return 'X';
        }
        // else return 'O';
        int count = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0 || i == 2 && j == 0){
                    
                }
            }
        }


    }

    char WinRow(char[][] choices){
         if(choices[0][0] == 'X' && choices[0][1] == 'X' && choices[0][2] == 'X'){
            return 'X';
        }
        else if(choices[0][0] == 'O' && choices[0][1] == 'O' && choices[0][2] == 'O'){
            return 'O';
        }

        else if(choices[1][0] == 'O' && choices[1][1] == 'O' && choices[1][2] == 'O'){
            return 'O';
        }
        else if(choices[1][0] == 'X' && choices[1][1] == 'X' && choices[1][2] == 'X'){
            return 'X';
        }

        else if(choices[2][0] == 'O' && choices[2][1] == 'O' && choices[2][2] == 'O'){
            return 'O';
        }
        else if(choices[2][0] == 'X' && choices[2][1] == 'X' && choices[2][2] == 'X'){
            return 'X';
        }


    }


}
