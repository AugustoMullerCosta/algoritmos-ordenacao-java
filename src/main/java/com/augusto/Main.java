package com.augusto;

import com.augusto.Ordenacoes.BubbleSort;
import com.augusto.Ordenacoes.InsertionSort;
import com.augusto.Ordenacoes.QuickSort;
import com.augusto.Ordenacoes.SelectionSort;
import com.augusto.Utils.ETipoOrdenacao;
import com.augusto.Utils.RespostaOrdenacao;
import com.augusto.Utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list =  new ArrayList<Integer>();

        while (true) {
            System.out.print("Informe um número (ou qualquer letra para sair):");

            if (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }else{
                System.out.println("Lista lida: " + list);
                scanner.next();
                break;
            }
        }

        int[] array = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        while(true){
            System.out.println("Informe que tipo de ordenação você deseja fazer? (InsertionSort 'I', BubbleSort 'B', QuickSort 'Q' ou SelectionSort 'S') e para sair 'Sair')");
            var escolha = scanner.next();

            ETipoOrdenacao tipo = switch (escolha.toUpperCase()) {
                case "I" -> ETipoOrdenacao.INSERTION;
                case "B" -> ETipoOrdenacao.BUBBLE;
                case "Q" -> ETipoOrdenacao.QUICK;
                case "S" -> ETipoOrdenacao.SELECTION;
                default -> null;
            };

            if(escolha.toUpperCase().equalsIgnoreCase("SAIR")){
                System.out.println("Saindo...");
                break;
            }

            if (tipo == null) {
                System.out.println("Opção inválida, tente novamente.");
                continue;
            }

            RespostaOrdenacao resposta = Utils.ObtemDadosOrdenados(tipo, array);

            System.out.println("Lista ordenada: " + Arrays.toString(resposta.Lista));
            System.out.println("Tempo: " + (resposta.TempoFinal - resposta.TempoInicial) + " ns");

        }
    }
}
