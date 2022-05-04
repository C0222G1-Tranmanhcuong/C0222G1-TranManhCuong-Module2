package case_study_module2.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String idFacility,
                String nameService,
                double areaUse,
                int rentalPrice,
                int peopleMax,
                String styleRental,
                String freeService) {
        super(idFacility, nameService, areaUse, rentalPrice, peopleMax, styleRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
}