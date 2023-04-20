package appcomprasalura;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

	 private double limite;
     private double saldo;
     private List<Compra> compras;

     public List<Compra> getCompras() {
        return compras;
     }

     public void setCompras(List<Compra> compras) {
        this.compras = compras;
     }

     public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
     }

     public CartaoDeCredito() {
     }

     public double getLimite() {
       return limite;
     }

     public double getSaldo() {
       return saldo;
     }

     public boolean lancaCompra(Compra compra) {
       if (this.saldo >= compra.getValor()) {
         this.saldo -= compra.getValor();
         this.compras.add(compra);
         return true;
       }
      return false;
     }
     
}
