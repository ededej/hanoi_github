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
        dRed.setOnTop(dBlu);
        dYellow=new Disk();
        dYellow.setColor("yellow");
        dYellow.setPole(one);
        one.addDisk(dYellow);
        dYellow.setOnTop(dRed);

        dGreen=new Disk();
        dGreen.setColor("green");
        dGreen.setPole(one);
        one.addDisk(dYellow);
        dGreen.setOnTop(dYellow);
    }

    //The first three test just test the disk and pole methods
    // 1. one showing a disc being moved once
    @Test
    public void movesDiskOnceToNewPole(){
        assertTrue(dGreen.move(two));
        assertTrue(dGreen.getPole().equals(two));
    }

// 2. and one showing a disc being moved to a wrong tower with a too small disc and the move being rejected.
    @Test
    public void movesBiggerDiskIntoAnotherPoleWithSmallerDisk(){
        dGreen.move(two);
        assertFalse(dRed.move(two));
    }

    @Test
    public void diskMovesToAnotherWithBiggerDisk(){
        dYellow.move(three);
        assertTrue(dGreen.move(three));
    }

    //this test are testing with Player john that make the moves
    @Test
    public void johnMovesDiskOnceToNewPole() {
        assertTrue(john.moveDiskToPole(dGreen,two));
    }
    @Test
    public void johnMovesBiggerDiskIntoAnotherPoleWithSmallerDisk(){
        john.moveDiskToPole(dGreen,two);
        assertFalse(john.moveDiskToPole(dRed,two));
    }
    @Test
    public void johnMovesDiskToAnothePoleWithBiggerDisk(){
        dYellow.move(three);
        john.moveDiskToPole(dYellow,three);
        assertTrue(john.moveDiskToPole(dGreen,three));
    }

}
