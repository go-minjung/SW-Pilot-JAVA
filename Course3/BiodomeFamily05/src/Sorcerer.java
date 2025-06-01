import java.util.ArrayList;
import java.util.List;

public class Sorcerer {
    private String name;
    private List<AncientArtifact> artifacts;

    public Sorcerer(String name) {
        this.name = name;
        this.artifacts = new ArrayList<>();
        System.out.println("마법사 '" + name + "'이 생성되었습니다.");
    }

    public String getName() {
        return name;
    }

    public void addArtifact(AncientArtifact artifact) {
        artifacts.add(artifact);
        System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "을(를) 소유하게 되었습니다.");
    }

    public void showArtifactAbilities() {
        for (AncientArtifact artifact : artifacts) {
            System.out.println("\n마법사 '" + name + "'이 " + artifact.getName() + "의 능력을 확인합니다.");
            artifact.describe();

            if (artifact instanceof EnergyGenerator) {
                System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "의 에너지 생성 능력을 사용합니다.");
                ((EnergyGenerator) artifact).generateEnergy();
            }

            if (artifact instanceof WeatherController) {
                System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "의 날씨 조절 능력을 사용합니다.");
                ((WeatherController) artifact).controlWeather();
            }
        }
    }
}
