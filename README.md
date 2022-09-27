
# BSE StarMF Web Service

This repository contains a Java implementation of the BSE StarMF SOAP Web Service API.
This has been used at least once on production.

It is a work-in-progress; feel free to add issues / comments! Happy to collaborate. 
 
 
*Usage example*:
```java
package com.example.bsestarmf;

import com.sun.xml.ws.util.StringUtils;
import dev.anshumax.bsestarmf.*;
import dev.anshumax.bsestarmf.enums.BuySellType;
import dev.anshumax.bsestarmf.mforder.MFOrderEntryResponse;

import java.math.BigDecimal;

public class AppMain {

    //Can use the Test URL as well for testing
    static String BSE_PROD_URL = "https://www.bsestarmf.in/";

    //Obtain the BSE StarMF Member Code, UserID and Password
    static String BSE_STARMF_MEMBER_CODE = "..";
    static String BSE_STARMF_USER_ID = "..";
    static String BSE_STARMF_USER_PASSWORD = "..";

    public static void main(String[] args) throws Exception{


        BseStarMFAdditionalServices bseStarMFAdditionalServices = new BseStarMFAdditionalServices(BSE_PROD_URL);
        BseStarMFPaymentGatewayService starMFPaymentGatewayService =  new BseStarMFPaymentGatewayService(BSE_PROD_URL);
        BseStarMFOrderService starMFOrderService = new BseStarMFOrderService(BSE_PROD_URL);
        BseStarMFFileUploadService starMFFileUploadService = new BseStarMFFileUploadService(BSE_PROD_URL);

        BseUser bseUser = new BseUser(BSE_STARMF_MEMBER_CODE, BSE_STARMF_USER_ID, BSE_STARMF_USER_PASSWORD);

        String encryptedPassword = starMFOrderService.getEncryptedPassword(bseUser);
        String internalRefNo = generateIdForOneTimeOrder(); //Generate or obtain an internal reference ID

        String folioNo = "...";
        String euin = "...";
        String clientCode = "...";
        String schemeCode = "...";
        BigDecimal amount = ...;
        BuySellType buySellType = folioNo.isBlank() ? BuySellType.FRESH : BuySellType.ADDITIONAL;
        MFOrderEntryResponse response = starMFOrderService.newPurchaseOrder(bseUser, euin, internalRefNo,
                    clientCode, schemeCode, amount, buySellType, folioNo, encryptedPassword);
        if (!response.isSuccess()) {
            throw new Exception("New Purchase order failed: " + response.getBseRemarks());
        }
    }
}

```


Overview
==
Keras is built around a few core abstractions which comprise much of what is needed to build deep learning models. 
These include Layers, Models, Optimizers, Activations, Losses, Metrics, Regularizers, and Initializers.

Basics
--
To use TensorFlow, we must have access to a `Graph` to build and run computations. In Python, this is constructed
implicitly. In TF Java, the `Graph` and `Ops` objects must be created explicitly. Thus, we
leave this (below) for the user to write, and allow the `Ops` object to be passed
throughout keras `Layer` construction calls to provide access to core tensorflow operations.

```java
try(Graph graph = new Graph) {
    Ops tf = Ops.create(graph);
    
    // Keras code here.
}
```
