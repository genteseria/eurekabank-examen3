package datos;

import java.sql.Connection;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author deerfox@debian
 */

public class ConexionTest {
    
    public ConexionTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
        Conexion.realizarConexion();
    }
    
    /**
     * Test of realizarConexion method, of class Conexion.
     * @throws java.lang.Exception
     */
    @org.junit.jupiter.api.Test
    public void testRealizarConexion() throws Exception {
        System.out.println("realizarConexion");
        Connection result = Conexion.realizarConexion();
        assertNotNull(result);
    }
    
}
