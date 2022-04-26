package case_study_module2.models.facility;

public class House extends Facility {
    private int floor;

    public House() {
    }

    public House(String idFacility, String nameService, double areaUse,
                 int rentalPrice, int peopleMax, String styleRental, int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, peopleMax, styleRental);
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor=" + floor +
                '}';
    }
}
