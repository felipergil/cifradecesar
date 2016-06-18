package metodista;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe Rodrigues Gil 248543
 * Testar se está criptografando conforme normas de Cesar
 * Testar se está descriptografando conforme normas de Cesar
 * Testes com 2 palavras distintas
 * 
 */
public class CesarCifraTeste {
    
    @Test
    public void testarTornarCodificado (){
        CesarCifra linguagem = new CesarCifra();
        assertEquals("Iholsh", linguagem.tornarCodificado("Felipe"));
        assertEquals("Wulfroru", linguagem.tornarCodificado("Tricolor"));
    }
    @Test
    public void testarTornarDescodificado (){
        CesarCifra linguagem = new CesarCifra();
        assertEquals("Felipe", linguagem.tornarDescodificado("Iholsh"));
        assertEquals("Tricolor", linguagem.tornarDescodificado("Wulfroru"));
    
    
  
    }
}
