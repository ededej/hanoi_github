import java.util.*;

/**
 * Created by Shelby on 2/17/17.
 */
public class Pole {
    private Disk disk;
    private int poleNumber;
    private Set<Disk> setOfDisk= new HashSet<Disk>();

    public Set<Disk> getSetOfDisk() {
        return setOfDisk;
    }

    public Pole setSetOfDisk(Set<Disk> setOfDisk) {
        if(setOfDisk==null){
            throw new IllegalArgumentException(
                    "Set of disks must not be null!");
        }
        this.setOfDisk = setOfDisk;
        return this;
    }


    public Disk getDisk() {
        return disk;
    }

    public Pole setDisk(Disk disk) {
        if(disk==null){
            throw new IllegalArgumentException(
                    "Disk must not be null!");
        }
        this.disk = disk;
        return this;
    }

    public int getPoleNumber() {
        return poleNumber;
    }

    public Pole setPoleNumber(int poleNumber) {
        if(poleNumber<=0 ){
            throw new IllegalArgumentException(
                    "Pole number must not bigger than 0!");
        }
        this.poleNumber = poleNumber;
        return this;
    }

    public boolean addDisk(Disk d){
        return setOfDisk.add(d);
    }

}
