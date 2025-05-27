package exercise;

public class Ciclabile {
    private int[] array;
    private int index;

    // constructor
    Ciclabile(int[] array) {
        this.array = array;
        this.index = 0;
    }

    // getters
    public int[] getArray() {
        return this.array;
    }

    public int getIndex() {
        return this.index;
    }

    // setters
    public void setArray(int[] newArray) {
        this.array = newArray;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    // methods
    public int getElementoSuccessivo() {
        this.index++;
        return array[index - 1];
    }

    public boolean hasAncoraElementi() {
        if (this.index < array.length) {
            return true;
        }
        return false;
    }
}
