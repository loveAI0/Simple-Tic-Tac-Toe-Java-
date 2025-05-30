import java.util.InputMismatchException;
import java.util.Scanner;
class Main{

    static void handler(char[][] grid){
        Scanner input = new Scanner(System.in);
        int row = 0, column = 0;
        try{
                
                System.out.println("row: ");
                row = input.nextInt();
               
                
                System.out.println("column: ");
                column = input.nextInt();
                input.nextLine();
              

                if(row < 1 || row > 3 || column < 1 || column > 3){
                    System.out.println("Coordinates should be from 1 to 3!");
                    Main.handler(grid);
                }
                
                else if(grid[row - 1][column - 1] != ' '){ 
                    System.out.println("This cell is occupied! Choose another one!");
                    Main.handler(grid);
                }
                else {
                    
                    Grid.printGrid(Grid.fillGrid(row - 1, column - 1, grid));
                }
            }
            catch(InputMismatchException e){
                System.out.println("You should enter numbers!");
                Main.handler(grid);
            }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     
        boolean s = true;
       
        int a = Grid.countO; 
        int b = Grid.countX;
        int c = Grid.count_;

      while(true){ 
            System.out.println("Choices: ");

            String choices = input.nextLine();
        
            char[][] grid = Grid.GridPattern(choices);

            
            Grid.printGrid(grid); 

            Main.handler(grid);

            
           
            //error handling
            

            /* 
            
                s = GamePlay.WinDiagonal(grid);
                if(!s){
                    s = GamePlay.row(grid);
                
                }
                if(!s){
                    s = GamePlay.column(grid);

                }
            
            
            if(!s) {
                System.out.println(a + b);
                if((a + b) == 9){
                    System.out.println("Draw");
                }
                else if(a == b &&  Grid.count_ >= 3){
                    System.out.println("Game not finished");
                }
                else{
                    System.out.println("Impossible");
                }
            }
                */
        }
    }

}