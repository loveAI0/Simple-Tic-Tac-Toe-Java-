import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     
        boolean s = true;
        int a = Grid.countO;
        int b = Grid.countX;
        int c = Grid.count_;
      while(true){ 
            String choices = input.nextLine();
        
            char[][] grid = Grid.GridPattern(choices);

            
            Grid.printGrid(grid);
            
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
      }
    }

}