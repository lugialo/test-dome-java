// https://www.testdome.com/questions/java/game-platform/135047
public class GamePlatform {
    public static double calculateFinalSpeed(double initialSpeed, int[] inclinations) {

        double finalSpeed = initialSpeed;

        for (int inclination : inclinations) {

            if (inclination > 0) {
                finalSpeed += -inclination;
            } else if (inclination < 0) {
                finalSpeed += -inclination;
            }

            if (finalSpeed <= 0) {
                return 0;
            }

        }

        return finalSpeed;
    }

    public static void main(String[] args){
        System.out.println(calculateFinalSpeed(60.0, new int[] { 0, 30, 0, -45, 0 }));
    }
}