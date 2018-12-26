package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int hole = i;

            while (hole > 0 && list[hole-1] >temp) {
                list[hole] = list[hole-1];
                hole = hole - 1;
            }
            list[hole] =temp;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        for (int z = 0; z < list.length - 1;z++) {       // n times 10
            for (int a = 0; a < list.length-1-z; a++) {  // n times 10
                if (list[a] > list[a + 1]) {
                    int temp = list[a];                  // n * n == n^2
                    list[a] = list[a + 1];                 // 10 * 10 = 100
                    list[a + 1] = temp;
                }
            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();

        // Bucket Sort
        int[] Bucket = new int[maxValue + 1];
        int[] sorted_sequence = new int[sequence.length];

        for (int i = 0; i < sequence.length; i++) {
            Bucket[sequence[i]]++;
        }
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sorted_sequence[outPos++] = i;

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return sorted_sequence;
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
