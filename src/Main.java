import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task3();
        task4();
    }

    public static void task3() {
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.print(weights[2] + ", " + weights[1] + ", " + weights[0]);
        System.out.println();

        double[] height = {1.57, 7.654, 9.986};
        System.out.print(height[2] + ", " + height[1] + ", " + height[0]);
        System.out.println();

        int[] thickness = new int[]{1, 2, 3, 4};
        System.out.print(thickness[3] + ", " + thickness[2] + ", " + thickness[1] + ", " + thickness[0]);
        System.out.println();

    }

    public static void task4() {
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0){
                weights[i] += 1;
            }
        }
        System.out.println(Arrays.toString(weights));
    }
}
