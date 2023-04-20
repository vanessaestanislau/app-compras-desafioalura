package appcomprasalura;

public class Compra implements Comparable<Compra> {

	String descricao;
    double valor;

    public Compra(String descricao, double valor) {
      this.descricao = descricao;
      this.valor = valor;
    }

    public Compra() {
    }

    public String getDescricao() {
      return descricao;
    }

    public double getValor() {
      return valor;
    }

    public void setDescricao(String descricao) {
      this.descricao = descricao;
    }

    public void setValor(double valor) {
      this.valor = valor;
    }

    @Override
    public String toString() {
      return "Compras Realizadas: " + descricao + ", valor: " + valor;
    }

	@Override
	public int compareTo(Compra outraCompra) {
      return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
	 	}		
}



