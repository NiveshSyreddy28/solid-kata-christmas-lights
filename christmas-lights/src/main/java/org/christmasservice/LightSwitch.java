package org.christmasservice;

public class LightSwitch implements LightService {
    private final boolean lights[][];

    public LightSwitch() {
        lights = new boolean[1000][1000];
    }

    @Override
    public void switchOff(int startRow, int endRow, int startColumn, int endColumn) {
        for (int i = startRow; i <= endRow; i++)
            for (int j = startColumn; j <= endColumn; j++)
                lights[i][j] = false;
    }

    @Override
    public void switchOn(int startRow, int endRow, int startColumn, int endColumn) {
        for (int i = startRow; i <= endRow; i++)
            for (int j = startColumn; j <= endColumn; j++)
                lights[i][j] = true;
    }

    @Override
    public int count() {
        int count = 0;
        for(int i = 0; i <= 999; i++)
            for(int j = 0; j <= 999; j++)
                if(lights[i][j])
                    count++;

        return count;
    }

    @Override
    public void toggle(int startRow, int endRow, int startColumn, int endColumn) {
        for(int i = startRow; i <= endRow; i++)
            for(int j = startColumn; j <= endColumn; j++)
                lights[i][j] = !lights[i][j];
    }
}
