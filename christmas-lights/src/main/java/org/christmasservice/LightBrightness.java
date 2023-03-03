package org.christmasservice;

public class LightBrightness implements LightService {
    private final int lights[][];

    public LightBrightness() {
        lights = new int[1000][1000];
    }

    @Override
    public void switchOff(int startRow, int endRow, int startColumn, int endColumn) {
        for (int i = startRow; i <= endRow; i++)
            for (int j = startColumn; j <= endColumn; j++)
                lights[i][j] = Math.max(0, lights[i][j]--);
    }

    @Override
    public void switchOn(int startRow, int endRow, int startColumn, int endColumn) {
        for (int i = startRow; i <= endRow; i++)
            for (int j = startColumn; j <= endColumn; j++)
                lights[i][j] += 1;
    }

    @Override
    public int count() {
        int count = 0;

        for (int i = 0; i < 999; i++) {
            for (int j = 0; j < 999; j++) {
                count += lights[i][j];
            }
        }
        return count;
    }

    @Override
    public void toggle(int startRow, int endRow, int startColumn, int endColumn) {
        for (int i = startRow; i <= endRow; i++)
            for (int j = startColumn; j <= endColumn; j++)
                lights[i][j] += 2;
    }
}
