public class HelloBiodome04 {
    // 온도, 습도, 산소 농도 범위 확인하여 안정 범위에 있는지 출력
    static final double MU_B = 2.5;
    static final double PI = 3.141592653589793;

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
            return;
        }

        double temperature = 0, humidity = 0, oxygen = 0;
        try {
            temperature = Double.parseDouble(args[0]);
            humidity = Double.parseDouble(args[1]);
            oxygen = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
            return;
        }

        if (!isTemperatureSafe(temperature)) {
            System.out.println("온도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
        } else if (!isHumiditySafe(humidity)) {
            System.out.println("습도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
        } else if (!isOxygenSafe(oxygen)) {
            System.out.println("산소농도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
        } else {
            System.out.print("생명의 나무는 안정적인 상태입니다");
            double health = calculateHealth(temperature, humidity, oxygen);
            double roundedHealth = Round(health);
            System.out.printf(". 건강지수는 %.2f 입니다.%n", roundedHealth);
        }

    }

    static boolean isTemperatureSafe(double temp) {
        return temp >= 10.0 && temp < 27.5;
    }

    static boolean isHumiditySafe(double hum) {
        return hum > 40.0 && hum < 60.0;
    }

    static boolean isOxygenSafe(double oxy) {
        return oxy >= 19.5 && oxy <= 23.5;
    }

    static double abs(double value) {
        return value < 0 ? -value : value;
    }

    static double sqrt(double value) {
        double guess = value / 2;
        guess = (guess + value / guess) / 2;
        guess = (guess + value / guess) / 2;
        guess = (guess + value / guess) / 2;
        guess = (guess + value / guess) / 2;
        guess = (guess + value / guess) / 2;
        guess = (guess + value / guess) / 2;
        guess = (guess + value / guess) / 2;
        guess = (guess + value / guess) / 2;
        return guess;
    }

    static double calculateHealth(double temperature, double humidity, double oxygen) {
        return MU_B * abs(sqrt(humidity) - temperature) + oxygen / (PI * PI);
    }

    static double Round(double value) {
        double scaled = value * 100 + 0.5;
        int intValue = (int) scaled;
        return intValue / 100.0;
    }
}
