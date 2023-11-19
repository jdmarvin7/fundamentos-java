package primeirasaulas;

import java.util.ArrayList;
import java.util.List;

class EstruturaDeDados {
    public static void main(String[] args) {
        // ArrayList
        List<String> dados = new ArrayList<>();
        dados.add("Marvin");
        dados.add("Elias");
        dados.add("Rose");
        dados.add("Mozart");

        System.out.println(dados.get(1));

        for (String dado : dados) {
            System.out.println("O nome é: "+dado);
        }

        // forEach
        // dados.forEach(dado -> System.out.println("Nome foreach é "+dado));
        dados.forEach(dado -> System.out.println(""));
        dados.forEach(System.out::println);
    }
}