public class insertsort {
    public static void main(String[] args) {
        int array[] = {3, 1, 5, 4, 6, 9, 7, 10, 2, 8};
        
        insertionSort(array);
        for (int i : array){
            System.out.print(i + " ");
        }
    }
    private static void insertionSort(int []array) {
        int n = array.length;

        for (int i = 1; i < n; i++){
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}