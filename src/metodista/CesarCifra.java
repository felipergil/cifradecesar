package metodista;

/**
 * @author Felipe Rodrigues Gil 248543 Parâmetros definidos conforme cifra de
 * Cesar. Criptografar aumentando cada letra em 3 e Descriptografar diminuindo
 * em 3.
 */
public class CesarCifra {

    public String tornarCodificado(String letras) {
        String mensagem = new String("");
        int total = letras.length();
        int qtletras = 0;
        while (qtletras < total) {
            char op = letras.charAt(qtletras);
            int x = op + 3;
            mensagem += (char) x;
            qtletras++;
        }
        return mensagem;
    }

    public String tornarDescodificado(String letras) {
        String mensagem = new String("");
        int total = letras.length();
        int qtletras = 0;
        while (qtletras < total) {
            char op = letras.charAt(qtletras);
            int x = op - 3;
            mensagem += (char) x;

            qtletras++;
        }
        return mensagem;
    }
}
