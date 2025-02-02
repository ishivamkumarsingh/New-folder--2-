interface Sortable {
    public void sort(int arr[]);
}


class BubbleSort implements Sortable {
    @Override
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


class SelectionSort implements Sortable {
    @Override
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}


class Main {
    public static void main(String[] args) {
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        
        Sortable bubbleSort = new BubbleSort();
        Sortable selectionSort = new SelectionSort();
        
        System.out.println("Original array: ");
        printArray(arr1);
        
        bubbleSort.sort(arr1);
        System.out.println("\nArray sorted using Bubble Sort: ");
        printArray(arr1);
        
        selectionSort.sort(arr2);
        System.out.println("\nArray sorted using Selection Sort: ");
        printArray(arr2);
    }
    
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}