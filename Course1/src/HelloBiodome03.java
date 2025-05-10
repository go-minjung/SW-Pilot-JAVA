public class HelloBiodome03 {
    // 온도, 습도, 산소농도를 입력 받아 생명나무의 건강지수 H 계산하여 출력
    static final double PI = 3.14;
    static final double MU_B = 0.415;

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("입력된 값이 올바르지 않습니다. 온도, 습도, 산소농도 순서 대로 숫자 값을 입력해주세요");
            return;
        }

        try {
            // 문자열 실수로 변환
            double temperature = Double.parseDouble(args[0]);
            double humidity = Double.parseDouble(args[1]);
            double oxygen = Double.parseDouble(args[2]);

            double h = calculateHealth(temperature, humidity, oxygen);
            double rounded = roundToTwoDecimal(h);
            System.out.println("-> 생명지수 H = " + rounded);
        } catch (NumberFormatException e) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
        }
    }

    // 습도 제곱근(뉴턴-랩슨?)
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

    // 절대값 계산
    static double abs(double value) {
        return value < 0 ? -value : value;
    }

    // 건강지수 계산
    static double calculateHealth(double temperature, double humidity, double oxygen) {
        return MU_B * abs(sqrt(humidity) - temperature) + oxygen / (PI * PI);
    }

    // 반올림 처리
    static double roundToTwoDecimal(double value) {
        double temp = value * 100 + 0.5;
        int result = (int) temp;
        return result / 100.0;
    }
}
