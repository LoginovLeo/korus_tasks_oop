package OOP;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Motherboard extends PC{
    private int id;
    private int power;
    private int pciE;
    private int ddr4;
    private int sata;
    private int socket;
    private String producer;
    private String model;
    private String serialNumber;
    private ConnectionType connectionType;


    public Motherboard() {

    }

    public Motherboard(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {
        this.id = id;
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
        this.connectionType = connectionType;

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


    public Motherboard(int id, String producer, String model, String serialNumber, ConnectionType connectionType, int power, int pciE, int ddr4, int sata, int socket) {

        this.id = id;
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
        this.connectionType = connectionType;
        this.power = power;
        this.pciE = pciE;
        this.ddr4 = ddr4;
        this.sata = sata;
        this.socket = socket;


    }

    public Map<ConnectionType, Integer> createMap(Motherboard motherboard, List<Motherboard> listOfComponents) {
        Map<ConnectionType, Integer> connectionsOfMotherboard = new HashMap<>();
        connectionsOfMotherboard.put(ConnectionType.POWER, motherboard.power);
        connectionsOfMotherboard.put(ConnectionType.PCI_E, motherboard.pciE);
        connectionsOfMotherboard.put(ConnectionType.DDR4, motherboard.ddr4);
        connectionsOfMotherboard.put(ConnectionType.SATA, motherboard.sata);
        connectionsOfMotherboard.put(ConnectionType.Socket1155, motherboard.socket);

        Integer powerConnections = connectionsOfMotherboard.get(ConnectionType.POWER);
        Integer pciEConnections = connectionsOfMotherboard.get(ConnectionType.PCI_E);
        Integer ddrConnections = connectionsOfMotherboard.get(ConnectionType.DDR4);
        Integer sataConnections = connectionsOfMotherboard.get(ConnectionType.SATA);
        Integer socketConnections = connectionsOfMotherboard.get(ConnectionType.Socket1155);

        for (Motherboard m : listOfComponents) {
            if (m.getConnectionType().equals(ConnectionType.POWER)) {
                powerConnections--;
                connectionsOfMotherboard.replace(ConnectionType.POWER, powerConnections);

            } else if (m.getConnectionType().equals(ConnectionType.PCI_E)) {
                pciEConnections--;
                connectionsOfMotherboard.replace(ConnectionType.PCI_E, pciEConnections);
            } else if (m.getConnectionType().equals(ConnectionType.DDR4)) {
                ddrConnections--;
                connectionsOfMotherboard.replace(ConnectionType.DDR4, ddrConnections);
            } else if (m.getConnectionType().equals(ConnectionType.SATA)) {
                sataConnections--;
                connectionsOfMotherboard.replace(ConnectionType.SATA, sataConnections);
            } else if (m.getConnectionType().equals(ConnectionType.Socket1155)) {
                socketConnections--;
                connectionsOfMotherboard.replace(ConnectionType.Socket1155, socketConnections);
            }


        }


        return connectionsOfMotherboard;
    }

    public void deleteComponent(List<Motherboard> listOfComponents, String serialNumber, Map<ConnectionType, Integer> mapOfMotherboard) {
        Integer powerConnections;
        Integer pciEConnections;
        Integer ddrConnections;
        Integer sataConnections;
        Integer socketConnections;

        for (Motherboard listOfComponent : listOfComponents) {
            if (listOfComponent.serialNumber.equals(serialNumber)) {

                if (listOfComponent.connectionType.equals(ConnectionType.POWER)) {
                    powerConnections = mapOfMotherboard.get(ConnectionType.POWER);
                    powerConnections++;
                    mapOfMotherboard.replace(ConnectionType.POWER, powerConnections);
                } else if (listOfComponent.connectionType.equals(ConnectionType.PCI_E)) {
                    pciEConnections = mapOfMotherboard.get(ConnectionType.PCI_E);
                    pciEConnections++;
                    mapOfMotherboard.replace(ConnectionType.POWER, pciEConnections);
                } else if (listOfComponent.connectionType.equals(ConnectionType.DDR4)) {
                    ddrConnections = mapOfMotherboard.get(ConnectionType.DDR4);
                    ddrConnections++;
                    mapOfMotherboard.replace(ConnectionType.DDR4, ddrConnections);
                } else if (listOfComponent.connectionType.equals(ConnectionType.SATA)) {
                    sataConnections = mapOfMotherboard.get(ConnectionType.SATA);
                    sataConnections++;
                    mapOfMotherboard.replace(ConnectionType.SATA, sataConnections);
                } else if (listOfComponent.connectionType.equals(ConnectionType.Socket1155)) {
                    socketConnections = mapOfMotherboard.get(ConnectionType.Socket1155);
                    socketConnections++;
                    mapOfMotherboard.replace(ConnectionType.Socket1155, socketConnections);

                }


            }


        }
        if (listOfComponents.removeIf(e -> e.serialNumber.equals(serialNumber))) {
            System.out.println("Component with serial number " + serialNumber + " deleted");
        } else System.out.println("Motherboard doesn't contain this component");


    }


    public void addComponent(List<Motherboard> listOfComponents, Motherboard component, Map<ConnectionType, Integer> mapOfMotherboard) {
        Integer powerConnections = 0;
        Integer pciEConnections = 0;
        Integer ddrConnections = 0;
        Integer sataConnections = 0;
        Integer socketConnections = 0;


        if (!mapOfMotherboard.containsKey(component.connectionType)) {
            System.out.println("Motherboard doesn't contain connections with this type: " + component.connectionType);
        }


        try {

            if (component.connectionType.equals(ConnectionType.POWER)) {
                powerConnections = mapOfMotherboard.get(ConnectionType.POWER);
                powerConnections--;
                mapOfMotherboard.replace(ConnectionType.POWER, powerConnections);
            }
            if (powerConnections < 0) {
                throw new Exception();

            } else if (component.connectionType.equals(ConnectionType.POWER)) {
                listOfComponents.add(component);
                System.out.println("Add component " +
                        " Producer: " + component.producer +
                        ", model: " + component.model +
                        ", serial number: " + component.serialNumber);
            }

        } catch (Exception e) {
            System.out.println("All connectors of POWER completed. Impossible to add component ");
        }

        try {
            if (component.connectionType.equals(ConnectionType.PCI_E)) {
                pciEConnections = mapOfMotherboard.get(ConnectionType.PCI_E);
                pciEConnections--;
                mapOfMotherboard.replace(ConnectionType.POWER, pciEConnections);
            }
            if (pciEConnections < 0) {
                throw new Exception();

            } else if (component.connectionType.equals(ConnectionType.PCI_E)) {
                listOfComponents.add(component);
                System.out.println("Add component " +
                        " Producer: " + component.producer +
                        ", model: " + component.model +
                        ", serial number: " + component.serialNumber);
            }

        } catch (Exception e) {
            System.out.println("All connectors of PCI-E completed. Impossible to add component ");
        }

        try {
            if (component.connectionType.equals(ConnectionType.DDR4)) {
                ddrConnections = mapOfMotherboard.get(ConnectionType.DDR4);
                ddrConnections--;
                mapOfMotherboard.replace(ConnectionType.DDR4, ddrConnections);
            }
            if (ddrConnections < 0) {
                throw new Exception();

            } else if (component.connectionType.equals(ConnectionType.DDR4)) {
                listOfComponents.add(component);
                System.out.println("Add component " +
                        " Producer: " + component.producer +
                        ", model: " + component.model +
                        ", serial number: " + component.serialNumber);
            }

        } catch (Exception e) {
            System.out.println("All connectors of DDR completed. Impossible to add component ");
        }

        try {
            if (component.connectionType.equals(ConnectionType.SATA)) {
                sataConnections = mapOfMotherboard.get(ConnectionType.SATA);
                sataConnections--;
                mapOfMotherboard.replace(ConnectionType.SATA, sataConnections);
            }
            if (sataConnections < 0) {
                throw new Exception();

            } else if (component.connectionType.equals(ConnectionType.SATA)) {
                listOfComponents.add(component);
                System.out.println("Add component " +
                        " Producer: " + component.producer +
                        ", model: " + component.model +
                        ", serial number: " + component.serialNumber);
            }

        } catch (Exception e) {
            System.out.println("All connectors of SATA completed. Impossible to add component ");
        }

        try {
            if (component.connectionType.equals(ConnectionType.Socket1155)) {
                socketConnections = mapOfMotherboard.get(ConnectionType.Socket1155);
                socketConnections--;
                mapOfMotherboard.replace(ConnectionType.Socket1155, socketConnections);
            }
            if (socketConnections < 0) {
                throw new Exception();

            } else if (component.connectionType.equals(ConnectionType.Socket1155)) {
                listOfComponents.add(component);
                System.out.println("Add component " +
                        " Producer: " + component.producer +
                        ", model: " + component.model +
                        ", serial number: " + component.serialNumber);
            }

        } catch (Exception e) {
            System.out.println("All connectors of Socket1155 completed. Impossible to add component ");
        }

    }


    @Override
    public String toString() {
        String simpleName = getClass().getSimpleName();
        return "Component " + simpleName + " connected : " +
                "id=" + id +
                ", producer= " + producer +
                ", model= " + model ;
    }
}
