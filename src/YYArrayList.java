/**
 * Created by aliouswang on 17/2/14.
 */
public class YYArrayList <T> {

    public static final int DEFAULT_SIZE = 10;

    Object [] elementData;

    int size = 0;

    public YYArrayList() {
        elementData = new Object[DEFAULT_SIZE];
    }

    public int getSize() {
        return size;
    }

    public void add(T t) {
        ensureCapacity(size + 1);
        elementData[size ++] = t;
    }

    public void add(int index, T t) {
        checkIndex(index);
        ensureCapacity(size + 1);
        for (int i = size - 1; i >= index; i --) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = t;
        size ++;
    }


    private void ensureCapacity(int size) {
        if (size > elementData.length) {
            //enlarge size
            Object[] newData = new Object[elementData.length * 2];
            System.arraycopy(elementData, 0, newData, 0, elementData.length);
            elementData = newData;
        }
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elementData[index];
    }

    private void checkIndex(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(String.format("length is %d, size is %d", elementData.length, index));
        }
    }

}
