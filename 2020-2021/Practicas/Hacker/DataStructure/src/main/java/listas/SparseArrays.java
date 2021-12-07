package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArrays {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abcde","sdaklfj","asdjf","na","basdn",
        "sdaklfj","asdjf","na","asdjf","na","basdn","sdaklfj","asdjf");
        
        List<String> queries = Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn");
        
        matchingStrings(strings, queries);
        
    }
    
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> contadores = new ArrayList();
        
        for(int i = 0; i < queries.size(); i++) {
            String query = queries.get(i);
            int contador = 0;
            
            for(int j = 0; j < strings.size(); j++) {
                if(query.equals(strings.get(j))) {
                    contador++;
                }
                
                if(j == strings.size()-1) {
                    contadores.add(contador);
                    System.out.println(contador);
                }
            }
        }
        
        return contadores;
    }
}
