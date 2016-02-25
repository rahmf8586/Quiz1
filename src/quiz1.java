
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahmf8586
 */
public class quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE bob = new RobotSE(kw, 4, 0, Direction.EAST);
        new Thing (kw, 4, 1);
        new Thing (kw, 3, 2);
        new Thing (kw, 2, 3);
        new Thing (kw, 1, 4);
        new Wall (kw, 4, 2, Direction.WEST);
        new Wall (kw, 4, 2, Direction.NORTH);
        new Wall (kw, 3, 3, Direction.WEST);
        new Wall (kw, 3, 3, Direction.NORTH);
        new Wall (kw, 2, 4, Direction.WEST);
        new Wall (kw, 2, 4, Direction.NORTH);
        new Wall (kw, 2, 5, Direction.NORTH);
        new Wall (kw, 2, 5, Direction.EAST);
        new Wall (kw, 3, 6, Direction.NORTH);
        new Wall (kw, 3, 6, Direction.EAST);
        new Wall (kw, 4, 7, Direction.NORTH);
        new Wall (kw, 4, 7, Direction.EAST);
        
        
        bob.move();
        while (bob.canPickThing()) {
            bob.pickThing();
            bob.turnLeft();
            bob.move();
            bob.turnRight();
            bob.move();
            if (bob.countThingsInBackpack()==3) {
                break;
            }
        }
        bob.pickThing();
        bob.move();
        
        while (bob.frontIsClear()) {
            bob.putThing();
            bob.move();
            bob.turnRight();
            bob.move();
            bob.turnLeft();
            
            if (bob.countThingsInBackpack()==1) {
                break;
            }
        }
        bob.putThing();
        bob.move();

        
        }
        
    }

