package com.company;

class phone {
    public void music() {
        System.out.println("FM Radio playing...");
    }

    public void call() {
        System.out.println("calling...");
    }
}

class smartphone extends phone {
    @Override
    public void music() {
        System.out.println("mp3 music playing...");
    }

    public void camera() {
        System.out.println("Turning on Camera...");
    }
}

public class Ch10_49_DynamicMethodDispatch {
    public static void main(String[] args) {
        phone galaxyA30 = new smartphone();
        galaxyA30.music();
        galaxyA30.call();
        // galaxyA30.camera(); -> not allowed
        // smartphone VivoV20 = new phone(); -> not allowed
        smartphone vivoV20 = new smartphone();
        vivoV20.camera();
    }
}
