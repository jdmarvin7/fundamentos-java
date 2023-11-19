package primeirasaulas;

import java.util.Map;
import java.util.HashMap;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Marvin", 10);
        notas.put("Mozart", 18);

        // Integer nota = notas.get("Marvin");

        for(Map.Entry<String, Integer> entry: notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é "+ key + " e o valor é "+value);
        }
    }
}
