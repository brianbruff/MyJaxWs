
package net.bk;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PersonInfoService", targetNamespace = "http://bk.net/", wsdlLocation = "http://localhost:8080/WSETest/PersonInfo?wsdl")
public class PersonInfoService
    extends Service
{

    private final static URL PERSONINFOSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(net.bk.PersonInfoService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = net.bk.PersonInfoService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/WSETest/PersonInfo?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/WSETest/PersonInfo?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PERSONINFOSERVICE_WSDL_LOCATION = url;
    }

    public PersonInfoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonInfoService() {
        super(PERSONINFOSERVICE_WSDL_LOCATION, new QName("http://bk.net/", "PersonInfoService"));
    }

    /**
     * 
     * @return
     *     returns PersonInfo
     */
    @WebEndpoint(name = "PersonInfoPort")
    public PersonInfo getPersonInfoPort() {
        return super.getPort(new QName("http://bk.net/", "PersonInfoPort"), PersonInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonInfo
     */
    @WebEndpoint(name = "PersonInfoPort")
    public PersonInfo getPersonInfoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bk.net/", "PersonInfoPort"), PersonInfo.class, features);
    }

}
