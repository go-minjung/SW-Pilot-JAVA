public class WaterMirror extends AncientArtifact implements EnergyGenerator, WeatherController {
    public WaterMirror() {
        super("물의 거울");
        System.out.println(getName() + " 유물이 생성되었습니다.");
    }

    @Override
    public void describe() {
        System.out.println("\"물의 거울은 수증기를 모아 에너지를 만들고 비 또는 눈을 내리게 할 수 있습니다.\"");
    }

    @Override
    public void generateEnergy() {
        System.out.println("물의 거울을 이용해 수증기로 에너지를 생성했습니다!");
    }

    @Override
    public void controlWeather() {
        System.out.println("물의 거울이 날씨를 조절합니다. 비 또는 눈이 내립니다!");
    }
}
