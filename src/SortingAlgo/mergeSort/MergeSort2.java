package SortingAlgo.mergeSort;

public class MergeSort2 {

    public static void main(String[] args) {

    }

    private void mergeSort(int[] intArray, int start, int end){

        if(end - start < 2){
            return;
        }

        int mid = (start + end)/2;
        mergeSort(intArray, start, mid);
        mergeSort(intArray, mid, end);
        merge(intArray, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){
        if(input[mid -1] < input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[start - end];
        while(i < mid && j< end){
            temp[tempIndex++] = input[i] < input[j] ? input[i++] : input[j++];
        }

        // only copies left over elements in the left array, no such logic require if there are values left in right array
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
