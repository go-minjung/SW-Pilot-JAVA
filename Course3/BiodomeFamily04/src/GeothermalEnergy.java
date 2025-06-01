import java.util.Scanner;

public class GeothermalEnergy extends EnergySource {
    public GeothermalEnergy() {
        super("지열");
    }

    @Override
    public void produceEnergy() {
        Scanner sc = new Scanner(System.in);
        System.out.print("지층 온도를 입력하세요: ");
        int temp = sc.nextInt();
        int produced = temp * 5 + 20;
        addEnergy(produced);
        System.out.println(getSourceName() + " 에너지를 " + produced + " 생성했습니다.");
    }
}
