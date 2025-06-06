public class Calculadora {
  private Double numUm;
  private Double numDois;

  public Calculadora(Double numUm, Double numDois) {
    this.numDois = numDois;
    this.numUm = numUm;
  }

  public Double somar() {
    return this.numUm + this.numDois;
  }

  public Double subtrair() {
    return this.numUm - this.numDois;
  }

  public Double multiplicar() {
    return this.numUm * this.numDois;
  }

  public String dividir() {
    if (this.numDois == 0) {
      return "Impossível realizar uma divisão por zero.";
    } else {
      return String.valueOf(this.numUm / this.numDois);
    }
  }

  public String potencia() {
    if (this.numDois == 0) {
      return "1";
    } else {
      return String.valueOf(Math.pow(this.numUm, this.numDois));
    }
  }

  public String raizQuadrada() {
    if (this.numUm < 0) {
      return "Não existe raiz de número negativo.";
    } else {
      return String.valueOf(Math.sqrt(this.numUm));
    }
  }
}
