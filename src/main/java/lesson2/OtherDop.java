package lesson2;

public class OtherDop {
    public static void main(String[] args){
        OtherDop showSeven = new OtherDop();
        showSeven.enterSeven(2,8);
        showSeven.answer(18, "mm");
        showSeven.answerCell(false, true, true);}

    public static void enterSeven(int a, int b) {
        if (a == 7 || b == 7 || a+b==7) {
            System.out.println("love7("+ a+ ", "+ b+") → true");
        }
    else {
            System.out.println("love7("+ a+ ", "+ b+") → false");}
    }
    public static void answer(int time, String who){
        if (time>=8 & time<=12 & who == "mom" || time>=12 & time<=24 )
        {
            System.out.println("answer");
        }
        else {
            System.out.println("false");
        }

    }
    public static void answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        if (( isMom==true) & (isMorning==false));
    {System.out.println("true");}
        if (isAsleep==true)
        {System.out.println("false");}
}}
