import java.util.List;
import java.util.Set;

//import java.util.*;

/**
 * Created by Shelby on 2/17/17.
 */
public class Disk {
    private Pole pole;
    private String color;
    private Disk onTop;

    //setPole sets the pole that a disk is on
    public void setPole(Pole pole) {
        if(this.pole!=pole){
            Pole oldPole= this.pole;
            this.pole=pole;
            if(oldPole!= null){
                oldPole.removeDisk(this);
            }
            if(pole !=null){
                pole.addDisk(this);
            }
        }
    }
    public Pole getPole() {
        return pole;
    }

    //move(destination: Tower) move the disk into the destiantion tower by doing all
    // the necesary checks before setting to the new Pole
    public boolean move(Pole destinationPole){
        Set<Disk> disksOnDestination= destinationPole.getDisks();
        boolean moved=false;
        // if the list of the disk has size 0 than just put set the disk to that pole
        if(disksOnDestination.size()==0){
            this.setPole(destinationPole);
            moved=true;
        }else{// if we have other disks on that pole than do the checks.
            for(Disk disk: disksOnDestination){
                String colorOnTopCurrentDisk=this.getOnTop().getColor();
                //if the color of the disks that can sit on top match the color of disk on the pole
                // than move there.
                if(colorOnTopCurrentDisk.equals(disk.getColor())){
                    this.setPole(destinationPole);
                    moved=true;

                }
            }
        }

        return moved;
    }


    public Disk getOnTop() {
        return onTop;
    }

    public void setOnTop(Disk onTop) {
        if(this.onTop!=onTop){
            this.onTop=onTop;
        }
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
