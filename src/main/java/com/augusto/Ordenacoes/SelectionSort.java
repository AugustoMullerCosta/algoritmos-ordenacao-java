package com.augusto.Ordenacoes;

import java.util.Arrays;

public class SelectionSort {
    private int[] _array;

    public SelectionSort(int[] array){
        _array = Arrays.copyOf(array, array.length) ;
    }

    public int[] OrdenarSelectionSort(){
        int tamanhoArray = _array.length;

        for(int i = 0; i < tamanhoArray-1; i++){
            int indiceMenor = i;

            for (int j =i +1;j < tamanhoArray; j++){
                if(_array[j] < _array[indiceMenor]){
                    indiceMenor = j;
                }
            }

            int temp = _array[indiceMenor];
            _array[indiceMenor] = _array[i];
            _array[i] = temp;

        }
        return _array;
    }
}
