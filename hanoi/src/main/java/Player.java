/**
 * Created by Shelby on 2/16/17.
 */
import java.util.*;

public class Player {
    private String name;
    private List<Disk> disks= new ArrayList<Disk>();
    private int size=0; //keeps track of how many disks are there and number them from the biggest to the smallest
    private List<Pole> listOfPoles= new ArrayList<Pole>();

    public List<Pole> getListOfPoles() {
        return listOfPoles;
    }
    public void setPolesSize(int sizeOfPoles) {
        if(sizeOfPoles<=0 ){
            throw new IllegalArgumentException(
                    "Size of poles must be integer bigger than 0!");
        }
        for(int i=0; i<sizeOfPoles;i++){
            Pole p= new Pole();
            p.setPoleNumber(i+1);
            listOfPoles.add(p);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean addDiskPole(String color, int poleNumber){
        if(color==null){
            throw new IllegalArgumentException(
                    "Disk color must not be null!");
        }
        if(poleNumber<=0 ){
            throw new IllegalArgumentException(
                    "Pole number must be integer bigger than 0!");
        }
        Disk d= new Disk();
        d.setColor(color);
        d.setPole(poleNumber);
        if (disks.contains(d)){
            return false;
        }else {
            listOfPoles.get(poleNumber-1).addDisk(d);
            d.setSize(size++);
            return disks.add(d);
        }
    }

    public boolean movesDisk(String diskColor, int poleNumber){
        if(diskColor==null){
            throw new IllegalArgumentException(
                    "Disk color must not be null!");
        }
        if(poleNumber<=0 ){
            throw new IllegalArgumentException(
                    "Pole number must be integer bigger than 0!");
        }
        Disk movingDisk= findDisk(diskColor);
        int sizeOfDisk= movingDisk.getSize();
        Pole pole= listOfPoles.get(poleNumber-1);
        Set<Disk> setOfDiskOnPole= pole.getSetOfDisk();
        boolean check=false;
        if (setOfDiskOnPole.size()!=0) {
            for (Disk d : setOfDiskOnPole) {
                if (d.getSize() < sizeOfDisk) {
                    movingDisk.setPole(poleNumber);
                    check=true;
                }
            }
        }else {// if pole is empty just move the disk there
            movingDisk.setPole(poleNumber);
            listOfPoles.get(poleNumber-1).addDisk(movingDisk);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        if(name==null){
            throw new IllegalArgumentException(
                    "Name of the player must not be null!");
        }
        this.name = name;
        return this;
    }

    public Disk findDisk(String diskColor) {

        for(int i=0; i<disks.size();i++){
            Disk d= disks.get(i);
            if (diskColor.equals(d.getColor())){
                return d;
            }
        }
        return null ;
    }


}
