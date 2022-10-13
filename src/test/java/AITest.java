import AI.*;
import Logic.*;

class AITest {

    // TODO Use Parameterized Tests

    @org.junit.jupiter.api.Test
    void winnableMoveTest() {

        Game manager = new Game(5);
        Tile[][] tiles = new Tile[5][5];
        tiles[0][0] = new Tile(0,0,2);
        tiles[0][3] = new Tile(0,3,2);
        tiles[3][1] = new Tile(3,1,2);
        tiles[3][0] = new Tile(3,0,1);
        tiles[4][1] = new Tile(4,1,1);
        tiles[2][1] = new Tile(2,1,1);
        tiles[2][2] = new Tile(2,2,1);
        tiles[4][2] = new Tile(4,2,1);

        for (int n = 0; n <= 4; n++) {
            for (int i = 0; i <= 4; i++) {
                if(tiles[n][i] == null){
                    tiles[n][i] = new Tile(n,i ,0);
                }
            }
        }
        executeTest(manager, tiles);
    }
        @org.junit.jupiter.api.Test
        void movementScoringTestBlack() {

            Game manager = new Game(5);
            Tile[][] tiles = new Tile[5][5];
            tiles[4][4] = new Tile(4,4,2);
            tiles[4][3] = new Tile(4,3,2);
            tiles[0][3] = new Tile(0,3,2);
            tiles[0][4] = new Tile(0,4,0);
            tiles[4][1] = new Tile(4,1,0);
            tiles[2][1] = new Tile(2,1,0);
            tiles[2][3] = new Tile(2,3,0);
            tiles[1][4] = new Tile(1,4,0);

            for (int n = 0; n <= 4; n++) {
                for (int i = 0; i <= 4; i++) {
                    if(tiles[n][i] == null){
                        tiles[n][i] = new Tile(n,i ,1);
                    }
                }
            }
            executeTest(manager, tiles);
        }
    @org.junit.jupiter.api.Test
    void movementScoringTestWhite() {

        Game manager = new Game(5);
        Tile[][] tiles = new Tile[5][5];
        tiles[4][0] = new Tile(4,0,2);
        tiles[4][2] = new Tile(4,2,2);
        tiles[3][4] = new Tile(3,4,2);
        tiles[3][0] = new Tile(3,0,0);
        tiles[3][2] = new Tile(4,2,0);
        tiles[2][1] = new Tile(2,1,0);
        tiles[2][2] = new Tile(2,2,0);

        for (int n = 0; n <= 4; n++) {
            for (int i = 0; i <= 4; i++) {
                if(tiles[n][i] == null){
                    tiles[n][i] = new Tile(n,i ,1);
                }
            }
        }
        executeTest(manager, tiles);
    }
    public void executeTest(Game manager, Tile[][] tiles){
        manager.setBoard(tiles,1);
        AINormal ai = new AINormal();
        ai.calculateNextMove(1, manager);
        if(manager.getTiles()[3][0].getState() == 1){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
    }


