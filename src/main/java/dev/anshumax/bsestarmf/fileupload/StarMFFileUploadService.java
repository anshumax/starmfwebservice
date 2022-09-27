package dev.anshumax.bsestarmf.fileupload;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-08-06T14:24:43.187+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "StarMFFileUploadService",
                  wsdlLocation = "https://bsestarmf.in/StarMFFileUploadService/StarMFFileUploadService.svc?wsdl",
                  targetNamespace = "http://tempuri.org/")
public class StarMFFileUploadService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "StarMFFileUploadService");
    public final static QName WSHttpBindingIStarMFFileUploadService = new QName("http://tempuri.org/", "WSHttpBinding_IStarMFFileUploadService");
    public final static QName WSHttpBindingIStarMFFileUploadService1 = new QName("http://tempuri.org/", "WSHttpBinding_IStarMFFileUploadService1");
    static {
        URL url = null;
        try {
            url = new URL("https://bsestarmf.in/StarMFFileUploadService/StarMFFileUploadService.svc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StarMFFileUploadService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "https://bsestarmf.in/StarMFFileUploadService/StarMFFileUploadService.svc?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StarMFFileUploadService(String url) throws MalformedURLException {
    	super(new URL(url + "/StarMFFileUploadService/StarMFFileUploadService.svc?wsdl"), SERVICE);
    	
    }
    public StarMFFileUploadService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StarMFFileUploadService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StarMFFileUploadService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public StarMFFileUploadService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public StarMFFileUploadService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public StarMFFileUploadService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IStarMFFileUploadService
     */
    @WebEndpoint(name = "WSHttpBinding_IStarMFFileUploadService")
    public IStarMFFileUploadService getWSHttpBindingIStarMFFileUploadService() {
        return super.getPort(WSHttpBindingIStarMFFileUploadService, IStarMFFileUploadService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IStarMFFileUploadService
     */
    @WebEndpoint(name = "WSHttpBinding_IStarMFFileUploadService")
    public IStarMFFileUploadService getWSHttpBindingIStarMFFileUploadService(WebServiceFeature... features) {
        return super.getPort(WSHttpBindingIStarMFFileUploadService, IStarMFFileUploadService.class, features);
    }


    /**
     *
     * @return
     *     returns IStarMFFileUploadService
     */
    @WebEndpoint(name = "WSHttpBinding_IStarMFFileUploadService1")
    public IStarMFFileUploadService getWSHttpBindingIStarMFFileUploadService1() {
        return super.getPort(WSHttpBindingIStarMFFileUploadService1, IStarMFFileUploadService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IStarMFFileUploadService
     */
    @WebEndpoint(name = "WSHttpBinding_IStarMFFileUploadService1")
    public IStarMFFileUploadService getWSHttpBindingIStarMFFileUploadService1(WebServiceFeature... features) {
        return super.getPort(WSHttpBindingIStarMFFileUploadService1, IStarMFFileUploadService.class, features);
    }

}