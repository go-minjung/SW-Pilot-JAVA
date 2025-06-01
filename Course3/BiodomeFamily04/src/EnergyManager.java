public class EnergyManager {
    private EnergySource[] sources;

    public EnergyManager(EnergySource[] sources) {
        this.sources = sources;
    }

    public int getTotalEnergy() {
        int total = 0;
        for (EnergySource source : sources) {
            total += source.getEnergyAmount();
        }
        return total;
    }
}
