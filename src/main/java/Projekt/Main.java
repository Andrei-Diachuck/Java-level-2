package Projekt;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"2", "2", "5", "5"}, {"2", "2", "2", "3"}, {"1", "5", "2", "2"}, {"2", "2", "2", "4"}};
        try {
            try {
                int result = arrays(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                //
            }
        } catch (MyArrayDataException e) {
            //
        }

    }

    public static int arrays(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(String.valueOf(arr[i][j]));
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
        return count;
    }
}