package OOP;

public class HDD extends Motherboard{

    public HDD(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {
        super(id, producer, model, serialNumber, connectionType);

    }

    @Override
    public String toString() {
        return "HDD connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'';
    }
}
