/**
 * Ende
 */
public class Ende implements GameInterface {

    GameContext c;

    public Ende(GameContext gameContext) {
        c = gameContext;
    }

    @Override
    public void turns(int n) {
        
    }

    @Override
    public void turns() {
        System.out.println("Für ein neues Spiel bitte Taste drücken!");
        c.getWorld().initGameWorld();
        c.setState(c.splash);
    }

   
}