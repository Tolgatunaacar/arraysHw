

import java.util.Arrays;



public class Arr {
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,2,0};

        x(arr,5);

    }




    static void x(int[] l1 , int k){

        for (int i =0; i < l1.length;i++){
            Arrays.sort(l1);
            if (l1[i] > k){
                System.out.println("Girilen sayidan buyuk en yakin deger:"+l1[i]);
                System.out.println("Girilen sayidan kucuk en yakin deger:"+l1[i-1]);
                break;
            }
        }
    }
}
