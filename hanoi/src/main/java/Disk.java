import java.util.List;

/**
 * Created by Shelby on 2/17/17.
 */
public class Disk {
    private Pole pole;

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
        this.pole = pole;
    }
    public Pole getPole() {
        return pole;
    }

}
