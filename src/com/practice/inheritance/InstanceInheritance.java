package com.practice.inheritance;


class SolarSystem {
}
class Earth extends SolarSystem {
}
class Mars extends SolarSystem {
}
class Moon extends Earth {
}
public class InstanceInheritance {
    public static void main(String[] args) {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();
        Moon moon=new Moon();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
        System.out.println(moon instanceof SolarSystem);

    }
}
