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
    static int ddr4 = 4;
    static int sata = 3;
    static int socket = 1;




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
            System.out.println("All connectors of POWER completed");
        }
        try {

            if (connectionType.equals(ConnectionType.PCI_E)) {
                pciE--;
                if (pciE < 0) throw new Exception();

            }

        } catch (Exception e) {
            System.out.println("All connectors of PCI-E completed");
        }
        try {

            if (connectionType.equals(ConnectionType.DDR4)) {
                ddr4--;
                if (ddr4 < 0) throw new Exception();

            }

        } catch (Exception e) {
            System.out.println("All slots of DDR4 completed");

        }

        try {

            if (connectionType.equals(ConnectionType.SATA)) {
                sata--;
                if (sata < 0) throw new Exception();

            }

        } catch (Exception e) {
            System.out.println("All slots of SATA completed");
        }

        try {

            if (connectionType.equals(ConnectionType.Socket1155)) {
                socket--;
                if (socket < 0) throw new Exception();

            }

        } catch (Exception e) {
            System.out.println("All slots of Socket1155 completed");
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
        } else if (component.getConnectionType().equals(ConnectionType.DDR4)) {
            ddr4++;
        }
        else if (component.getConnectionType().equals(ConnectionType.SATA)) {
            sata++;
        } else if (component.getConnectionType().equals(ConnectionType.Socket1155)) {
            socket++;
        }
    }

    public void addComponent(List<Motherboard> listOfComponents, Motherboard component) {
        listOfComponents.add(component);
        System.out.println("Add component " +
                " Producer: " + component.producer +
                ", model: " + component.model +
                ", serial number: " + component.getSerialNumber());


    }

    @Override
    public String toString() {
        return "Motherboard connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'';
    }
}
