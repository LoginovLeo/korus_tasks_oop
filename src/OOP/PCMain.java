package OOP;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class PCMain {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        List<Motherboard> componentsOfFirstPC = new ArrayList<>();
        List<Motherboard> componentsOfSecondPC = new ArrayList<>();


        List<PC> groupOfPC = new ArrayList<>();

        Motherboard motherboard = new Motherboard(4, "Asus", "ROG STRIX B550-XE GAMING", "45318551134-662aA4D45", ConnectionType.POWER, 4, 2, 4, 2, 1);
        PSU psu = new PSU(3, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER);
        RAM ram = new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.POWER);
        HDD hdd = new HDD(5, "Kingston", "HDD512", "1256aAS-512", ConnectionType.PCI_E);
        CPU cpu = new CPU(2, "Intel", "I9", "asd5f5", ConnectionType.PCI_E);
        SSD ssd = new SSD(6, "Samsung", "SSD512", "asd5f5", ConnectionType.PCI_E);

        Motherboard motherboard1 = new Motherboard(4, "Asus", "ROG STRIX B550-XE GAMING", "45318551134-662aA4D45", ConnectionType.POWER, 3, 2, 2, 2, 1);
        PSU psu1 = new PSU(3, "Power Supply", " VA-PSU-US1", "564665sfaaee", ConnectionType.POWER);
        RAM ram1 = new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.POWER);
        HDD hdd1 = new HDD(5, "Kingston", "HDD512", "1256aAS-512", ConnectionType.PCI_E);
        CPU cpu1 = new CPU(2, "Intel", "I9", "asd5f5", ConnectionType.PCI_E);
        SSD ssd1 = new SSD(25, "Samsung", "SSD512", "asd5f5", ConnectionType.PCI_E);


        componentsOfFirstPC.add(motherboard);
        componentsOfFirstPC.add(psu);
        componentsOfFirstPC.add(ram);
        componentsOfFirstPC.add(hdd);
        componentsOfFirstPC.add(cpu);
        componentsOfFirstPC.add(ssd);

        componentsOfSecondPC.add(motherboard1);
        componentsOfSecondPC.add(psu1);
        componentsOfSecondPC.add(ram1);
        componentsOfSecondPC.add(hdd1);
        componentsOfSecondPC.add(cpu1);
        componentsOfSecondPC.add(ssd1);

        psu.powerOn(componentsOfFirstPC);

        Map<ConnectionType, Integer> mapOfMotherboard = motherboard.createMap(motherboard, componentsOfFirstPC);


        /*motherboard.addComponent(componentsOfFirstPC, new SSD(7, "Samsung", "SSD512", "asd5f5", ConnectionType.DIMM), mapOfMotherboard);
        motherboard.addComponent(componentsOfFirstPC, new SSD(8, "Samsung", "SSD512", "asd455f5", ConnectionType.POWER), mapOfMotherboard);
        motherboard.deleteComponent(componentsOfFirstPC, "564665sfad", mapOfMotherboard);
        //motherboard.addComponent(componentsOfFirstPC, new SSD(9, "Samsung", "SSD512", "asd455f5", ConnectionType.POWER), mapOfMotherboard);*/


        PC computer1 = new PC(componentsOfFirstPC, "MyFirstPC");
        PC computer2 = new PC(ram,cpu,motherboard,psu,ssd,hdd);

        groupOfPC.add(computer1);






    }
}
