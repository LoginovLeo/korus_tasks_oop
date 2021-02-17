package OOP;

public class Motherboard  {
    int id;
    String producer;
    String model;
    String serialNumber;
    ConnectionType connectionType;

    public int getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Motherboard(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {
        this.id = id;
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "Motherboard connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' ;
    }
}
