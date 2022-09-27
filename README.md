
# BSE StarMF Web Service

This repository contains an unofficial Java implementation of the BSE StarMF SOAP Web Service.
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

