package com.company;

interface wifi {
    public String[] networkList();
}

interface camera {
    public void takeSnap();

    public void recordVideo();

    default public void filter() {
        System.out.println("New filters are : Doggy, Sunrise, light Hair");
    }
}

class cellPhone {
    public void makeCall(int phoneNumber1, int phoneNumber2) {
        System.out.println("Calling ..." + phoneNumber1 + "" + phoneNumber2);
    }

}

class MySmartPhone extends MyCellphone2 implements MyWifi2, MyCamera2 {
    public String[] networkList() {
        System.out.println("Available networks are ...");
        String[] str = {"Harry", "Tenda343041", "Airtel001"};
        return str;
    }

    public void takeSnap() {
        System.out.println("Taking snap...");
    }

    public void recordVideo() {
        System.out.println("Recording video....");
    }

//    public void filter(){
//        System.out.println("New Filter is : Makeup");
//    }
}

public class Ch11_57_DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone GalaxyA30 = new MySmartPhone();
        for (String list : GalaxyA30.networkList()) {
            System.out.println(list);
        }
        GalaxyA30.makeCall(99821, 11105);
        GalaxyA30.recordVideo();
        GalaxyA30.takeSnap();
        GalaxyA30.filter();
    }
}
