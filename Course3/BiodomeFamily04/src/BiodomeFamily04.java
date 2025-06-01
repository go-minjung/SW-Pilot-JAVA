public class BiodomeFamily04 {
    public static void main(String[] args) {
        EnergySource solar = new SolarEnergy();
        EnergySource wind = new WindEnergy();
        EnergySource geo = new GeothermalEnergy();

        solar.produceEnergy();
        wind.produceEnergy();
        geo.produceEnergy();

        solar.useEnergy(30);
        wind.useEnergy(30);
        geo.useEnergy(30);

        EnergySource[] sources = {solar, wind, geo};
        EnergyManager manager = new EnergyManager(sources);
        System.out.println("\n남은 에너지: " + manager.getTotalEnergy());
    }
}
