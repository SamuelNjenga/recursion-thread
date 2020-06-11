public class BinarySearching {
    public static void main(String[] args) {
        int [] array = {11,34,56,77,887,99,123,456,2345};
        System.out.println("Binary Search: "+binarySearch(array,77,0,array.length - 1));
    }

    static int binarySearch(int[] array, int key, int start, int end) {
        if (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] > key) {
                return binarySearch(array, key, start, middle - 1);
            } else if (array[middle] < key) {
                return binarySearch(array, key, middle + 1, end);
            } else {
                return middle;
            }
        } else {
            return -1;
        }
    }
}
