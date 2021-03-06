/**
 * GameContext
 */
public class GameContext {

    GameInterface splash;
    GameInterface xPlay;
    GameInterface oPlay;
    GameInterface win;
    GameInterface current;
    GameWorld gameWorld;

 
    public GameContext() {
        splash = new Splash(this);
        xPlay = new XPlay(this);
        oPlay = new OPlay(this);
        win = new Ende(this);
        current = splash;

        gameWorld = new GameWorld();
    }

    public GameWorld getWorld() {
        return gameWorld;
    }

    
    
    public GameInterface getSplash() {
        return splash;
    }

    public GameInterface getXZug() {
        return xPlay;
    }

    public GameInterface getOZug() {
        return oPlay;
    }

    public GameInterface getGewonnen() {
        return win;
    }

    public void setState(GameInterface g) {
        current = g;
    }

    void choice() {
        if (current == this.splash) {
            current.splash();
        } else {
            current.end();
        }
    }

    void Turn(int i) {
        if (current == this.xPlay) {
            current.turns(i);
        } else {
            current.turns(i);
        }
    }


    public void start() {
        current.splash();

    }

    public void XTurn(int n) {
        current.turns(n);
    }

    public void OTurn(int n) {
        current.turns(n);
    }

    public void end() {
        current.end();
    }

    
}