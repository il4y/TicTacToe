import java.util.Optional;
import java.util.OptionalInt;

/**
 * OPlay
 */
public class OPlay implements GameInterface {

    GameContext c;
    
    public OPlay(GameContext gameContext) {
        c = gameContext;
    }

    @Override
    public void turns(int i) {
        if (c.getWorld().setGameWorld("O", i)) {
            c.getWorld().printGameWorld();
            if (c.getWorld().gameWon("O")) {
                System.out.println("O hat gewonnen!");
                c.setState(c.getGewonnen());
            }
            else if (c.getWorld().isDraw()) {
                System.out.println("Unentschieden!");
                c.setState(c.getGewonnen());
            }
            else {
                System.out.println("O hat gezogen auf "+ i +", X ist am Zug!");
                c.setState(c.getXZug());
            }
        }
        else {
            System.out.println("Feld "+ i +" belegt, O ist weiter am Zug!");
        }
    }
    @Override
    public void turns() {
        
    }
}