package OldMistake;
public class Game1 {
    static boolean WinDiagonal(char[][] choices){
        int count1 = 0, count2 = 0;
        boolean s =  false;
        char c1 = choices[0][0];
        char c2 = choices[2][0];
       
        for(int i = 0; i < 3; i++){
            for(int j =0; j < 3; j++){
               if(i == j){
                    if(choices[i][j] == c1){
                        count1++;
                    }
                    
                    
               }
               else if(i+j == 2){
                    if(choices[i][j] == c2){
                        count2++;
                    }
                    
               }
               else break;
               
              
            }
        }
        if(count1 == 3){
            System.out.println("Wins" + c1);
            s = true;
            
        }

        if(count2 == 3){
            System.out.println("Wins" + c2);
            s = true;
          
        }
        return s ;
        
    }


    static boolean row(char[][] choices){
        int countX = 0, countY = 0;

        boolean s =  false;
        for(int i = 0; i < 3; i++){
            countX = 0;
            
            for(int j =0; j < 3; j++){
                
                if(choices[i][j] == 'X' ){
                    
                    countX++;
                }else if(choices[i][j] == 'O'){
                    countY++;
                } 
                else break;
                }
                
            }
            if(countX == 3){
                System.out.println("WinsRow "+  'X');
                s = true;
            }
            if(countY == 3){
                System.out.println("WinsRow "+  'O');
                s = true;
            }
            return s;
        }
    

    static boolean column(char[][] choices){
        int count = 0;
        char c = 'a';
        boolean s = true;
        for(int i = 0; i < 3; i++){
            count = 0;
            c = choices[0][i];
            for(int j =0; j < 3; j++){
                
                if(choices[j][i] == c){
                    
                    count++;
                }
                else break;
            }
            if(count == 3){
                
                System.out.println(c + "wins");
                return true;
            }
        }
        return false;
    }

}

