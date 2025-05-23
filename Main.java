import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     
        boolean s = true;
      
            String choices = input.nextLine();
        
            char[][] grid = Grid.GridPattern(choices);

            
            Grid.printGrid(grid);
            
            s = Game1.WinDiagonal(grid);
            if(!s){
                s = Game1.row(grid);
                
            }
            if(!s){
                Game1.column(grid);

            }  
    }
}