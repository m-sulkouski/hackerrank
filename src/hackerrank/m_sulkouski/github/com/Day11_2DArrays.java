package hackerrank.m_sulkouski.github.com;

public class Day11_2DArrays {
    public static int calculateHourGlassFromArray(int[][] values) {
        int[] hourglass = new int[7];
        int currentHourGlassValue = 0;
        int greatestHourglassValue = Integer.MIN_VALUE;

        for (int i = 0; i < values.length - 2; i ++) {
            for (int k = 0; k < values.length - 2; k++) {
                hourglass[0] = values[i][k];
                hourglass[1] = values[i][k+1];
                hourglass[2] = values[i][k+2];
                hourglass[3] = values[i+1][k+1];
                hourglass[4] = values[i+2][k];
                hourglass[5] = values[i+2][k+1];
                hourglass[6] = values[i+2][k+2];

                for (int l : hourglass) {
                    currentHourGlassValue += l;
                }

                if (currentHourGlassValue > greatestHourglassValue) {
                    greatestHourglassValue = currentHourGlassValue;
                }

                currentHourGlassValue = 0;
            }
        }
        return greatestHourglassValue;
    }
}
