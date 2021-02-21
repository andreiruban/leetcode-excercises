package structures;

import java.util.Arrays;

class DynamicArray {

    private int size;
    private Integer[] arr;

    public DynamicArray(int capacity) {
        if(capacity == 0) capacity++;
        arr = new Integer[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return arr.length;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int a) {
        if(size == capacity()) doubleCapacity();

        System.arraycopy(arr, i, arr, i+1, size-i);
        arr[i] = a;
        size++;
    }

    public void pushBack(int a) {
        if (size == capacity()) doubleCapacity();

        arr[size++] = a;
    }

    public int popBack() {
        int a = arr[size-1];
        arr[size-1] = null;
        size--;
        return a;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    private void doubleCapacity() {
        Integer[] newArr = new Integer[capacity() * 2];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(2);
        StringBuilder sb = new StringBuilder();
        sb.append("Array: ").append(arr).append("\n")
                .append("Size: ").append(arr.size()).append("\n")
                .append("Capacity: ").append(arr.capacity()).append("\n\n");

        arr.pushBack(1);
        sb.append("Array: ").append(arr).append("\n")
                .append("Size: ").append(arr.size()).append("\n")
                .append("Capacity: ").append(arr.capacity()).append("\n\n");

        arr.pushBack(3);
        sb.append("Array: ").append(arr).append("\n")
                .append("Size: ").append(arr.size()).append("\n")
                .append("Capacity: ").append(arr.capacity()).append("\n\n");

        arr.set(1, 2);
        sb.append("Array: ").append(arr).append("\n")
                .append("Size: ").append(arr.size()).append("\n")
                .append("Capacity: ").append(arr.capacity()).append("\n\n");

        arr.pushBack(5);
        sb.append("Array: ").append(arr).append("\n")
                .append("Size: ").append(arr.size()).append("\n")
                .append("Capacity: ").append(arr.capacity()).append("\n\n");

        arr.pushBack(6);
        sb.append("Array: ").append(arr).append("\n")
                .append("Size: ").append(arr.size()).append("\n")
                .append("Capacity: ").append(arr.capacity()).append("\n\n");

        arr.popBack();
        sb.append("Array: ").append(arr).append("\n")
                .append("Size: ").append(arr.size()).append("\n")
                .append("Capacity: ").append(arr.capacity()).append("\n\n");

        arr.set(1, 8);
        sb.append("Array: ").append(arr).append("\n")
                .append("Size: ").append(arr.size()).append("\n")
                .append("Capacity: ").append(arr.capacity()).append("\n\n");

        System.out.println(sb.toString());
    }
}
