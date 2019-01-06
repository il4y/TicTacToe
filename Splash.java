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
    public void startPressed() {
        System.out.println("X ist am Zug!");
        c.setState(c.getXZug());
    }

    @Override
    public void XTurn(int n) {
    }

    @Override
    public void OTurn(int n) {
    }

    @Override
    public void endePressed() {
        }

}