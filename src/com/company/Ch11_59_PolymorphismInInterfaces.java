package com.company;

interface MyWifi2 {
    public String[] networkList();
}

interface MyCamera2 {
    public void takeSnap();

    public void recordVideo();

    default public void filter() {
        System.out.println("New filters are : Doggy, Sunrise, light Hair");
    }
}

class MyCellphone2 {
    public void makeCall(int phoneNumber1, int phoneNumber2) {
        System.out.println("Calling ..." + phoneNumber1 + "" + phoneNumber2);
    }

}

class MySmartPhone3 extends MyCellphone2 implements MyWifi2, MyCamera2 {
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

public class Ch11_59_PolymorphismInInterfaces {
    public static void main(String[] args) {
        MyCamera2 cam = new MySmartPhone3(); // This is a smartphone but use it as a Camera
//        String[] str = cam.networkList(); --> Not allowed
        cam.takeSnap();
        cam.recordVideo();

        MySmartPhone3 VivoY21 = new MySmartPhone3();
        for (String list : VivoY21.networkList()) {
            System.out.println(list);
        }
        VivoY21.makeCall(94143, 73655);
        VivoY21.recordVideo();
        VivoY21.takeSnap();
        VivoY21.filter();
    }
}
