

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     
        boolean s = true;
       
        int a = GamePlay.countO; 
        int b = GamePlay.countX;
        
        InputHandler.gameStart();
        while(true){ 
            System.out.println("GameStarted");
            

            InputHandler.processActions();

        
            if(a > 3 || b > 3 ){
                s = GamePlay.WinDiagonal();
                if(!s){
                    s = GamePlay.row();
                
                }
                else if(!s){
                    s = GamePlay.column();

                }
            
            
                else{ 
                    System.out.println(a + b);
                    System.out.println("Draw");
                    
                    
                }
            }

        }
    }

}
    

