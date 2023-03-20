import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.Clase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestConversionXML {

    @Test
    public void testObjetoAXML() throws JsonProcessingException {
        XmlMapper mapeador = new XmlMapper();
        String salida = mapeador.writeValueAsString(new Clase("Carpintería", "Gepetto", 140));

        assertNotNull(salida);

    }
}
