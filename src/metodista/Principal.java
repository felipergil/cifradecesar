package metodista;

import java.util.Scanner;

/**
 *
 * @author Felipe Rodrigues Gil - 248543 Interação com usuário para poder
 * selecionar o que deseja fazer.
 */
public class Principal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palavradousuario;
        System.out.println("O que deseja?");
        System.out.println("1 - Codificar palavra");
        System.out.println("2 - Descodificar palavra");
        System.out.print("Opção: ");
        int escolha = s.nextInt();
        if (escolha == 1) {
            CesarCifra linguagem = new CesarCifra();
            System.out.println("Digite uma palavra para ser codificada.");
            palavradousuario = s.next();
            palavradousuario = linguagem.tornarCodificado(palavradousuario);
            System.out.println("Codificação criada: " + palavradousuario);
        } else if (escolha == 2) {
            CesarCifra linguagem = new CesarCifra();
            System.out.println("Digite uma palavra para ser descodificada");
            palavradousuario = s.next();
            palavradousuario = linguagem.tornarDescodificado(palavradousuario);
            System.out.println("Codificação criada: " + palavradousuario);
        } else {
            System.out.println("Opção inexistente");
        }
    }

}
