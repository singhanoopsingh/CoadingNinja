package practice.java;

public class Practice4 {

    public static void main(String[] args){

        int array[] = {3, 10, 6,8,9};
        int max = 0;

        for(int i = 0 ; i < array.length ; i++){

            if(array[i] > max)
                max = array[i];



        }
        System.out.println("max " + max);
    }
}
