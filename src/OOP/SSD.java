package OOP;

public class SSD extends Motherboard{

    public SSD(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {
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
