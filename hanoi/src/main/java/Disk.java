import java.util.List;
import java.util.Set;

/**
 * Created by Shelby on 2/17/17.
 */
public class Disk {
    private Pole pole;
    private int size;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Disc:move(destination: Tower)
    public boolean move(Pole destinationPole){
        Set<Disk> disksOnDestination= destinationPole.getDisks();

        this.setPole(pole);
        return false;
    }
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

}
