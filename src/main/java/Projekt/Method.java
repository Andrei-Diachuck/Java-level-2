package Projekt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method {
    
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3};
        System.out.println(Arrays.toString(integers));
        swap(integers, 0, 2);
        System.out.println(Arrays.toString(integers));
    
        List<Integer> integers1 = new ArrayList<>();
        for (Integer number : integers) {
            integers1.add(number);
        }
    }
    
    public static <T> void swap(T[] arr, int first, int second){
        if (first < 0 || second < 0){
            throw new  IllegalArgumentException();
        }
        if (arr == null){
            throw new IllegalArgumentException();
        }
    
        int length = arr.length;
        if (first > length || second > length){
            throw new IllegalArgumentException();
        }
        
        T tap = arr[first];
        arr[first] = arr[second];
        arr[second] = tap;
    }
}
