package com.augusto.Ordenacoes;

import java.util.Arrays;

public class InsertionSort {
    private int[] _array;

    public InsertionSort(int[] array){
        _array = Arrays.copyOf(array, array.length);
    }

    public int[] OrdenarInsertionSort(){
        int tamanhoArray = _array.length;

        for(int i = 1; i < tamanhoArray;i++){
            int chave = _array[i];
            int j = i -1;

            while(j >= 0 && _array[j] > chave){
                _array[j + 1] = _array[j];
                j--;
            }

            _array[j + 1] = chave;
        }

        return  _array;
    }
}
