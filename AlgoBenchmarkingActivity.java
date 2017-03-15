package com.felight.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.felight.myapp2.utils.Calculator;

public class AlgoBenchmarkingActivity extends AppCompatActivity {

    private RadioGroup rgComplexity;
    private EditText etArraySize;
    private TextView tvArrayStatus;
    private int[] array;
    private TextView tvResult;
    private TextView tvBubble;
    private TextView tvSelection;
    private TextView tvInsertion;
    private TextView tvQuick;
    private TextView tvMerge;
    private TextView tvHeap;
    int size;


    static void bubbleSort(int[] numbers) {
        int n = numbers.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(numbers[j-1] >numbers[j]){
                    //swap elements
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    private int arra[];
    private int length;
    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.arra = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = arra[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
            while (arra[i] < pivot) {
                i++;
            }
            while (arra[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
    private void exchangeNumbers(int i, int j) {
        int temp = arra[i];
        arra[i] = arra[j];
        arra[j] = temp;
    }


    private int[] array1;
    private int[] tempMergArr;
    public void Sort(int inputArr[]) {
        this.array1 = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
    private void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array1[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array1[k] = tempMergArr[i];
                i++;
            }
            else {
                array1[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array1[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;
    public static void buildheap(int []a) {
        n = a.length-1;
        for(int i=n/2; i>=0; i--){
            maxheap(a,i);
        }
    }
    public static void maxheap(int[] a, int i) {
        left = 2*i;
        right = 2*i+1;
        if(left <= n && a[left] > a[i]){
            largest=left;
        } else {
            largest=i;
        }
        if(right <= n && a[right] > a[largest]) {
            largest=right;
        }
        if(largest!=i) {
            exchange(i, largest);
            maxheap(a, largest);
        }
    }
    public static void exchange(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void Sort1(int[] myarray) {
        a = myarray;
        buildheap(a);
        for(int i=n; i>0; i--) {
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
    }

    public void sorting(View view) {


        switch (view.getId()) {
            case R.id.btnBubble:
                long startTime = System.nanoTime();
                bubbleSort(array);
                long duration = System.nanoTime() - startTime;
                tvBubble.setText(""+duration+"ms");
                break;


            case R.id.btnSelection:
                startTime = System.nanoTime();
                selectionSort(array);
                duration = System.nanoTime() - startTime;
                tvSelection.setText(""+duration+"ms");
                break;


            case R.id.btnInsertion:
                startTime = System.nanoTime();
                insertionSort(array);
                duration = System.nanoTime() - startTime;
                tvInsertion.setText(""+duration+"ms");
                break;

            case R.id.btnQuick:
                startTime = System.nanoTime();
                sort(array);
                duration = System.nanoTime() - startTime;
                tvQuick.setText(""+duration+"ms");
                break;

            case R.id.btnMerge:
                startTime = System.nanoTime();
                Sort(array);
                duration = System.nanoTime() - startTime;
                tvMerge.setText(""+duration+"ms");
                break;


            case R.id.btnHeap:
                startTime = System.nanoTime();
                Sort1(array);
                duration = System.nanoTime() - startTime;
                tvHeap.setText(""+duration+"ms");
                break;

            case R.id.btnBenchMark:
                startTime = System.nanoTime();
                bubbleSort(array);
                duration = System.nanoTime() - startTime;
                tvBubble.setText(""+duration+"ms");

                startTime = System.nanoTime();
                selectionSort(array);
                duration = System.nanoTime() - startTime;
                tvSelection.setText(""+duration+"ms");

                startTime = System.nanoTime();
                insertionSort(array);
                duration = System.nanoTime() - startTime;
                tvInsertion.setText(""+duration+"ms");


                startTime = System.nanoTime();
                sort(array);
                duration = System.nanoTime() - startTime;
                tvQuick.setText(""+duration+"ms");

                startTime = System.nanoTime();
                Sort(array);
                duration = System.nanoTime() - startTime;
                tvMerge.setText(""+duration+"ms");

                startTime = System.nanoTime();
                Sort1(array);
                duration = System.nanoTime() - startTime;
                tvHeap.setText(""+duration+"ms");

                break;

        }
    }

    public void generateArray(View view){
        int size=0;
        try{
            size=Integer.parseInt(etArraySize.getText().toString());
        }catch (NumberFormatException e)
        {
            tvArrayStatus.setText("Please provide valid input");
            return;
        }

        switch(rgComplexity.getCheckedRadioButtonId()){
            case R.id.rbBestCase:
                array= Calculator.generateSortedArray(size);
                tvArrayStatus.setText("Array of size " + size + " generated for " + "Best Case");

                break;

            case R.id.rbAverageCase:
                array= Calculator.generateRandomArray(size);
                tvArrayStatus.setText("Array of size " + size + " generated for " + "Average Case");

                break;

            case R.id.rbWorstCase:
                array= Calculator.generateSortedArrayDesc(size);
                tvArrayStatus.setText("Array of size " + size + " generated for " + "Worst Case");

                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo_benchmarking);
        rgComplexity=(RadioGroup) findViewById(R.id.rgComplexity);
        etArraySize=(EditText) findViewById(R.id.etArraySize);
        tvArrayStatus=(TextView) findViewById(R.id.tvArrayStatus);
        tvResult=(TextView) findViewById(R.id.tvResult);
        tvBubble=(TextView)findViewById(R.id.tvBubble);
        tvSelection=(TextView)findViewById(R.id.tvSelection);
        tvInsertion=(TextView)findViewById(R.id.tvInsertion);
        tvQuick=(TextView)findViewById(R.id.tvQuick);
        tvMerge=(TextView)findViewById(R.id.tvMerge);
        tvHeap=(TextView)findViewById(R.id.tvHeap);
    }
}
