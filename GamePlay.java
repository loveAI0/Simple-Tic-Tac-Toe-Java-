public class GamePlay {
    static boolean WinDiagonal(char[][] choices){
        boolean s =  false;
        int count = 1;
        char topLeftChar = choices[0][0];
        char bottomLeftChar = choices[2][0];

        if(topLeftChar != '_'){
            
            for(int i = 1; i < 3; i++){
                if(choices[i][i] == topLeftChar){
                    count++;
                }
                else break;
                
            }
        
            if(count == 3){
                System.out.println(choices[0][0] + " wins");
                return true;
            }
        }    
        if(bottomLeftChar != '_'){
            if(choices[0][2] == choices[1][1] && choices[1][1] == choices[2][0]){
                System.out.println(choices[0][2] + " wins");
                return true;
            }
        }
        return false;
    }


    static boolean row(char[][] choices){
        int countX = 0, countY = 0;

        
        for(int i = 0; i < 3; i++){
            countX = 0;
            countY = 0;
            
            for(int j =0; j < 3; j++){
                
                if(choices[i][j] == 'X' ){
                    
                    countX++;
                }
                if(choices[i][j] == 'O'){
                    countY++;
                } 
                if(choices[i][j] == '_'){
                    countX = 0;
                    countY = 0;
                    break;
                }
                
            }
            if(countX == 3){
                System.out.println("X "+ "wins");
                return true;
            }
            if(countY == 3){
                System.out.println("O "+ "wins");
                return true;
            }

                
        }
            
        return false;
    }

    static boolean column(char[][] choices){
        int count = 0;
        char c = 'a';
       
        for(int i = 0; i < 3; i++){
            count = 0;
            c = choices[0][i];
            for(int j =0; j < 3; j++){
                
                if(c != '_' && choices[j][i] == c){
                    count++;
                }
                else{
                    
                    break;
                } 
            }
            if(count == 3){
                
                System.out.println(c + "wins");
                return true;
            }
        }
        return false;
    }
}
