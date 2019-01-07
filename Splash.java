/**
 * Splash
 */
public class Splash implements GameInterface {

    GameContext c;
    
    public Splash(GameContext gameContext) {
        c = gameContext;
        System.out.println("TicTacToe Spiel (zum starten 's' und Return drücken)");
    }
    
 
    @Override
    public void turns() {
        System.out.println("X ist am Zug!");
        c.setState(c.getXZug());
    }

    @Override
    public void turns(int n) {
        
    }
}