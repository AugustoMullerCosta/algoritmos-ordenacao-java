package com.augusto.Ordenacoes;

import java.util.Arrays;

public class QuickSort {
    private int[] _array;

    public QuickSort(int[] array) {
        _array = Arrays.copyOf(array, array.length);
    }

    public int[] OrdenarQuickSort() {
        QuickSort(0, _array.length - 1);
        return _array;
    }

    private void QuickSort(int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = Particionar(inicio, fim);
            QuickSort(inicio, pivoIndex - 1);
            QuickSort(pivoIndex + 1, fim);
        }
    }

    private int Particionar(int inicio, int fim) {
        int pivo = _array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (_array[j] <= pivo) {
                i++;
                Trocar(i, j);
            }
        }

        Trocar(i + 1, fim);
        return i + 1;
    }

    private void Trocar(int i, int j) {
        int temp = _array[i];
        _array[i] = _array[j];
        _array[j] = temp;
    }

}

