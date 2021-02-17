package OOP;

import java.util.List;

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

    public  <T> void deleteComponent(List<Motherboard> listOfComponents, T component){
        listOfComponents.removeIf(e -> e.getClass().equals(component.getClass()));
        listOfComponents.forEach(System.out::println);
    }

    public  void addComponent(List<Motherboard> listOfComponents, Motherboard component){
        listOfComponents.add( component);
        listOfComponents.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Motherboard connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' ;
    }
}
