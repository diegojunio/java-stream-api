package functional_interface.examples.Supplies;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(3)
                .collect(Collectors.toList());
        listaSaudacoes.forEach(System.out::println);
    }
}

