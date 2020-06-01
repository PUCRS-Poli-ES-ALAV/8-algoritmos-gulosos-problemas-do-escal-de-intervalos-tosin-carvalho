import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class SDM {
  public static void main(String[] args) {
    List<Intervalos> lista = new ArrayList<>();
      lista.add(new Intervalos(4, 8));
      lista.add(new Intervalos(6, 7));
      lista.add(new Intervalos(13, 14));
      lista.add(new Intervalos(4, 5));
      lista.add(new Intervalos(2, 4));
      lista.add(new Intervalos(6, 9));
      lista.add(new Intervalos(7, 10));
      lista.add(new Intervalos(9, 11));
      lista.add(new Intervalos(1, 6));
      lista.add(new Intervalos(3, 13));
      lista.add(new Intervalos(9, 12));
      
     
   
    // int[] f = {8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12};

    // result = sdmGuloso(s, f, n);

    // millis = System.currentTimeMillis();
    // System.out.println("solução SDM-Guloso: " + Arrays.toString(result));
    // millisEnd = System.currentTimeMillis();
    // total = millisEnd - millis;
    // System.out.println("TEMPO: " + total);
    // System.out.println("COUNT: " + count + "\n");

  }

  // solução recursiva

  public static Set sdm(List<Intervalos> listaIntervalos) {
    if(listaIntervalos == null || listaIntervalos.size() == 0)
        return null;
    if(listaIntervalos.size() == 1)
    return new HashSet<Intervalos>(listaIntervalos);

    Set result = new HashSet<Intervalos>();
    int index = 0;
    int lastMax = Integer.MIN_VALUE;
    while(index < listaIntervalos.size()){
        if(listaIntervalos.get(index).getMin() >= lastMax){
            result.add(listaIntervalos.get(index));
            System.out.println("AQUI");
            lastMax = listaIntervalos.get(index).getMax();
        }
    index++;
    }
    return result;
  }
}