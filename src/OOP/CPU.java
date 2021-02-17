package OOP;

public class CPU extends Motherboard{

    public CPU(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {
        super(id, producer, model, serialNumber, connectionType);

    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "CPU connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' ;
    }
}
