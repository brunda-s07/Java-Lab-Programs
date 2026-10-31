abstract class EnergySource {
    int id;
    String name;
    double energy;

    EnergySource(int id, String name, double energy) {
        this.id=id;
        this.name=name;
        this.energy=energy;
    }

    abstract double calculateEfficiency();

    void display() {
        System.out.println("ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Energy Generated: "+energy+" kW");
        System.out.println("Efficiency: "+calculateEfficiency()+"%");
    }
}

class SolarEnergy extends EnergySource {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energy/5000)*100;
    }
}

class WindEnergy extends EnergySource {
    WindEnergy(int id, String name, double energy) {
        super(id,name,energy);
    }

    double calculateEfficiency() {
        return (energy/8000)*100;
    }
}

public class Demo{
    public static void main(String[] args) {
        EnergySource s = new SolarEnergy(1, "Solar", 2500);
        EnergySource w = new WindEnergy(2, "Wind", 4000);
        System.out.println("Solar Energy Details:");
        s.display();
        System.out.println("\nWind Energy Details:");
        w.display();
        System.out.println("Name : Brunda   USN : 1WN25CS053");
    }
}