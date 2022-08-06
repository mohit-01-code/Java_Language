package com.company.Ch11_60_PracticeSet;

interface TvRemote {
    public void power(String OnOff);

    public void setVolume(int volume);
}

interface smartTvRemote extends TvRemote {
    public void Wifi(String OnOff);

    public void screenMirror();
}

class Tv implements TvRemote {
    public void power(String OnOff) {
        System.out.println("Turning " + OnOff + "...");
    }

    public void setVolume(int volume) {
        System.out.println("Volume is " + volume);
    }
}

class smartTv extends Tv implements smartTvRemote {
    public void Wifi(String OnOff) {
        System.out.println("Wifi turning " + OnOff + "...");
    }

    public void screenMirror() {
        System.out.println("Connecting for Screen mirroring...");
    }
}

public class PS_Ch11_Q6AndQ7 {
    public static void main(String[] args) {
        Tv Sansui = new Tv();
        Sansui.power("ON");
        Sansui.setVolume(12);

        smartTv MiA1 = new smartTv();
        MiA1.Wifi("ON");
        MiA1.screenMirror();
        MiA1.setVolume(22);
        MiA1.power("OFF");
    }
}
