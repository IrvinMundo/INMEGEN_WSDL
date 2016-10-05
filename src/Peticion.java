import java.io.File;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.io.IOException;
//import java.security.PrivateKey;
//import java.util.Map;

//import javax.security.cert.X509Certificate;
//import javax.xml.ws.BindingProvider;

//import org.apache.tomcat.util.http.fileupload.FileUtils;

//import com.sun.xml.internal.ws.runtime.config.ObjectFactory;

//import sun.security.pkcs.PKCS8Key;

//import java.security.PrivateKey;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.ssl.PKCS8Key;


public class Peticion {


	  private static X509Certificate cert;
	  private static PrivateKey key;
	  private static PrivateKey key;

	  private static X509Certificate cert;

	    @BeforeClass
	    public static void loadKeys() throws Exception {

	        key = KeyLoaderFactory.createInstance(
	                KeyLoaderEnumeration.PRIVATE_KEY_LOADER,
	                "resources/certs/aaa010101aaa__csd_01.key",
	                "12345678a"
	        ).getKey();

	        cert = KeyLoaderFactory.createInstance(
	                KeyLoaderEnumeration.PUBLIC_KEY_LOADER,
	                "resources/certs/aaa010101aaa__csd_01.cer"
	        ).getKey();
	    }

	  /*public static void loadKeys() throws Exception {
		    key = KeyLoaderFactory.createInstance(
		            KeyLoaderEnumeration.PRIVATE_KEY_LOADER,
		            new FileInputStream("resources/CSD_AIS8012085L7/CSD_Pruebas_AIS8012085L7.key"),
		            "12345678a"
		    ).getKey();

		    cert = KeyLoaderFactory.createInstance(
		            KeyLoaderEnumeration.PUBLIC_KEY_LOADER,
		            new FileInputStream("resources/CSD_AIS8012085L7/CSD_Pruebas_AIS8012085L7.cer")
		    ).getKey();
		  }*/
	  
	  /** Retorna una llave privada utilizando los datos y la passphrase indicada. Se utiliza apache-commons-ssl para esto
	   * ya que no hay manera simple de hacerlo directo con java */
	  /*public static PrivateKey getPrivateKey(File pkeyFile, String passphrase){
	      try {
	          byte[] keyBytes = FileUtils.readFileToByteArray(pkeyFile);
	          return getPrivateKey(keyBytes, passphrase);
	      } catch (IOException e) {
	          throw new RuntimeException(e);
	      }
	  }
	  /** Retorna una llave privada utilizando los datos y la passphrase indicada. Se utiliza not-yet-commons-ssl para esto
	   * ya que no hay manera simple de hacerlo directo con java */
	  /*public static PrivateKey getPrivateKey(byte[] encryptedKey, String passphrase){
	      try {
	          PKCS8Key pkcs8 = new PKCS8Key(encryptedKey, passphrase.toCharArray()); 
	          return  ((Object) pkcs8).getPrivateKey();
	      } catch (Exception e) {
	          throw new RuntimeException("Clave inválida");
	      }
	  }
	  public static void main(String[] args) {
		  
	
	    private static RespuestaNominaRecepcion procesarPaquete(wsalejo.PeticionNominaRecepcion parameters) {
	        wsalejo.NominaRecepcion service = new wsalejo.NominaRecepcion();
	        wsalejo.INominaRecepcion port = service.getEndPointRecibe();
	 
	        BindingProvider bindingProvider = (BindingProvider) port;
	         
	        Map<String, Object> req_context = ((BindingProvider)port).getRequestContext();
	         
	        req_context.put("RFC", "AIS8012085L7");
	         
	        return port.procesarPaquete(parameters);
	    }*/

	  
}
