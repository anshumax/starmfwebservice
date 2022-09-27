package dev.anshumax.bsestarmf.fileupload;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-08-06T14:24:43.136+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IStarMFFileUploadService")
@XmlSeeAlso({ObjectFactory.class})
public interface IStarMFFileUploadService {

    @WebMethod(operationName = "UploadFile", action = "http://tempuri.org/IStarMFFileUploadService/UploadFile")
    @Action(input = "http://tempuri.org/IStarMFFileUploadService/UploadFile", output = "http://tempuri.org/IStarMFFileUploadService/UploadFileResponse")
    @RequestWrapper(localName = "UploadFile", targetNamespace = "http://tempuri.org/", className = "com.claroinvestments.bsestarmf.mandateupload.UploadFile")
    @ResponseWrapper(localName = "UploadFileResponse", targetNamespace = "http://tempuri.org/", className = "com.claroinvestments.bsestarmf.mandateupload.UploadFileResponse")
    @WebResult(name = "UploadFileResult", targetNamespace = "http://tempuri.org/")
    public Response uploadFile(
        @WebParam(name = "data", targetNamespace = "http://tempuri.org/")
        FileData data
    );

    @WebMethod(operationName = "UploadMandateScanFile", action = "http://tempuri.org/IStarMFFileUploadService/UploadMandateScanFile")
    @Action(input = "http://tempuri.org/IStarMFFileUploadService/UploadMandateScanFile", output = "http://tempuri.org/IStarMFFileUploadService/UploadMandateScanFileResponse")
    @RequestWrapper(localName = "UploadMandateScanFile", targetNamespace = "http://tempuri.org/", className = "com.claroinvestments.bsestarmf.mandateupload.UploadMandateScanFile")
    @ResponseWrapper(localName = "UploadMandateScanFileResponse", targetNamespace = "http://tempuri.org/", className = "com.claroinvestments.bsestarmf.mandateupload.UploadMandateScanFileResponse")
    @WebResult(name = "UploadMandateScanFileResult", targetNamespace = "http://tempuri.org/")
    public Response uploadMandateScanFile(
        @WebParam(name = "Data", targetNamespace = "http://tempuri.org/")
        MandateScanFileData data
    );

    @WebMethod(operationName = "JsonData", action = "http://tempuri.org/IStarMFFileUploadService/JsonData")
    @Action(input = "http://tempuri.org/IStarMFFileUploadService/JsonData", output = "http://tempuri.org/IStarMFFileUploadService/JsonDataResponse")
    @RequestWrapper(localName = "JsonData", targetNamespace = "http://tempuri.org/", className = "com.claroinvestments.bsestarmf.mandateupload.JsonData")
    @ResponseWrapper(localName = "JsonDataResponse", targetNamespace = "http://tempuri.org/", className = "com.claroinvestments.bsestarmf.mandateupload.JsonDataResponse")
    public void jsonData(
        @WebParam(name = "Data", targetNamespace = "http://tempuri.org/")
        java.lang.String data
    );

    @WebMethod(operationName = "GetPassword", action = "http://tempuri.org/IStarMFFileUploadService/GetPassword")
    @Action(input = "http://tempuri.org/IStarMFFileUploadService/GetPassword", output = "http://tempuri.org/IStarMFFileUploadService/GetPasswordResponse")
    @RequestWrapper(localName = "GetPassword", targetNamespace = "http://tempuri.org/", className = "com.claroinvestments.bsestarmf.mandateupload.GetPassword")
    @ResponseWrapper(localName = "GetPasswordResponse", targetNamespace = "http://tempuri.org/", className = "com.claroinvestments.bsestarmf.mandateupload.GetPasswordResponse")
    @WebResult(name = "GetPasswordResult", targetNamespace = "http://tempuri.org/")
    public Response getPassword(
        @WebParam(name = "Param", targetNamespace = "http://tempuri.org/")
        PasswordRequest param
    );
}