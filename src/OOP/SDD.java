package OOP;

public class SDD extends Motherboard{

    public SDD(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {
        super(id, producer, model, serialNumber, connectionType);

    }

    @Override
    public String toString() {
        return "SDD connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' ;
    }
}
