
package GuessGame.jb;
import java.util.Random;
import javax.swing.JOptionPane;
public class GuessGameJB {


    public static void main(String[] args) {
        
        
        GuessGame myGame = new GuessGame();
        
      
        
        
    }

    private static class GuessGame {

        public GuessGame() {
            
                    
            
        }

       
    }

    private static class startGame {

        public startGame() {
            startGame newOne = new startGame();
            
            
            Random rand = new Random();
            int chance = rand.nextInt();
            System.out.println(chance);
            
             String input1 = (String)JOptionPane.showInputDialog(null,
                "Type A Number",
                "Number Game",
                1,
                null,
                null,
                "Type something here.");
             System.out.println(input1);
          
        }
    }
    
}
