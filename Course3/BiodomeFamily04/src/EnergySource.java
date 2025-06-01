public abstract class EnergySource {
    private final String sourceName;
    private int energyAmount;

    public EnergySource(String sourceName) {
        this.sourceName = sourceName;
        this.energyAmount = 0;
    }

    public String getSourceName() {
        return sourceName;
    }

    public int getEnergyAmount() {
        return energyAmount;
    }

    protected void addEnergy(int amount) {
        this.energyAmount += amount;
    }

    public void useEnergy(int amount) {
        if (energyAmount >= amount) {
            energyAmount -= amount;
            System.out.println(sourceName + " 에너지를 " + amount + " 사용했습니다.");
        } else {
            System.out.println(sourceName + " 에너지가 부족하여 사용할 수 없습니다.");
        }
    }

    public abstract void produceEnergy();
}
