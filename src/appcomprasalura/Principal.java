package appcomprasalura;

import java.util.Collections;
import java.util.Scanner;

public class Principal {

	private static boolean compraRealizada; 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Digite o limite do cartão:");
        double limiteCartao = scan.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limiteCartao);

        int sair = 1;
        while (sair != 0) {
          System.out.println("Digite a descrição da compra:");
          String descricaoDaCompra = scan.next();
          System.out.println("Digite o valor da compra: ");

          double valorDaCompra = scan.nextDouble();
              if (valorDaCompra <= limiteCartao) {
                Compra compra = new Compra(descricaoDaCompra, valorDaCompra);
                compra.setValor(valorDaCompra);
                compra.setDescricao(descricaoDaCompra);
                compraRealizada = cartao.lancaCompra(compra);
              }
              if (compraRealizada) {
                System.out.println("Compra efetuada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = scan.nextInt();
              } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
              }
        }
        
        System.out.println("***********************************************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(cartao.getCompras());

        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }

        System.out.println("\n***********************");
        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
	}

}

