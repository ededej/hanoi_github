import java.util.*;

/**
 * Created by Shelby on 2/17/17.
 */
public class Pole {

    private Set<Disk> disks= new LinkedHashSet<Disk>();
    private Player player;
    public boolean addDisk(Disk disk) {
        boolean checkDisk = disks.add(disk);
        if (checkDisk && disk != null) {
            disk.setPole(this);
        }
        return checkDisk;
    }

    public boolean removeDisk(Disk disk) {
        boolean checkDisk= disks.remove(disk);
        if(checkDisk && disk!=null) {
            disk.setPole(null);
        }
        return checkDisk;
    }

    public Set<Disk> getDisks() {
                return Collections.unmodifiableSet(disks);
            }


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
