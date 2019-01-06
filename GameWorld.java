public class GameWorld{
    String[][] gameWorld = new String[3][3];

    public GameWorld(){
        this.initGameWorld();
    }

    public void initGameWorld() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameWorld[i][j] = "#";
            }
        }
    }

    public void printGameWorld(){
        System.out.println("Game World: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" " + gameWorld[j][i]);
            }
            System.out.println(" ");
        }
    }

    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameWorld[j][i].equals("#")) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean setGameWorld(String x, int n) {

        switch (n) {
            case 1:
                if (!gameWorld[0][0].equals("#")) {
                    return false;
                }
                gameWorld[0][0] = x;
                break;
            case 2:
                if (!gameWorld[1][0].equals("#")) {
                    return false;
                }
                gameWorld[1][0] = x;
                break;
            case 3:
                if (!gameWorld[2][0].equals("#")) {
                    return false;
                }
                gameWorld[2][0] = x;
                break;
            case 4:
                if (!gameWorld[0][1].equals("#")) {
                    return false;
                }
                gameWorld[0][1] = x;
                break;
            case 5:
                if (!gameWorld[1][1].equals("#")) {
                    return false;
                }
                gameWorld[1][1] = x;
                break;
            case 6:
                if (!gameWorld[2][1].equals("#")) {
                    return false;
                }
                gameWorld[2][1] = x;

                break;
            case 7:
                if (!gameWorld[0][2].equals("#")) {
                    return false;
                }
                gameWorld[0][2] = x;

                break;
            case 8:
                if (!gameWorld[1][2].equals("#")) {
                    return false;
                }
                gameWorld[1][2] = x;

                break;
            case 9:
                if (!gameWorld[2][2].equals("#")) {
                    return false;
                }
                gameWorld[2][2] = x;

                break;
        }
        return true;
    }

    public boolean gameWon(String s) {
        if (gameWorld[0][0].equals(s) && gameWorld[1][0].equals(s) && gameWorld[2][0].equals(s)) {
            return true;
        }
        if (gameWorld[0][1].equals(s) && gameWorld[1][1].equals(s) && gameWorld[2][1].equals(s)) {
            return true;
        }
        if (gameWorld[0][2].equals(s) && gameWorld[1][2].equals(s) && gameWorld[2][2].equals(s)) {
            return true;
        }

        if (gameWorld[0][0].equals(s) && gameWorld[0][1].equals(s) && gameWorld[0][2].equals(s)) {
            return true;
        }
        if (gameWorld[1][0].equals(s) && gameWorld[1][1].equals(s) && gameWorld[1][2].equals(s)) {
            return true;
        }
        if (gameWorld[2][0].equals(s) && gameWorld[2][1].equals(s) && gameWorld[2][2].equals(s)) {
            return true;
        }

        if (gameWorld[0][0].equals(s) && gameWorld[1][1].equals(s) && gameWorld[2][2].equals(s)) {
            return true;
        }
        if (gameWorld[2][0].equals(s) && gameWorld[1][1].equals(s) && gameWorld[0][2].equals(s)) {
            return true;
        }

        return false;
    }

}