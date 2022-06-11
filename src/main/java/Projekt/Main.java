package Projekt;

public class Main {
    private static final int SIZE = 10000000;
    private static final int HALF = SIZE / 2;
    
    public static void main(String[] args) {
        first();
        second();
    }
    
    public static float[] calc(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }
    
    public static void first() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        calc(arr);
        System.out.println("One thread time : " + (System.currentTimeMillis() - startTime) + " ms");
    }
    
    public static void second() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        
        long startTime = System.currentTimeMillis();
        
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);
        
        MyThread t1 = new MyThread("arr1", arr1);
        MyThread t2 = new MyThread("arr2", arr2);
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        arr1 = t1.getArr();
        arr2 = t2.getArr();
        
        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, 0, HALF);
        System.out.println("Two thread time : " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
