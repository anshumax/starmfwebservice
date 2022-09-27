
package dev.anshumax.bsestarmf.additionalservices;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.claroinvestments.bsestarmf.starmfservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PasswordRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "PasswordRequest");
    private final static QName _Response_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Response");
    private final static QName _MFAPIRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MFAPIRequest");
    private final static QName _ChildOrderRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ChildOrderRequest");
    private final static QName _ChildOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ChildOrderResponse");
    private final static QName _ArrayOfChildOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfChildOrderDetails");
    private final static QName _ChildOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ChildOrderDetails");
    private final static QName _MandateDetailsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MandateDetailsRequest");
    private final static QName _MandateDetailsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MandateDetailsResponse");
    private final static QName _ArrayOfMandateDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfMandateDetails");
    private final static QName _MandateDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MandateDetails");
    private final static QName _OrderRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderRequest");
    private final static QName _ProvOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ProvOrderResponse");
    private final static QName _ArrayOfProvOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfProvOrderDetails");
    private final static QName _ProvOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ProvOrderDetails");
    private final static QName _OrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderResponse");
    private final static QName _ArrayOfOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfOrderDetails");
    private final static QName _OrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderDetails");
    private final static QName _AllotmentStatementRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AllotmentStatementRequest");
    private final static QName _AllotmentStatementResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AllotmentStatementResponse");
    private final static QName _ArrayOfAllotmentDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfAllotmentDetails");
    private final static QName _AllotmentDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AllotmentDetails");
    private final static QName _RedemptionStatementRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RedemptionStatementRequest");
    private final static QName _RedemptionStatementResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RedemptionStatementResponse");
    private final static QName _ArrayOfRedemptionDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfRedemptionDetails");
    private final static QName _RedemptionDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RedemptionDetails");
    private final static QName _EMandateAuthURLRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "EMandateAuthURLRequest");
    private final static QName _EMandateAuthURLResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "EMandateAuthURLResponse");
    private final static QName _AOFPanSearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AOFPanSearchRequest");
    private final static QName _AOFPanSearchResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AOFPanSearchResponse");
    private final static QName _ImageResponseStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ImageResponseStatus");
    private final static QName _ImageUploadStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ImageUploadStatus");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.claroinvestments.bsestarmf.starmfservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PasswordRequest }
     * 
     */
    public PasswordRequest createPasswordRequest() {
        return new PasswordRequest();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link MFAPIRequest }
     * 
     */
    public MFAPIRequest createMFAPIRequest() {
        return new MFAPIRequest();
    }

    /**
     * Create an instance of {@link ChildOrderRequest }
     * 
     */
    public ChildOrderRequest createChildOrderRequest() {
        return new ChildOrderRequest();
    }

    /**
     * Create an instance of {@link ChildOrderResponse }
     * 
     */
    public ChildOrderResponse createChildOrderResponse() {
        return new ChildOrderResponse();
    }

    /**
     * Create an instance of {@link ArrayOfChildOrderDetails }
     * 
     */
    public ArrayOfChildOrderDetails createArrayOfChildOrderDetails() {
        return new ArrayOfChildOrderDetails();
    }

    /**
     * Create an instance of {@link ChildOrderDetails }
     * 
     */
    public ChildOrderDetails createChildOrderDetails() {
        return new ChildOrderDetails();
    }

    /**
     * Create an instance of {@link MandateDetailsRequest }
     * 
     */
    public MandateDetailsRequest createMandateDetailsRequest() {
        return new MandateDetailsRequest();
    }

    /**
     * Create an instance of {@link MandateDetailsResponse }
     * 
     */
    public MandateDetailsResponse createMandateDetailsResponse() {
        return new MandateDetailsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMandateDetails }
     * 
     */
    public ArrayOfMandateDetails createArrayOfMandateDetails() {
        return new ArrayOfMandateDetails();
    }

    /**
     * Create an instance of {@link MandateDetails }
     * 
     */
    public MandateDetails createMandateDetails() {
        return new MandateDetails();
    }

    /**
     * Create an instance of {@link OrderRequest }
     * 
     */
    public OrderRequest createOrderRequest() {
        return new OrderRequest();
    }

    /**
     * Create an instance of {@link ProvOrderResponse }
     * 
     */
    public ProvOrderResponse createProvOrderResponse() {
        return new ProvOrderResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProvOrderDetails }
     * 
     */
    public ArrayOfProvOrderDetails createArrayOfProvOrderDetails() {
        return new ArrayOfProvOrderDetails();
    }

    /**
     * Create an instance of {@link ProvOrderDetails }
     * 
     */
    public ProvOrderDetails createProvOrderDetails() {
        return new ProvOrderDetails();
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrderDetails }
     * 
     */
    public ArrayOfOrderDetails createArrayOfOrderDetails() {
        return new ArrayOfOrderDetails();
    }

    /**
     * Create an instance of {@link OrderDetails }
     * 
     */
    public OrderDetails createOrderDetails() {
        return new OrderDetails();
    }

    /**
     * Create an instance of {@link AllotmentStatementRequest }
     * 
     */
    public AllotmentStatementRequest createAllotmentStatementRequest() {
        return new AllotmentStatementRequest();
    }

    /**
     * Create an instance of {@link AllotmentStatementResponse }
     * 
     */
    public AllotmentStatementResponse createAllotmentStatementResponse() {
        return new AllotmentStatementResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAllotmentDetails }
     * 
     */
    public ArrayOfAllotmentDetails createArrayOfAllotmentDetails() {
        return new ArrayOfAllotmentDetails();
    }

    /**
     * Create an instance of {@link AllotmentDetails }
     * 
     */
    public AllotmentDetails createAllotmentDetails() {
        return new AllotmentDetails();
    }

    /**
     * Create an instance of {@link RedemptionStatementRequest }
     * 
     */
    public RedemptionStatementRequest createRedemptionStatementRequest() {
        return new RedemptionStatementRequest();
    }

    /**
     * Create an instance of {@link RedemptionStatementResponse }
     * 
     */
    public RedemptionStatementResponse createRedemptionStatementResponse() {
        return new RedemptionStatementResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRedemptionDetails }
     * 
     */
    public ArrayOfRedemptionDetails createArrayOfRedemptionDetails() {
        return new ArrayOfRedemptionDetails();
    }

    /**
     * Create an instance of {@link RedemptionDetails }
     * 
     */
    public RedemptionDetails createRedemptionDetails() {
        return new RedemptionDetails();
    }

    /**
     * Create an instance of {@link EMandateAuthURLRequest }
     * 
     */
    public EMandateAuthURLRequest createEMandateAuthURLRequest() {
        return new EMandateAuthURLRequest();
    }

    /**
     * Create an instance of {@link EMandateAuthURLResponse }
     * 
     */
    public EMandateAuthURLResponse createEMandateAuthURLResponse() {
        return new EMandateAuthURLResponse();
    }

    /**
     * Create an instance of {@link AOFPanSearchRequest }
     * 
     */
    public AOFPanSearchRequest createAOFPanSearchRequest() {
        return new AOFPanSearchRequest();
    }

    /**
     * Create an instance of {@link AOFPanSearchResponse }
     * 
     */
    public AOFPanSearchResponse createAOFPanSearchResponse() {
        return new AOFPanSearchResponse();
    }

    /**
     * Create an instance of {@link ImageResponseStatus }
     * 
     */
    public ImageResponseStatus createImageResponseStatus() {
        return new ImageResponseStatus();
    }

    /**
     * Create an instance of {@link ImageUploadStatus }
     * 
     */
    public ImageUploadStatus createImageUploadStatus() {
        return new ImageUploadStatus();
    }

    /**
     * Create an instance of {@link GetPassword }
     * 
     */
    public GetPassword createGetPassword() {
        return new GetPassword();
    }

    /**
     * Create an instance of {@link GetPasswordResponse }
     * 
     */
    public GetPasswordResponse createGetPasswordResponse() {
        return new GetPasswordResponse();
    }

    /**
     * Create an instance of {@link MFAPI }
     * 
     */
    public MFAPI createMFAPI() {
        return new MFAPI();
    }

    /**
     * Create an instance of {@link MFAPIResult }
     * 
     */
    public MFAPIResult createMFAPIResponse() {
        return new MFAPIResult();
    }

    /**
     * Create an instance of {@link GetPasswordMobile }
     * 
     */
    public GetPasswordMobile createGetPasswordMobile() {
        return new GetPasswordMobile();
    }

    /**
     * Create an instance of {@link GetPasswordMobileResponse }
     * 
     */
    public GetPasswordMobileResponse createGetPasswordMobileResponse() {
        return new GetPasswordMobileResponse();
    }

    /**
     * Create an instance of {@link MFAPIMobile }
     * 
     */
    public MFAPIMobile createMFAPIMobile() {
        return new MFAPIMobile();
    }

    /**
     * Create an instance of {@link MFAPIMobileResponse }
     * 
     */
    public MFAPIMobileResponse createMFAPIMobileResponse() {
        return new MFAPIMobileResponse();
    }

    /**
     * Create an instance of {@link GetPasswordForChildOrder }
     * 
     */
    public GetPasswordForChildOrder createGetPasswordForChildOrder() {
        return new GetPasswordForChildOrder();
    }

    /**
     * Create an instance of {@link GetPasswordForChildOrderResponse }
     * 
     */
    public GetPasswordForChildOrderResponse createGetPasswordForChildOrderResponse() {
        return new GetPasswordForChildOrderResponse();
    }

    /**
     * Create an instance of {@link ChildOrderDetails2 }
     * 
     */
    public ChildOrderDetails2 createChildOrderDetails2() {
        return new ChildOrderDetails2();
    }

    /**
     * Create an instance of {@link ChildOrderDetailsResponse }
     * 
     */
    public ChildOrderDetailsResponse createChildOrderDetailsResponse() {
        return new ChildOrderDetailsResponse();
    }

    /**
     * Create an instance of {@link GetAccessToken }
     * 
     */
    public GetAccessToken createGetAccessToken() {
        return new GetAccessToken();
    }

    /**
     * Create an instance of {@link GetAccessTokenResponse }
     * 
     */
    public GetAccessTokenResponse createGetAccessTokenResponse() {
        return new GetAccessTokenResponse();
    }

    /**
     * Create an instance of {@link MandateDetails2 }
     * 
     */
    public MandateDetails2 createMandateDetails2() {
        return new MandateDetails2();
    }

    /**
     * Create an instance of {@link MandateDetailsResponse2 }
     * 
     */
    public MandateDetailsResponse2 createMandateDetailsResponse2() {
        return new MandateDetailsResponse2();
    }

    /**
     * Create an instance of {@link ProvOrderStatus }
     * 
     */
    public ProvOrderStatus createProvOrderStatus() {
        return new ProvOrderStatus();
    }

    /**
     * Create an instance of {@link ProvOrderStatusResponse }
     * 
     */
    public ProvOrderStatusResponse createProvOrderStatusResponse() {
        return new ProvOrderStatusResponse();
    }

    /**
     * Create an instance of {@link OrderStatus }
     * 
     */
    public OrderStatus createOrderStatus() {
        return new OrderStatus();
    }

    /**
     * Create an instance of {@link OrderStatusResponse }
     * 
     */
    public OrderStatusResponse createOrderStatusResponse() {
        return new OrderStatusResponse();
    }

    /**
     * Create an instance of {@link AllotmentStatement }
     * 
     */
    public AllotmentStatement createAllotmentStatement() {
        return new AllotmentStatement();
    }

    /**
     * Create an instance of {@link AllotmentStatementResponse2 }
     * 
     */
    public AllotmentStatementResponse2 createAllotmentStatementResponse2() {
        return new AllotmentStatementResponse2();
    }

    /**
     * Create an instance of {@link RedemptionStatement }
     * 
     */
    public RedemptionStatement createRedemptionStatement() {
        return new RedemptionStatement();
    }

    /**
     * Create an instance of {@link RedemptionStatementResponse2 }
     * 
     */
    public RedemptionStatementResponse2 createRedemptionStatementResponse2() {
        return new RedemptionStatementResponse2();
    }

    /**
     * Create an instance of {@link EMandateAuthURL }
     * 
     */
    public EMandateAuthURL createEMandateAuthURL() {
        return new EMandateAuthURL();
    }

    /**
     * Create an instance of {@link EMandateAuthURLResponse2 }
     * 
     */
    public EMandateAuthURLResponse2 createEMandateAuthURLResponse2() {
        return new EMandateAuthURLResponse2();
    }

    /**
     * Create an instance of {@link AOFPanSearch }
     * 
     */
    public AOFPanSearch createAOFPanSearch() {
        return new AOFPanSearch();
    }

    /**
     * Create an instance of {@link AOFPanSearchResponse2 }
     * 
     */
    public AOFPanSearchResponse2 createAOFPanSearchResponse2() {
        return new AOFPanSearchResponse2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "PasswordRequest")
    public JAXBElement<PasswordRequest> createPasswordRequest(PasswordRequest value) {
        return new JAXBElement<PasswordRequest>(_PasswordRequest_QNAME, PasswordRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFAPIRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MFAPIRequest")
    public JAXBElement<MFAPIRequest> createMFAPIRequest(MFAPIRequest value) {
        return new JAXBElement<MFAPIRequest>(_MFAPIRequest_QNAME, MFAPIRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ChildOrderRequest")
    public JAXBElement<ChildOrderRequest> createChildOrderRequest(ChildOrderRequest value) {
        return new JAXBElement<ChildOrderRequest>(_ChildOrderRequest_QNAME, ChildOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ChildOrderResponse")
    public JAXBElement<ChildOrderResponse> createChildOrderResponse(ChildOrderResponse value) {
        return new JAXBElement<ChildOrderResponse>(_ChildOrderResponse_QNAME, ChildOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChildOrderDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfChildOrderDetails")
    public JAXBElement<ArrayOfChildOrderDetails> createArrayOfChildOrderDetails(ArrayOfChildOrderDetails value) {
        return new JAXBElement<ArrayOfChildOrderDetails>(_ArrayOfChildOrderDetails_QNAME, ArrayOfChildOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildOrderDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ChildOrderDetails")
    public JAXBElement<ChildOrderDetails> createChildOrderDetails(ChildOrderDetails value) {
        return new JAXBElement<ChildOrderDetails>(_ChildOrderDetails_QNAME, ChildOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateDetailsRequest")
    public JAXBElement<MandateDetailsRequest> createMandateDetailsRequest(MandateDetailsRequest value) {
        return new JAXBElement<MandateDetailsRequest>(_MandateDetailsRequest_QNAME, MandateDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateDetailsResponse")
    public JAXBElement<MandateDetailsResponse> createMandateDetailsResponse(MandateDetailsResponse value) {
        return new JAXBElement<MandateDetailsResponse>(_MandateDetailsResponse_QNAME, MandateDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMandateDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfMandateDetails")
    public JAXBElement<ArrayOfMandateDetails> createArrayOfMandateDetails(ArrayOfMandateDetails value) {
        return new JAXBElement<ArrayOfMandateDetails>(_ArrayOfMandateDetails_QNAME, ArrayOfMandateDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateDetails")
    public JAXBElement<MandateDetails> createMandateDetails(MandateDetails value) {
        return new JAXBElement<MandateDetails>(_MandateDetails_QNAME, MandateDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderRequest")
    public JAXBElement<OrderRequest> createOrderRequest(OrderRequest value) {
        return new JAXBElement<OrderRequest>(_OrderRequest_QNAME, OrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ProvOrderResponse")
    public JAXBElement<ProvOrderResponse> createProvOrderResponse(ProvOrderResponse value) {
        return new JAXBElement<ProvOrderResponse>(_ProvOrderResponse_QNAME, ProvOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProvOrderDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfProvOrderDetails")
    public JAXBElement<ArrayOfProvOrderDetails> createArrayOfProvOrderDetails(ArrayOfProvOrderDetails value) {
        return new JAXBElement<ArrayOfProvOrderDetails>(_ArrayOfProvOrderDetails_QNAME, ArrayOfProvOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvOrderDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ProvOrderDetails")
    public JAXBElement<ProvOrderDetails> createProvOrderDetails(ProvOrderDetails value) {
        return new JAXBElement<ProvOrderDetails>(_ProvOrderDetails_QNAME, ProvOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderResponse")
    public JAXBElement<OrderResponse> createOrderResponse(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_OrderResponse_QNAME, OrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfOrderDetails")
    public JAXBElement<ArrayOfOrderDetails> createArrayOfOrderDetails(ArrayOfOrderDetails value) {
        return new JAXBElement<ArrayOfOrderDetails>(_ArrayOfOrderDetails_QNAME, ArrayOfOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderDetails")
    public JAXBElement<OrderDetails> createOrderDetails(OrderDetails value) {
        return new JAXBElement<OrderDetails>(_OrderDetails_QNAME, OrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllotmentStatementRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AllotmentStatementRequest")
    public JAXBElement<AllotmentStatementRequest> createAllotmentStatementRequest(AllotmentStatementRequest value) {
        return new JAXBElement<AllotmentStatementRequest>(_AllotmentStatementRequest_QNAME, AllotmentStatementRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllotmentStatementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AllotmentStatementResponse")
    public JAXBElement<AllotmentStatementResponse> createAllotmentStatementResponse(AllotmentStatementResponse value) {
        return new JAXBElement<AllotmentStatementResponse>(_AllotmentStatementResponse_QNAME, AllotmentStatementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAllotmentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfAllotmentDetails")
    public JAXBElement<ArrayOfAllotmentDetails> createArrayOfAllotmentDetails(ArrayOfAllotmentDetails value) {
        return new JAXBElement<ArrayOfAllotmentDetails>(_ArrayOfAllotmentDetails_QNAME, ArrayOfAllotmentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllotmentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AllotmentDetails")
    public JAXBElement<AllotmentDetails> createAllotmentDetails(AllotmentDetails value) {
        return new JAXBElement<AllotmentDetails>(_AllotmentDetails_QNAME, AllotmentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionStatementRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RedemptionStatementRequest")
    public JAXBElement<RedemptionStatementRequest> createRedemptionStatementRequest(RedemptionStatementRequest value) {
        return new JAXBElement<RedemptionStatementRequest>(_RedemptionStatementRequest_QNAME, RedemptionStatementRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionStatementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RedemptionStatementResponse")
    public JAXBElement<RedemptionStatementResponse> createRedemptionStatementResponse(RedemptionStatementResponse value) {
        return new JAXBElement<RedemptionStatementResponse>(_RedemptionStatementResponse_QNAME, RedemptionStatementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRedemptionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfRedemptionDetails")
    public JAXBElement<ArrayOfRedemptionDetails> createArrayOfRedemptionDetails(ArrayOfRedemptionDetails value) {
        return new JAXBElement<ArrayOfRedemptionDetails>(_ArrayOfRedemptionDetails_QNAME, ArrayOfRedemptionDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RedemptionDetails")
    public JAXBElement<RedemptionDetails> createRedemptionDetails(RedemptionDetails value) {
        return new JAXBElement<RedemptionDetails>(_RedemptionDetails_QNAME, RedemptionDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMandateAuthURLRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EMandateAuthURLRequest")
    public JAXBElement<EMandateAuthURLRequest> createEMandateAuthURLRequest(EMandateAuthURLRequest value) {
        return new JAXBElement<EMandateAuthURLRequest>(_EMandateAuthURLRequest_QNAME, EMandateAuthURLRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMandateAuthURLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EMandateAuthURLResponse")
    public JAXBElement<EMandateAuthURLResponse> createEMandateAuthURLResponse(EMandateAuthURLResponse value) {
        return new JAXBElement<EMandateAuthURLResponse>(_EMandateAuthURLResponse_QNAME, EMandateAuthURLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AOFPanSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AOFPanSearchRequest")
    public JAXBElement<AOFPanSearchRequest> createAOFPanSearchRequest(AOFPanSearchRequest value) {
        return new JAXBElement<AOFPanSearchRequest>(_AOFPanSearchRequest_QNAME, AOFPanSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AOFPanSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AOFPanSearchResponse")
    public JAXBElement<AOFPanSearchResponse> createAOFPanSearchResponse(AOFPanSearchResponse value) {
        return new JAXBElement<AOFPanSearchResponse>(_AOFPanSearchResponse_QNAME, AOFPanSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageResponseStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ImageResponseStatus")
    public JAXBElement<ImageResponseStatus> createImageResponseStatus(ImageResponseStatus value) {
        return new JAXBElement<ImageResponseStatus>(_ImageResponseStatus_QNAME, ImageResponseStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageUploadStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ImageUploadStatus")
    public JAXBElement<ImageUploadStatus> createImageUploadStatus(ImageUploadStatus value) {
        return new JAXBElement<ImageUploadStatus>(_ImageUploadStatus_QNAME, ImageUploadStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

}
