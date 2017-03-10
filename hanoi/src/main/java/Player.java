/**
 * Created by Shelby on 2/16/17.
 */
import java.util.*;

public class Player {
    private Set<Pole> poles= new LinkedHashSet<Pole>();
    private String name;

    // addPole adds the pole in set of poles that each player has
    public boolean addPole(Pole pole) {
        boolean checkDisk= poles.add(pole);
        if(checkDisk && pole!=null){
            pole.setPlayer(this);
        }
        return checkDisk;
    }

    //removes the poles from the set of poles that player has.
    public boolean removePole(Pole pole) {
        boolean checkDisk= poles.add(pole);
        if(checkDisk && pole!=null){
            pole.setPlayer(null);
        }
        return checkDisk;
    }

    public Set<Pole> getPoles() {
        return Collections.unmodifiableSet(poles);
    }


    //this method just calls the move() method of the Disk class when player move the disk to a new pole
    public boolean moveDiskToPole(Disk disk, Pole poleDestination) {
        boolean check=false;
        check=disk.move(poleDestination);
        return check;
    }
    public void setName(String name)
    {
        this.name=name;
    }

}
