import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char[][] tictactoe = new char[3][3];
        String choices = input.nextLine();
        int index = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tictactoe[i][j] = choices.charAt(j + index);
                
            }
            index += 3;
        }
        // printing in grid style
        System.out.println("---------");
        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for(int j = 0; j < 3 ; j++){
                System.out.print(tictactoe[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");

    }
}