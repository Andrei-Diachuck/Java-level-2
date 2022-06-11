package Projekt;

public class MyThread extends Thread{
    private float[] arr;
    
    MyThread(String name, float[] arr){
        super(name);
        this.arr = arr;
    }
    
    public float[] getArr() {
        return arr;
    }
    public void run() {
        calculate();
    }
    
    private void calculate() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
    
    
}
