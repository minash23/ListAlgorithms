import java.util.Arrays;

public class AList <T>{
    Object[] array;
    int size;
    int maxSize;

    public AList() {
        size = 0;
        maxSize = 300;
        array = new Object[maxSize];
    }

    public void listAdd(T p){
        if (size < maxSize){
            array[size] = p;
            size++;
        }else{
            maxSize = maxSize * 2;
            Object[] newArray = new Object[maxSize];

            for(int i = 0; i < size; i++){
                newArray[i] =  array[i];
            }

            newArray[size] = p;
            size = size + 1;

            array = newArray;

        }
    }

    public void listRemove(int pos) {
        if (pos >= 0 && pos < size) {
            for (int i = pos; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
        }
        size--;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append("{");
            result.append(array[i].toString());
            result.append("}");
            if (i != size - 1) result.append("\n");
        }
        return result.toString();
    }

}
