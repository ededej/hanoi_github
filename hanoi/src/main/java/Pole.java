import java.util.*;

/**
 * Created by Shelby on 2/17/17.
 */
public class Pole {

    private Set<Disk> disks= new LinkedHashSet<Disk>();
    private Player player;

    //adds the disk inside the Set linkedhashset to keep truck of the disks on the pole
    public boolean addDisk(Disk disk) {
        boolean checkDisk = disks.add(disk);
        if (checkDisk && disk != null) {
            disk.setPole(this);
        }
        return checkDisk;
    }

    //removes the disk from the disks set and checks if it remove to set the pole to null
    public boolean removeDisk(Disk disk) {
        boolean checkDisk= disks.remove(disk);
        if(checkDisk && disk!=null) {
            disk.setPole(null);
        }
        return checkDisk;
    }

    //return the immutable version the set of disks on this pole.
    public Set<Disk> getDisks() {
                return Collections.unmodifiableSet(disks);
            }

    // set  a player to the pole
    public void setPlayer(Player player) {
        if(this.player!=player){
            Player oldPlayer= this.player;
            this.player=player;
            if(oldPlayer!= null){
                oldPlayer.removePole(this);
            }
            if(player !=null){
                player.addPole(this);
            }
        }
    }

}
