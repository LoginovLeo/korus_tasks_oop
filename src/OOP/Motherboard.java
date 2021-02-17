package OOP;

import jdk.jfr.StackTrace;

import java.util.List;

public class Motherboard {
    int id;

    String producer;
    String model;
    String serialNumber;
    ConnectionType connectionType;

    static int power = 2;
    static int pciE = 3;



    public Motherboard() {

    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public int getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Motherboard(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {

        this.id = id;
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
        this.connectionType = connectionType;
        try {
            if (connectionType.equals(ConnectionType.POWER)) {
                power--;
                if (power < 0) {
                    throw new Exception();

                }

            }
        } catch (Exception e) {
            System.out.println("Все разъемы POWER заняты, не возможно подключить устройство с таким разъемом");
        }
        try {

            if (connectionType.equals(ConnectionType.PCI_E)) {
                pciE--;
                if (pciE < 0) throw new Exception();

            }

        } catch (Exception e) {
            System.out.println("Все разъемы PCI-E заняты, не возможно подключить устройство с таким разъемом");
        }


    }


    public void deleteComponent(List<Motherboard> listOfComponents, Motherboard component) {

        listOfComponents.removeIf(e -> e.getSerialNumber().equals(component.getSerialNumber()));
        System.out.println("Delete component " +
                " Producer: " + component.producer +
                ", model: " + component.model +
                ", serial number: " + component.getSerialNumber());

        if (component.getConnectionType().equals(ConnectionType.PCI_E)) {
            pciE++;
        } else if (component.getConnectionType().equals(ConnectionType.POWER)) {
            power++;
        }
    }


    public void addComponent(List<Motherboard> listOfComponents, Motherboard component) {
        listOfComponents.add(component);
        //listOfComponents.forEach(System.out::println);

    }

    @Override
    public String toString() {
        return "Motherboard connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'';
    }
}
