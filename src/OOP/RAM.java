package OOP;

public class RAM extends Motherboard {
    private String serialNumber;



    public RAM(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {
        super(id, producer, model, serialNumber, connectionType);
        this.serialNumber = serialNumber;

    }

}
