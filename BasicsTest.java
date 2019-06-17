import java.lang.ArrayIndexOutOfBoundsException;
import java.util.ArrayList;

public class BasicsTest{

    public static void main(String[] args){
        Basics basics = new Basics();

        basics.print255();
        basics.printOdd255();
        basics.printSum();

        int[] arr = {1, 2, 3, 4, -11, -9, 7};

        basics.iterating(arr);
        basics.findMax(arr);
        basics.getAverage(arr);
        basics.arrOddNumber();
        basics.greaterThanY(arr,2);
        basics.squareValues(arr);
        basics.eliminateNegs(arr);
        basics.minMaxAvg(arr);
        basics.shiftTheValues(arr);
    }
}