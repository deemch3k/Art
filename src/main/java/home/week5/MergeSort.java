package home.week5;

/**
 * Created by Дмитрий on 10.11.2016.
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {1,2,6,1,2,8,5,8,3,1,3,0,6,5,2,4};
        print(arr);
        System.out.println();
        print(mergeSort(arr));

    }

    private static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] mergeSort(int array[]){

        if(array.length > 1){

            int elementsInA1 = array.length/2;

            int elementsInA2 = elementsInA1;

            if((array.length % 2) == 1) {
                elementsInA2 += 1;
            }
            int arr1[] = new int[elementsInA1];
            int arr2[] = new int[elementsInA2];

            for(int i = 0; i < elementsInA1; i++) {
                arr1[i] = array[i];
            }
            for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++) {
                arr2[i - elementsInA1] = array[i];
            }

            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            int i = 0;
            int j = 0;
            int k = 0;

            while(arr1.length != j && arr2.length != k)
            {
                if(arr1[j] < arr2[k])
                {
                    array[i] = arr1[j];
                    i++;
                    j++;
                }
                else
                {
                    array[i] = arr2[k];
                    i++;
                    k++;
                }
            }
            while(arr1.length != j)
            {
                array[i] = arr1[j];
                i++;
                j++;
            }
            while(arr2.length != k)
            {
                array[i] = arr2[k];
                i++;
                k++;
            }
        }
        return array;
    }

}
