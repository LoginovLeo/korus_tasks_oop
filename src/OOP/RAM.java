package OOP;

public class RAM extends Motherboard {
    private String serialNumber;



    public RAM(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {
        super(id, producer, model, serialNumber, connectionType);
        this.serialNumber = serialNumber;

    }
    private String toString1() {
        return "RAM connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", serial='" + serialNumber + '\''+
                ", connection='" + connectionType + '\'';
    }

    @Override
    public String toString() {
        return "RAM connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", serial='" + serialNumber + '\'';
    }
}
