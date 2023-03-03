package org.christmasservice;

public interface BasicLightService {


    void switchOff(int startRow, int endRow, int startColumn, int endColumn);

    void switchOn(int startRow, int endRow, int startColumn, int endColumn);
}