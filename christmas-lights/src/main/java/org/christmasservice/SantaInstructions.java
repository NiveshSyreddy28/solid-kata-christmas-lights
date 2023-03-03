package org.christmasservice;

public class SantaInstructions {
    public LightService lightSwitch;
    public LightService lightBrightness;

    public SantaInstructions(LightService lightSwitch, LightService lightBrightness) {
        this.lightSwitch = lightSwitch;
        this.lightBrightness = lightBrightness;
    }


    public static void main(String[] args) {
        SantaInstructions santaInstructions = new SantaInstructions(new LightBrightness(), new LightSwitch());
        santaInstructions.execute(santaInstructions.lightSwitch);
        santaInstructions.execute(santaInstructions.lightBrightness);
    }

    public void execute(LightService light) {
        light.switchOn(887, 959, 9, 629);
        light.switchOn(454, 844, 398, 448);

        light.switchOff(539, 559, 243, 965);
        light.switchOff(370, 676, 819, 868);
        light.switchOff(145, 370, 40, 997);
        light.switchOff(301, 808, 3, 453);

        light.toggle(720, 897, 196, 994);
        light.toggle(831, 904, 394, 860);

        System.out.println(light.count());
    }
}