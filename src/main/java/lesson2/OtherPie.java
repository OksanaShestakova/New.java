package lesson2;

public class OtherPie {
    public static void main(String[] args) {
        OtherPie countPie = new OtherPie();
        countPie.equalSlices(40, 10, 6);
    }

    public static void equalSlices(int totalslices, int norecipients, int sliceseach) {
        if (totalslices >= norecipients * sliceseach) {
            System.out.println("true");
        }
        else {
            System.out.println("False");
    }

}}
