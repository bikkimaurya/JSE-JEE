

package mini.pojo;

/**
 *
 * @author bikrant bikram
 */
public class BusRoutPojo
{

    @Override
    public String toString() {
        return "BusRoutPojo{" + "busRout=" + busRout + ", rout=" + rout + '}';
    }

    public BusRoutPojo(int busRout, String rout) {
        this.busRout = busRout;
        this.rout = rout;
    }

    public BusRoutPojo() {
    }

    public int getBusRout() {
        return busRout;
    }

    public void setBusRout(int busRout) {
        this.busRout = busRout;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }
   private int busRout;
   private String rout;
    
}
