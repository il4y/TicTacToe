/**
 * XPlay
 */
public class XPlay implements GameInterface {

    GameContext c;
    
    public XPlay(GameContext gameContext) {
        c = gameContext;
    }

    @Override
    public void startPressed() {
    }

    @Override
    public void XTurn(int i) {
        if (c.getWorld().setGameWorld("X", i)) {
            c.getWorld().printGameWorld();
            if (c.getWorld().won("X")) {
                System.out.println("X hat gewonnen!");
                c.setState(c.getGewonnen());
            }
            else if (c.getWorld().isDraw()) {
                System.out.println("Unentschieden!");
                c.setState(c.getGewonnen());
            }
            else {
                System.out.println("X hat gezogen auf "+ i +", O ist am Zug!");
                c.setState(c.getOZug());
            }
        }
        else {
            System.out.println("Feld "+ i +" belegt, X ist weiter am Zug!");
        }
    }

    @Override
    public void OTurn(int i) {
    }

    @Override
    public void endePressed() {
    }
}