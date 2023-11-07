package org.argentina.programa;

import org.argentina.programa.interfaces.ConcatenarSegunTamanio;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> listaConFrases = List.of(
                "Lorem ipsum dolor sit amet",
                "consectetur adipiscing elit",
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                "Ut enim ad minim veniam",
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        );

        ConcatenarSegunTamanio concatenarSegunTamanio = (lista, tamanio) ->
                lista.stream()
                .filter(frase -> frase.length() > tamanio)
                .collect(Collectors.joining(", "));

        System.out.println(concatenarSegunTamanio.contatenador(listaConFrases, 30));
    }
}