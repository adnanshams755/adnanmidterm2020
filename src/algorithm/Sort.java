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
        int n = array.length;

        for (int i = 1; i < n; i++)
        {   System.out.println("Sort Pass Number "+(i));
            int key = array[i];
            int j = i-1;

            while ( (j > -1) && ( array [j] > key ) )
            {
                System.out.println("Comparing "+ key  + " and " + array [j]);
                array [j+1] = array [j];
                j--;
            }
            array[j+1] = key;

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++) // Looping through the array length
        {
            System.out.println("Sort Pass Number " + (i + 1));
            for (int j = 1; j < (n - i); j++) {
                System.out.println("Comparing " + array[j - 1] + " and " + array[j]);
                if (array[j - 1] > array[j]) {

                    //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
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


    public int [] bucketSort(int [] array, int maxArrayElementValue){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        int max =  maxArrayElementValue;
        int [] bucket=new int[max+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<list.length; i++) {
            bucket[list[i]]++;
        }

        int position=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                list[position++]=i;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        int inner, outer;
        int temp;
        int h = 1;
        while(h <= array.length/3)
            h = h*3 + 1;
        while(h>0)
        {
            for(outer=h; outer<array.length; outer++)
            {
                temp = list[outer];
                inner = outer;
                while(inner > h-1 && list[inner-h] >= temp)
                {
                    list[inner] = list[inner-h];
                    inner -= h;
                }
                list[inner] = temp;
            }
            h = (h-1) / 3;
        }
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
