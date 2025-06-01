public class WindAmulet extends AncientArtifact implements WeatherController {
    public WindAmulet() {
        super("바람의 부적");
        System.out.println(getName() + " 유물이 생성되었습니다.");
    }

    @Override
    public void describe() {
        System.out.println("\"바람의 부적으로 날씨 조절 중! 저기압, 고기압, 강풍에 영향을 줍니다.\"");
    }

    @Override
    public void controlWeather() {
        System.out.println("바람의 부적이 공기의 흐름을 바꿔 날씨를 조절합니다!");
    }
}