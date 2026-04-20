package com.augusto.Utils;

import com.augusto.Ordenacoes.BubbleSort;
import com.augusto.Ordenacoes.InsertionSort;
import com.augusto.Ordenacoes.QuickSort;
import com.augusto.Ordenacoes.SelectionSort;

public class Utils {
    public static RespostaOrdenacao ObtemDadosOrdenados(ETipoOrdenacao tipo, int[] array){
        RespostaOrdenacao resposta = new RespostaOrdenacao();
        int[] listaOrdenada = new int[array.length];
        long tempoInicio = System.nanoTime();

        if(tipo == ETipoOrdenacao.BUBBLE){
            BubbleSort bubbleSort = new BubbleSort(array);
            listaOrdenada = bubbleSort.OrdenarBubbleSort();
        }
        else if(tipo == ETipoOrdenacao.INSERTION){
            InsertionSort insertionSort = new InsertionSort(array);
            listaOrdenada = insertionSort.OrdenarInsertionSort();
        }
        else if(tipo == ETipoOrdenacao.QUICK){
            QuickSort quickSort = new QuickSort(array);
            listaOrdenada = quickSort.OrdenarQuickSort();
        }
        else if(tipo == ETipoOrdenacao.SELECTION){
            SelectionSort selectionSort = new SelectionSort(array);
            listaOrdenada = selectionSort.OrdenarSelectionSort();
        }

        long tempoFinal = System.nanoTime();

        resposta.Lista = listaOrdenada;
        resposta.TempoInicial = tempoInicio;
        resposta.TempoFinal =tempoFinal;

        return  resposta;
    }
}
