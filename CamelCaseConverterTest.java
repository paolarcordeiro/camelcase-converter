import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CamelCaseConverterTest {

    @Test
    public void testConverterNomeSimples() {
        assertEquals("NomeSimples", CamelCaseConverter.converter("nome simples"));
    }

    @Test
    public void testConverterStringNula() {
        assertEquals("", CamelCaseConverter.converter(null));
    }

    @Test
    public void testConverterStringVazia() {
        assertEquals("", CamelCaseConverter.converter(""));
    }

    @Test
    public void testConverterComecandoComNumero() {
        assertEquals("1Nome", CamelCaseConverter.converter("1 nome"));
    }

    @Test
    public void testConverterComCaracteresEspeciais() {
        assertEquals("NomeComCaracteresEspeciais", CamelCaseConverter.converter("nome com caracteres especiais!"));
    }

    @Test
    public void testConverterNomeComMaiscula() {
        assertEquals("Nome", CamelCaseConverter.converter("NOME"));
    }

    @Test
    public void testConverterCamelCaseSimples() {
        assertEquals("SimplesCamelCase", CamelCaseConverter.converter("simples camel case"));
    }

    @Test
    public void testConverterComMultiplasMaiusculas() {
        assertEquals("ComMultiplasMaiusculas", CamelCaseConverter.converter("com MULTIPLAS minusculas"));
    }

    @Test
    public void testConverterSiglaCompleta() {
        assertEquals("SiglaCompleta", CamelCaseConverter.converter("SIGLA COMPLETA"));
    }

    @Test
    public void testConverterComDígitosNoMeio() {
        assertEquals("Nome2Simples", CamelCaseConverter.converter("nome 2 simples"));
    }

    @Test
    public void testConverterComplexo() {
        assertEquals("ComplexoTesteDeConversao", CamelCaseConverter.converter("complexo teste de conversao!!"));
    }
}