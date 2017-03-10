/**
 * Created by Shelby on 2/20/17.
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HanoiTest {
    Player john;

    @Before
    public void setUpGame(){
//        john= new Player();
//        john.setName("John");
//        john.setPolesSize(3);
//        john.addDiskPole("Blue",1);
//        john.addDiskPole("Red",1);
//        john.addDiskPole("Yellow",1);
//        john.addDiskPole("Green",1);
    }

    // 1. one showing a disc being moved once
    @Test
    public void johnMovesDiskOnce(){
//        john.movesDisk("Green",2);
//        Disk disk= john.findDisk("Green");
//        assertTrue(disk.getPole()==2);
    }

// 2. and one showing a disc being moved to a wrong tower with a too small disc and the move being rejected.
    @Test
    public void johnMovesBiggerDiskIntoAnotherPoleWithSmallerDisk(){
//        john.movesDisk("Green",2);
//        assertFalse(john.movesDisk("Yellow",2));


    }
}
