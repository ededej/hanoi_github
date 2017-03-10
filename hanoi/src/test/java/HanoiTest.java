/**
 * Created by Shelby on 2/20/17.
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HanoiTest {
    Player john;
    Pole one;
    Pole two;
    Pole three;
    Disk dBlu;
    Disk dRed;
    Disk dYellow;
    Disk dGreen;

    @Before
    public void setUpGame(){
        //creating player john and setting the name
        john= new Player();
        john.setName("John");
        //setting the pole by adding the pole to the player and setting the to a player john
        one= new Pole();
        one.setPlayer(john);
        john.addPole(one);

        two= new Pole();
        two.setPlayer(john);
        john.addPole(two);

        three= new Pole();
        three.setPlayer(john);
        john.addPole(three);
        // setting the disk to a pole and pole has disk on it
        dBlu=new Disk();
        dBlu.setColor("blu");
        dBlu.setPole(one);
        one.addDisk(dBlu);

        dRed=new Disk();
        dRed.setColor("red");
        dRed.setPole(one);
        one.addDisk(dRed);

        dYellow=new Disk();
        dYellow.setColor("yellow");
        dYellow.setPole(one);
        one.addDisk(dYellow);

        dGreen=new Disk();
        dGreen.setColor("green");
        dGreen.setPole(one);
        one.addDisk(dYellow);

    }

    // 1. one showing a disc being moved once
    @Test
    public void johnMovesDiskOnce(){
        dGreen.move(two);
        assertTrue(dGreen.getPole().equals(two));
    }

// 2. and one showing a disc being moved to a wrong tower with a too small disc and the move being rejected.
    @Test
    public void johnMovesBiggerDiskIntoAnotherPoleWithSmallerDisk(){
//        john.movesDisk("Green",2);
//        assertFalse(john.movesDisk("Yellow",2));


    }
}
