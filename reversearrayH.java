import javax.print.event.PrintEvent;

import java.util.*;
class reversearrayH {
    public static void main(String args[]) {
        int[] arr = new int[]{1,2,3,4,5};
        for(int i=0; i<arr.length; i++)
            System.out.print(" "+arr[i]);
        System.out.print("\n");
        for(int j=arr.length-1; j>=0; j--)
            System.out.print(" "+arr[j]);
    }
}
