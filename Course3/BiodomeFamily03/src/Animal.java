public class Animal extends Organism {
    private String digestionType;
    private String food;

    public Animal(String name, String habitat, String digestionType, String food) {
        super(name, "동물", habitat);
        this.digestionType = digestionType;
        this.food = food;
    }

    public String getDigestionType() {
        return digestionType;
    }

    public String getFood() {
        return food;
    }

    @Override
    public void displayInfo() {
        System.out.println(getName() + ", " + getSpecies() + ", " + getHabitat()
                + ", " + digestionType + ", " + food);
    }
}