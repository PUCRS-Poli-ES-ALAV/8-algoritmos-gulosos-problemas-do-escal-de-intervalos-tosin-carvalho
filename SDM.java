public class SDM {
  public static void main(String[] args) {

    int[] s = {4, 6, 13, 4, 2, 6, 7, 9, 1, 3, 9};
    int[] f = {8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12};

    result = sdmGuloso(s, f, n);

    millis = System.currentTimeMillis();
    System.out.println("solução SDM-Guloso: " + Arrays.toString(result));
    millisEnd = System.currentTimeMillis();
    total = millisEnd - millis;
    System.out.println("TEMPO: " + total);
    // System.out.println("COUNT: " + count + "\n");

  }

  // solução recursiva
  public static int[] sdmGuloso(int[] s, int[] f, n) {
    1   f[0] = −∞
    2   X ← { }
    3   i ← 0
    4   para k ← 1 até n faça
    5         if (s[k] > f[i])
    6              então X ← X ∪ {k}
    7                       i ← k
    8   return X;
  }
}