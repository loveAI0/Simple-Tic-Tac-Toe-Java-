package TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;
public class InputHandler {

    static void gameStart(){
        String board = """
                ---------
                |       |
                |       |
                |       |
                --------- """;
        System.out.println(board);
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

        

            int i = row - 1;
            int j = column - 1;

            
            
           
            

            if(row < 1 || row > 3 || column < 1 || column > 3){
                System.out.println("Coordinates should be from 1 to 3!");
                processActions();
                
            }
            
            else if(GamePlay.choices[i][j] != ' '){ 
                System.out.println(GamePlay.choices[i][j]);
                System.out.println("This cell is occupied! Choose another one!");
                processActions();
               
            }
            else {
                System.out.println("Move");
                move = input.next().charAt(0);
                
                Grid grid = new Grid(i, j, move);
                GamePlay.fillGrid(grid);
                GamePlay.printGrid();
                

            }
        }
        catch(InputMismatchException e){
            System.out.println("You should enter numbers!");
            processActions();
        }
        
    }
}

    

