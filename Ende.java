/**
 * Ende
 */
public class Ende implements GameInterface {

    GameContext c;

    public Ende(GameContext gameContext) {
        c = gameContext;
    }

    @Override
    public void start() {
    }

    @Override
    public void XTurn(int n) {
    }

    @Override
    public void OTurn(int n) {
    }

    @Override
    public void end() {
        System.out.println("Für ein neues Spiel bitte Taste drücken!");
        c.getWorld().initGameWorld();
        c.setState(c.splash);
    }

   
}