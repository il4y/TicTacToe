/**
 * Ende
 */
public class Ende implements GameInterface {

    GameContext c;

    public Ende(GameContext gameContext) {
        c = gameContext;
    }

    @Override
    public void startPressed() {
    }

    @Override
    public void XTurn(int n) {
    }

    @Override
    public void OTurn(int n) {
    }

    @Override
    public void endePressed() {
        System.out.println("Für ein neues Spiel bitte Taste drücken!");
        c.getWorld().initGameWorld();
        c.setState(c.splash);
    }

   
}