package OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PCMain {

    public static void main(String[] args) {

        List<Motherboard> componentsOfFirstPC = new ArrayList<>();
        List<Motherboard> componentsOfSecondPC = new ArrayList<>();


        List<PC> firstPc = new ArrayList<>();
        Motherboard motherboard = new Motherboard(4, "Asus", "ROG STRIX B550-XE GAMING", "45318551134-662aA4D45", ConnectionType.POWER, 5, 2, 4, 2, 1);
        PSU psu = new PSU(3, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER);
        RAM ram = new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.POWER);
        HDD hdd = new HDD(5, "Kingston", "HDD512", "1256aAS-512", ConnectionType.PCI_E);
        CPU cpu = new CPU(2, "Intel", "I9", "asd5f5", ConnectionType.PCI_E);
        SSD ssd = new SSD(6, "Samsung", "SSD512", "asd5f5", ConnectionType.PCI_E);

        Motherboard motherboard1 = new Motherboard(4, "Asus", "ROG STRIX B550-XE GAMING", "45318551134-662aA4D45", ConnectionType.POWER, 3, 2, 2, 2, 1);
        PSU psu1 = new PSU(3, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER);
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

        Map<ConnectionType, Integer> mapOfMotherboard = motherboard.createMap(motherboard, componentsOfFirstPC);
        Integer integer = mapOfMotherboard.get(ConnectionType.POWER);
        System.out.println(integer);

        motherboard.addComponent(componentsOfFirstPC, new SSD(7, "Samsung", "SSD512", "asd5f5", ConnectionType.POWER), mapOfMotherboard);
        motherboard.addComponent(componentsOfFirstPC, new SSD(8, "Samsung", "SSD512", "asd455f5", ConnectionType.POWER), mapOfMotherboard);
        motherboard.addComponent(componentsOfFirstPC, new SSD(9, "Samsung", "SSD512", "asd455f5", ConnectionType.POWER), mapOfMotherboard);


        //pc.discover(pc);

        //motherboard.addComponent(components,motherboard);

        //motherboard.addComponent(componentsOfFirstPC,new PSU());
        //motherboard.addComponent(components,psu);
        //motherboard.addComponent(components,ram);
        //motherboard.addComponent(components,ssd);


        //PC computer1 = new PC(ram,cpu,motherboard,psu,ssd,hdd);

        //computer1.getPCInformation(computer1);


        componentsOfFirstPC.forEach(System.out::println);
        System.out.println(" ");
        // psu.powerOn(pc);
        //motherboard.deleteComponent(components, components.get(1));
        //motherboard.addComponent(components, new PSU(33, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER));
        //System.out.println(" ");
        //psu.powerOn(components);


    }
}
