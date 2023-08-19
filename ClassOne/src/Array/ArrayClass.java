package Array;

import java.sql.SQLOutput;

public class ArrayClass {
    public static void main(String[] args) {


    int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(a.length);
        System.out.println(a[1]);
        for(Integer b : a){
            System.out.println(b);
            System.out.println("The size of this array is :"+a.length);
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }
        }


}

}
