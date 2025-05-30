


import java.util.InputMismatchException;
import java.util.Scanner;
public class InputHandler {

    static private char[][] tictactoe = new char[3][3];
    static private int countO = 0, countX = 0;
    
    
  
    static void gameStart(){
        tictactoe = GamePlay.printGrid();
    }
   

    

   static void processActions(){
        Scanner input = new Scanner(System.in);
        
        
        int row = 0, column = 0;
        char move = ' ';
        try{
                
            System.out.println("row: ");
            row = input.nextInt();
            
            
            System.out.println("column: ");
            column = input.nextInt();
            input.nextLine();

            System.out.println("Move");
            move = input.next().charAt(0);
            
            System.out.println(move);

            if(row < 1 || row > 3 || column < 1 || column > 3){
                System.out.println("Coordinates should be from 1 to 3!");
                processActions();
                
            }
            
            else if(tictactoe[row - 1][column - 1] != ' '){ 
                System.out.println("This cell is occupied! Choose another one!");
                processActions();
               
            }
            else {
                int i = row - 1;
                int j = column - 1;
                Grid grid = new Grid(i, j, move);
                GamePlay.fillGrid(grid);
                

            }
        }
        catch(InputMismatchException e){
            System.out.println("You should enter numbers!");
            processActions();
        }
    }
}

    

