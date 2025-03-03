package myfirstapp;

public class DataTypes {

    private int number; // aici am lasat int, in loc de Integer pentru incercat autoboxing

    public DataTypes(Integer number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
