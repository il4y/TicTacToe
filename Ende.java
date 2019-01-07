/**
 * Ende
 */
public class Ende implements GameInterface {

    GameContext c;

    public Ende(GameContext gameContext) {
        c = gameContext;
    }

    @Override
    public void splash() {
        
    }

    @Override
    public void turns(int n) {
        
    }

    @Override
    public void end() {
        System.out.println("Fuer ein neues Spiel bitte Taste druecken!");
        c.getWorld().initGameWorld();
        c.setState(c.splash);
    }

   
}