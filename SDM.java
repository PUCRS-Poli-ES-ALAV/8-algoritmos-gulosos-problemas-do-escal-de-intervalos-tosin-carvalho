import java.util.ArrayList;
import java.util.List;

public class SDM {
  public static void main(String[] args) {

    ArrayList<Integer> minMax = new ArrayList<Integer>();
    minMax={{4,6},{1,13},{2,8},{7,9}};
    // int[] f = {8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12};

    List<Intervalos> listaIntervalos = minMax;

    System.out.println(listaIntervalos.get(1).minimo);

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

  Collections.sort(listaIntervalos);
  Set result = new HashSet<Intervalos>();
  int index = 0;
  int lastMax = Integer.MIN_VALUE;
  while(index < listaIntervalos.size()){
      if(listaIntervalos.get(index).minimo >= lastMax){
          result.add(listaIntervalos.get(index));
          lastMax = listaIntervalos.get(index).maximo;
      }
  index++;
  }
  return result;
}