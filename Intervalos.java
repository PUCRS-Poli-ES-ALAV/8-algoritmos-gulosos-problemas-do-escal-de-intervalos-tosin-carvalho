public class Intervalos {
  private Integer minimo;
  private Integer maximo;

  public Intervalos(Integer min, Integer max) {
    this.minimo = min;
    this.maximo = max;
  }

  public Integer getMin() {
    return this.minimo;
  }

  public Integer getMax() {
    return this.maximo;
  }
}