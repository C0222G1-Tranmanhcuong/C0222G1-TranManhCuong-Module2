package case_study_module2.models.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private  int floor;

    public Villa() {
    }

    public Villa(String idFacility,
                 String nameService,
                 double areaUse,
                 int rentalPrice,
                 int peopleMax,
                 String styleRental,
                 String roomStandard,
                 double areaPool,
                 int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, peopleMax, styleRental);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                '}';
    }
}
