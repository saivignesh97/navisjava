import java.util.Objects;

public class Containers implements Comparable<Containers> {

    public int containerId;
    public String containerStatus;
    public int isoType;
    public int seal;
    public int cTareWeight;
    public int cPayWeight;
    public String CheId;
    boolean cDamage;


    @Override
    public boolean equals(Object o) {
       /* if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Containers that = (Containers) o;
        return Objects.equals(containerId, that.containerId);*/
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerId);
    }

    public void setContainerId(int containerId) {
        this.containerId = containerId;
    }

    public void setContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
    }

    public int getContainerId() {
        return containerId;
    }

    public String getContainerStatus() {

        return containerStatus;
    }

    public void set_to_che(String che_id) {


    }


    @Override
    public int compareTo(Containers o) {

        if(this.containerId==o.containerId)
            return 0;
        else if(this.containerId<o.containerId)
            return -1;
        else
            return 1;


    }

}
