public class Main {
    public static void main(String[] args) {
        task1and2();
    }

    public static void task1and2() {
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;

        double[] height = {1.57, 7.654, 9.986};

        int[] thickness = new int[]{1, 2, 3, 4};

        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i != weights.length - 1); {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < height.length; i++) {
            System.out.print(height[i]);
            if (i != height.length - 1);{
                System.out.print(", ");}
        }
        System.out.println();

        for (int i = 0; i < thickness.length; i++) {
        System.out.print(thickness[i]);
        if (i != thickness.length - 1); {
            System.out.print(", ");
        }
    }
        System.out.println();
        }
        }

