import java.util.List;

/**
 * Created by Shelby on 2/17/17.
 */
public class Disk {
    private int size;
    private int poleNumber;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null){
            throw new IllegalArgumentException(
                    "Color must not be null!");
        }
        this.color = color;
    }

    public int getPole() {
        return poleNumber;
    }

    public void setPole(int pole) {
        if(pole<=0 ){
            throw new IllegalArgumentException(
                    "Pole must not bigger than 0!");
        }
        this.poleNumber = pole;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size<0 ){
            throw new IllegalArgumentException(
                    "Size must not bigger than 0!");
        }
        this.size = size;
    }

}
