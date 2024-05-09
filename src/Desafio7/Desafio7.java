package Desafio7;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Integer segundoMaior = numeros.stream()
                .distinct()
                .sorted(Integer::compare)
                .skip(numeros.size() - 2)
                .findFirst()
                .orElse(null);

        System.out.println("O segundo número maior da lista é: " + segundoMaior);
    }
}
