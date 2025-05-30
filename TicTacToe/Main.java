package TicTacToe;




class Main {
    public static void main(String[] args){
      
     
        boolean s = true;
       
        int a = 0; 
        int b = 0;
        System.out.println("GameStarted");
        InputHandler.gameStart();
        GamePlay.defaultBoard();
        

        while(s){ 
            InputHandler.processActions();
            


            a = GamePlay.countX;
            b = GamePlay.countO;

            if(a >= 3 || b >= 3 ){
                s = GamePlay.WinDiagonal();
                if(s){
                    s = GamePlay.row();
                
                }
                if(s){
                    s = GamePlay.column();

                }
            
            
                if(s && a+b == 9){ 
                    System.out.println(a + b);
                    System.out.println("Draw");
                    
                    
                }
            }

        }
    }

}
    

