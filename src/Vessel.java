public class Vessel {

    public String vesselId;
    public String lop;
    public long containerCount;
    public String manufacturer;
    public long weight;
    public boolean isOperative;
    public Containers[] c;
    public int fuelCapacity;

    public long noOfContainers() {
        return containerCount;
    }

    public String getLop() {
        return lop;
    }

    public void setVesselId(String vesselId) {
        this.vesselId = vesselId;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

}
