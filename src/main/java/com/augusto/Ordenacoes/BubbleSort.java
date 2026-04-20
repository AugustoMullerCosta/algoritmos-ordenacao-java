package com.augusto.Ordenacoes;

import java.util.Arrays;

public class BubbleSort {
    private int[] _array;
    public BubbleSort(int[] array){
        _array = Arrays.copyOf(array, array.length) ;
    }

    public int[] OrdenarBubbleSort(){
        int tamanhoLista = _array.length;
        boolean trocou;

        for(int i = 0; i < tamanhoLista; i++){
            trocou = false;
            for(int j = 0; j < tamanhoLista - i - 1; j++){
                if(_array[j] > _array[j + 1]){
                    int temp = _array[j];
                    _array[j] = _array[j + 1];
                    _array[j + 1] = temp;
                    trocou = true;
                }
            }
            if(!trocou)
                break;
        }

        return _array;
    }
}
