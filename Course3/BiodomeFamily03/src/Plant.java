public class Plant extends Organism {
    private String floweringSeason;
    private boolean hasFruit;

    public Plant(String name, String habitat, String floweringSeason, boolean hasFruit) {
        super(name, "식물", habitat);
        this.floweringSeason = floweringSeason;
        this.hasFruit = hasFruit;
    }

    public String getFloweringSeason() {
        return floweringSeason;
    }

    public boolean isHasFruit() {
        return hasFruit;
    }

    @Override
    public void displayInfo() {
        String fruitInfo = hasFruit ? "열매 있음" : "열매 없음";
        System.out.println(getName() + ", " + getSpecies() + ", " + getHabitat()
                + ", " + floweringSeason + ", " + fruitInfo);
    }
}
