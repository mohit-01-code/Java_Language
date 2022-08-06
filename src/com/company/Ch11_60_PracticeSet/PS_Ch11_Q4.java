package com.company.Ch11_60_PracticeSet;

abstract class telephone {
    abstract public void ring();

    abstract public void lift();

    abstract public void disconnect();
}

class smartTelephone extends telephone {
    public void ring() {
        System.out.println("ringing....");
    }

    public void lift() {
        System.out.println("Call received...");
    }

    public void disconnect() {
        System.out.println("Call disconnected....");
    }

    public void Wifi(String OnOff) {
        System.out.println("Wifi turned " + OnOff + "...");
    }
}

public class PS_Ch11_Q4 {
    public static void main(String[] args) {
        telephone tele = new smartTelephone();
//        tele.Wifi("ON"); --> Can't access to the smartTelephone
        tele.ring();
        tele.lift();
        tele.disconnect();

        smartTelephone smartTele = new smartTelephone();
        smartTele.Wifi("ON");

    }
}
