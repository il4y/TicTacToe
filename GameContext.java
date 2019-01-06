/**
 * GameContext
 */
public class GameContext {

    GameInterface splash;
    GameInterface XPlay;
    GameInterface OZug;
    GameInterface gewonnen;
    GameInterface current;
    GameWorld world;

 
    public GameContext() {
        splash = new Splash(this);
        XPlay = new XPlay(this);
        OZug = new OPlay(this);
        gewonnen = new Ende(this);
        current = splash;

        world = new GameWorld();
    }

    public GameWorld getWorld() {
        return world;
    }

    
    
    public GameInterface getSplash() {
        return splash;
    }

    public GameInterface getXZug() {
        return XPlay;
    }

    public GameInterface getOZug() {
        return OZug;
    }

    public GameInterface getGewonnen() {
        return gewonnen;
    }

    public void setState(GameInterface g) {
        current = g;
    }

    public void startPressed() {
        current.startPressed();

    }

    public void XTurn(int n) {
        current.XTurn(n);
    }

    public void OTurn(int n) {
        current.OTurn(n);
    }

    public void endePressed() {
        current.endePressed();
    }

    

    void Turn(int i) {
        if (current == this.XZug) {
            current.XTurn(i);
        } else {
            current.OTurn(i);
        }
    }

    void pressed() {
        if (current == this.splash) {
            current.startPressed();
        } else {
            current.endePressed();
        }
    }
    
}