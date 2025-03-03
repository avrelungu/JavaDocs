package myfirstapp;

public class MyArray {
    public static void insertIntoArray(String[] array, int index, String newValue)
    {
        for(int i = array.length - 1; i > index; i--) {
            array[i] = array[i-1];
        }

        array[index] = newValue;
    }
}
