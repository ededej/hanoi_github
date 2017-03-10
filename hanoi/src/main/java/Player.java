/**
 * Created by Shelby on 2/16/17.
 */
import java.util.*;

public class Player {
    private Set<Pole> poles= new LinkedHashSet<Pole>();
    private String name;

    public boolean addPole(Pole pole) {
        boolean checkDisk= poles.add(pole);
        if(checkDisk && pole!=null){
            pole.setPlayer(this);
        }
        return checkDisk;
    }
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

    public void setName(String name)
    {
        this.name=name;
    }
}
