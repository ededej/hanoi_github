/**
 * Created by Shelby on 2/16/17.
 */
import java.util.*;

public class Player {
    private String name;
    private Disk disk;
    private Pole pole;
    Map<Disk, Pole> gameMap = new HashMap<Disk, Pole>();

    public Player setGameMap(Map<Disk, Pole> gameMap) {
        this.gameMap = gameMap;
        return this;
    }

    public void addDiskPole(Disk disk,Pole pole){
        gameMap.put(disk,pole);
    }


    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }





}
