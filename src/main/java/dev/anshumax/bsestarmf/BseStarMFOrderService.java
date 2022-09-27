package dev.anshumax.bsestarmf;

import java.net.MalformedURLException;
import java.time.LocalDate;

import jakarta.xml.ws.soap.AddressingFeature;

import dev.anshumax.bsestarmf.additionalservices.CancelOrderResponse;
import dev.anshumax.bsestarmf.enums.BuySellType;
import dev.anshumax.bsestarmf.enums.DPTxn;
import dev.anshumax.bsestarmf.enums.FrequencyType;
import dev.anshumax.bsestarmf.enums.MFOrderTransactionCode;
import dev.anshumax.bsestarmf.enums.SipTransactionCode;
import dev.anshumax.bsestarmf.enums.TransMode;
import dev.anshumax.bsestarmf.enums.TransactionType;
import dev.anshumax.bsestarmf.exceptions.MFOrderServiceException;
import dev.anshumax.bsestarmf.exceptions.MFPasswordRequestException;
import dev.anshumax.bsestarmf.mforder.IsipOrderEntryResponse;
import dev.anshumax.bsestarmf.mforder.MFOrder;
import dev.anshumax.bsestarmf.mforder.MFOrderEntry;
import dev.anshumax.bsestarmf.mforder.MFOrderEntryResponse;
import dev.anshumax.bsestarmf.mforder.Password;
import dev.anshumax.bsestarmf.mforder.SipOrderEntryResponse;
import dev.anshumax.bsestarmf.mforder.XsipOrderEntryResponse;

public class BseStarMFOrderService {
	private MFOrderEntry mfOrderEntryClient;

	public BseStarMFOrderService(String url) throws MalformedURLException {
		AddressingFeature addressingFeature = new AddressingFeature(true, true);
		MFOrder mfOrderService = new MFOrder(url);
		mfOrderEntryClient = mfOrderService.getWSHttpBindingMFOrderEntry1(addressingFeature);
	}

	public String getEncryptedPassword(BseUser bseUser) throws MFPasswordRequestException {
		String getPasswordResponse = mfOrderEntryClient.getPassword(bseUser.getBseUserId(),
				bseUser.getBseUserPassword(), BseStarMFConstants.BSE_PASS_KEY);
		Password getPassword = new Password(getPasswordResponse);
		if (!getPassword.isValidPassword()) {
			throw new MFPasswordRequestException(getPassword.getMessage());
		}
		return getPassword.getEncryptedPassword();
	}

	public MFOrderEntryResponse newPurchaseOrder(BseUser bseUser, String euin, String internalRefNo, String clientCode,
			String schemeCode, Double amount, BuySellType buySellType, String folioNo, String encryptedPassword)
			throws MFOrderServiceException {

		String responseString = mfOrderEntryClient.orderEntryParam(MFOrderTransactionCode.NEW.getValue(),
				BseUtils.getUniqueRefNo(), null, bseUser.getBseUserId(), bseUser.getBseMemberCode(), clientCode,
				schemeCode, TransactionType.PURCHASE.getValue(), buySellType.getValue(), DPTxn.PHYSICAL.getValue(),
				amount.toString(), null, BseStarMFConstants.Y, folioNo, null, BseStarMFConstants.Y, internalRefNo, null,
				euin, BseStarMFConstants.Y, BseStarMFConstants.Y, BseStarMFConstants.Y, null, encryptedPassword,
				BseStarMFConstants.BSE_PASS_KEY, null, null, null);
		MFOrderEntryResponse response = new MFOrderEntryResponse(responseString);
		if (!response.isSuccess()) {
			throw new MFOrderServiceException(response.toString());
		}
		return response;
	}

	public CancelOrderResponse cancelPurchaseOrder(BseUser bseUser, String euin, String bseOrderId, String clientCode,
			BuySellType buySellType, String encryptedPassword) throws MFOrderServiceException {
		String transCode = MFOrderTransactionCode.CANCEL.getValue();
		String transNo = BseUtils.getUniqueRefNo();
		String userID = bseUser.getBseUserId();
		String memberId = bseUser.getBseMemberCode();
		String schemeCd = null;
		String buySell = TransactionType.PURCHASE.getValue();
		String dpTxn = DPTxn.PHYSICAL.getValue();
		String orderVal = null;
		String qty = null;
		String allRedeem = BseStarMFConstants.Y;
		String folioNo = null;
		String remarks = null;
		String kycStatus = BseStarMFConstants.Y;
		String refNo = null;
		String subBrCode = null;
		String euinVal = BseStarMFConstants.Y;
		String minRedeem = BseStarMFConstants.Y;
		String dpc = BseStarMFConstants.Y;
		String ipAdd = null;
		String passKey = BseStarMFConstants.BSE_PASS_KEY;
		String param1 = null;
		String param2 = null;
		String param3 = null;

		String responseString = mfOrderEntryClient.orderEntryParam(transCode, transNo, bseOrderId, userID, memberId,
				clientCode, schemeCd, buySell, buySellType.getValue(), dpTxn, orderVal, qty, allRedeem, folioNo,
				remarks, kycStatus, refNo, subBrCode, euin, euinVal, minRedeem, dpc, ipAdd, encryptedPassword, passKey,
				param1, param2, param3);
		CancelOrderResponse response = new CancelOrderResponse(responseString);
		if (!response.isSuccess()) {
			throw new MFOrderServiceException(response.toString());
		}
		return response;
	}

	public SipOrderEntryResponse newSip(BseUser bseUser, String euin, String clientCode, String internalRefNo,
			String schemeCode, LocalDate startDate, FrequencyType frequency, Double installmentAmount,
			Integer noOfInstallments, String encryptedPassword) {
		String transactionCode = SipTransactionCode.NEW.getValue();
		String uniqueRefNo = BseUtils.getUniqueRefNo();
		String memberCode = bseUser.getBseMemberCode();
		String userID = bseUser.getBseUserId();
		String transMode = TransMode.PHYSICAL.getValue();
		String dpTxnMode = DPTxn.PHYSICAL.getValue();
		String startDateString = startDate.format(BseStarMFConstants.BSE_DATETIME_FORMATTER);
		String frequencyType = frequency.getValue();
		String frequencyAllowed = Integer.toString(1);
		String installmentAmountString = installmentAmount.toString();
		String noOfInstallmentsString = noOfInstallments.toString();
		String remarks = null;
		String folioNo = null;
		String firstOrderFlag = BseStarMFConstants.N;
		String subberCode = null;
		String euinVal = BseStarMFConstants.Y;
		String dpc = BseStarMFConstants.Y;
		String regId = null;
		String ipAdd = null;
		String password = encryptedPassword;
		String passKey = BseStarMFConstants.BSE_PASS_KEY;
		String param1 = null;
		String param2 = null;
		String param3 = null;

		String sipOrderEntryResponseString = mfOrderEntryClient.sipOrderEntryParam(transactionCode, uniqueRefNo,
				schemeCode, memberCode, clientCode, userID, internalRefNo, transMode, dpTxnMode, startDateString,
				frequencyType, frequencyAllowed, installmentAmountString, noOfInstallmentsString, remarks, folioNo,
				firstOrderFlag, subberCode, euin, euinVal, dpc, regId, ipAdd, password, passKey, param1, param2,
				param3);

		SipOrderEntryResponse sipOrderEntryResponse = new SipOrderEntryResponse(sipOrderEntryResponseString);
		return sipOrderEntryResponse;
	}

	public IsipOrderEntryResponse newISip(BseUser bseUser, String euin, String clientCode, String internalRefNo,
			String schemeCode, LocalDate startDate, FrequencyType frequency, Double installmentAmount,
			Integer noOfInstallments, String iSipMandateID, String encryptedPassword) {

		String responseString = mfOrderEntryClient.xsipOrderEntryParam(SipTransactionCode.NEW.getValue(),
				BseUtils.getUniqueRefNo(), schemeCode, bseUser.getBseMemberCode(), clientCode, bseUser.getBseUserId(),
				internalRefNo, TransMode.PHYSICAL.getValue(), DPTxn.PHYSICAL.getValue(),
				startDate.format(BseStarMFConstants.BSE_DATETIME_FORMATTER), frequency.getValue(), Integer.toString(1),
				installmentAmount.toString(), noOfInstallments.toString(), null, null, BseStarMFConstants.N, null, null,
				null, euin, BseStarMFConstants.Y, BseStarMFConstants.Y, null, null, encryptedPassword,
				BseStarMFConstants.BSE_PASS_KEY, null, iSipMandateID, null);
		IsipOrderEntryResponse xsipOrderEntryResponse = new IsipOrderEntryResponse(responseString);
		return xsipOrderEntryResponse;
	}

	public XsipOrderEntryResponse newXSip(BseUser bseUser, String euin, String clientCode, String internalRefNo,
			String schemeCode, LocalDate startDate, FrequencyType frequency, Double installmentAmount,
			Integer noOfInstallments, String xSipMandateID, String encryptedPassword) {

		String responseString = mfOrderEntryClient.xsipOrderEntryParam(SipTransactionCode.NEW.getValue(),
				BseUtils.getUniqueRefNo(), schemeCode, bseUser.getBseMemberCode(), clientCode, bseUser.getBseUserId(),
				internalRefNo, TransMode.PHYSICAL.getValue(), DPTxn.PHYSICAL.getValue(),
				startDate.format(BseStarMFConstants.BSE_DATETIME_FORMATTER), frequency.getValue(), Integer.toString(1),
				installmentAmount.toString(), noOfInstallments.toString(), null, null, BseStarMFConstants.N, null,
				xSipMandateID, null, euin, BseStarMFConstants.Y, BseStarMFConstants.Y, null, null, encryptedPassword,
				BseStarMFConstants.BSE_PASS_KEY, null, null, null);

		System.out.println(responseString);
		XsipOrderEntryResponse xsipOrderEntryResponse = new XsipOrderEntryResponse(responseString);
		return xsipOrderEntryResponse;
	}

	public SipOrderEntryResponse cancelSip(BseUser bseUser, String euin, String clientCode, String sipRegId,
			String encryptedPassword) {
		String transactionCode = SipTransactionCode.CANCEL.getValue();
		String sipOrderEntryResponseString = mfOrderEntryClient.sipOrderEntryParam(transactionCode,
				BseUtils.getUniqueRefNo(), null, bseUser.getBseMemberCode(), clientCode, bseUser.getBseUserId(), null,
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, sipRegId, null,
				encryptedPassword, BseStarMFConstants.BSE_PASS_KEY, null, null, null);
		SipOrderEntryResponse sipOrderEntryResponse = new SipOrderEntryResponse(sipOrderEntryResponseString);
		return sipOrderEntryResponse;
	}

	public IsipOrderEntryResponse cancelISip(BseUser bseUser, String euin, String clientCode, String isipRegId,
			String encryptedPassword) {
		String transactionCode = SipTransactionCode.CANCEL.getValue();
		String isipOrderEntryResponseString = mfOrderEntryClient.xsipOrderEntryParam(transactionCode,
				BseUtils.getUniqueRefNo(), null, bseUser.getBseMemberCode(), clientCode, bseUser.getBseUserId(), null,
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				isipRegId, null, encryptedPassword, BseStarMFConstants.BSE_PASS_KEY, null, null, null);
		IsipOrderEntryResponse isipOrderEntryResponse = new IsipOrderEntryResponse(isipOrderEntryResponseString);
		return isipOrderEntryResponse;
	}

	public XsipOrderEntryResponse cancelXSip(BseUser bseUser, String euin, String clientCode, String xsipRegId,
			String encryptedPassword) {
		String transactionCode = SipTransactionCode.CANCEL.getValue();
		String xsipOrderEntryResponseString = mfOrderEntryClient.xsipOrderEntryParam(transactionCode,
				BseUtils.getUniqueRefNo(), null, bseUser.getBseMemberCode(), clientCode, bseUser.getBseUserId(), null,
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				xsipRegId, null, encryptedPassword, BseStarMFConstants.BSE_PASS_KEY, null, null, null);
		XsipOrderEntryResponse xsipOrderEntryResponse = new XsipOrderEntryResponse(xsipOrderEntryResponseString);
		return xsipOrderEntryResponse;
	}

	public MFOrderEntryResponse newFullRedemptionOrder(BseUser bseUser, String euin, String clientCode,
			String schemeCode, String folioNo, String encryptedPassword) {
		String responseString = mfOrderEntryClient.orderEntryParam(MFOrderTransactionCode.NEW.getValue(),
				BseUtils.getUniqueRefNo(), null, bseUser.getBseUserId(), bseUser.getBseMemberCode(), clientCode,
				schemeCode, TransactionType.REDEMPTION.getValue(), BuySellType.FRESH.getValue(),
				DPTxn.PHYSICAL.getValue(), null, null, BseStarMFConstants.Y, folioNo, null, BseStarMFConstants.Y, null,
				null, euin, BseStarMFConstants.Y, BseStarMFConstants.Y, BseStarMFConstants.Y, null, encryptedPassword,
				BseStarMFConstants.BSE_PASS_KEY, null, null, null);
		MFOrderEntryResponse response = new MFOrderEntryResponse(responseString);
		return response;
	}

	public MFOrderEntryResponse newPartialRedemptionByAmountOrder(BseUser bseUser, String euin, String clientCode,
			String schemeCode, String folioNo, Double amount, String encryptedPassword) {
		String responseString = mfOrderEntryClient.orderEntryParam(MFOrderTransactionCode.NEW.getValue(),
				BseUtils.getUniqueRefNo(), null, bseUser.getBseUserId(), bseUser.getBseMemberCode(), clientCode,
				schemeCode, TransactionType.REDEMPTION.getValue(), BuySellType.FRESH.getValue(),
				DPTxn.PHYSICAL.getValue(), amount.toString(), null, BseStarMFConstants.N, folioNo, null,
				BseStarMFConstants.Y, null, null, euin, BseStarMFConstants.Y, BseStarMFConstants.Y,
				BseStarMFConstants.Y, null, encryptedPassword, BseStarMFConstants.BSE_PASS_KEY, null, null, null);
		MFOrderEntryResponse response = new MFOrderEntryResponse(responseString);
		return response;
	}

	public MFOrderEntryResponse newPartialRedemptionByUnitsOrder(BseUser bseUser, String euin, String clientCode,
			String schemeCode, String folioNo, Double qtyOfUnits, String encryptedPassword) {
		String responseString = mfOrderEntryClient.orderEntryParam(MFOrderTransactionCode.NEW.getValue(),
				BseUtils.getUniqueRefNo(), null, bseUser.getBseUserId(), bseUser.getBseMemberCode(), clientCode,
				schemeCode, TransactionType.REDEMPTION.getValue(), BuySellType.FRESH.getValue(),
				DPTxn.PHYSICAL.getValue(), null, qtyOfUnits.toString(), BseStarMFConstants.N, folioNo, null,
				BseStarMFConstants.Y, null, null, euin, BseStarMFConstants.Y, BseStarMFConstants.Y,
				BseStarMFConstants.Y, null, encryptedPassword, BseStarMFConstants.BSE_PASS_KEY, null, null, null);
		MFOrderEntryResponse response = new MFOrderEntryResponse(responseString);
		return response;
	}

	public MFOrderEntryResponse newFullSwitchOutOrder(BseUser bseUser, String clientCode, String euin,
			String fromSchemeCode, String toSchemeCode, BuySellType buySellType, String folioNo, String remarks,
			String encryptedPassword) {

		String responseString = mfOrderEntryClient.switchOrderEntryParam(MFOrderTransactionCode.NEW.getValue(),
				BseUtils.getUniqueRefNo(), null, bseUser.getBseUserId(), bseUser.getBseMemberCode(), clientCode,
				fromSchemeCode, toSchemeCode, TransactionType.SWITCH_OUT.getValue(), buySellType.getValue(),
				DPTxn.PHYSICAL.getValue(), null, null, BseStarMFConstants.Y, folioNo, remarks, BseStarMFConstants.Y, null,
				null, euin, BseStarMFConstants.Y, null, encryptedPassword, BseStarMFConstants.BSE_PASS_KEY, null, null,
				null);
		return new MFOrderEntryResponse(responseString);
	}

	public MFOrderEntryResponse newPartialSwitchOutOrder(BseUser bseUser, String euin, String clientCode,
			String fromSchemeCode, String toSchemeCode, BuySellType buySellType,String switchAmount, String switchUnits, 
			String folioNo, String remarks, String encryptedPassword) {

		String responseString = mfOrderEntryClient.switchOrderEntryParam(MFOrderTransactionCode.NEW.getValue(),
				BseUtils.getUniqueRefNo(), null, bseUser.getBseUserId(), bseUser.getBseMemberCode(), clientCode,
				fromSchemeCode, toSchemeCode, TransactionType.SWITCH_OUT.getValue(), buySellType.getValue(),
				DPTxn.PHYSICAL.getValue(), switchAmount, switchUnits, BseStarMFConstants.N, folioNo, remarks,
				BseStarMFConstants.Y, null, null, euin, BseStarMFConstants.Y, null, encryptedPassword,
				BseStarMFConstants.BSE_PASS_KEY, null, null, null);
		return new MFOrderEntryResponse(responseString);
	}

	public MFOrderEntryResponse cancelFullSwitchOrder(BseUser bseUser, String euin, String clientCode,
			String fromSchemeCode, String toSchemeCode, BuySellType buySellType, String folioNo,
			String encryptedPassword) {
		String responseString = mfOrderEntryClient.switchOrderEntryParam(MFOrderTransactionCode.CANCEL.getValue(),
				BseUtils.getUniqueRefNo(), null, bseUser.getBseUserId(), bseUser.getBseMemberCode(), clientCode,
				fromSchemeCode, toSchemeCode, TransactionType.SWITCH_OUT.getValue(), buySellType.getValue(),
				DPTxn.PHYSICAL.getValue(), null, null, BseStarMFConstants.Y, folioNo, null, BseStarMFConstants.Y, null,
				null, euin, BseStarMFConstants.Y, null, encryptedPassword, BseStarMFConstants.BSE_PASS_KEY, null, null,
				null);
		return new MFOrderEntryResponse(responseString);
	}

	public MFOrderEntryResponse cancelPartialSwitchOrder(BseUser bseUser, String euin, String clientCode,
			String fromSchemeCode, String toSchemeCode, BuySellType buySellType, String folioNo, String switchAmount,
			String switchUnits, String encryptedPassword) {
		String responseString = mfOrderEntryClient.switchOrderEntryParam(MFOrderTransactionCode.CANCEL.getValue(),
				BseUtils.getUniqueRefNo(), null, bseUser.getBseUserId(), bseUser.getBseMemberCode(), clientCode,
				fromSchemeCode, toSchemeCode, TransactionType.SWITCH_OUT.getValue(), buySellType.getValue(),
				DPTxn.PHYSICAL.getValue(), switchAmount, switchUnits, BseStarMFConstants.N, folioNo, null,
				BseStarMFConstants.Y, null, null, euin, BseStarMFConstants.Y, null, encryptedPassword,
				BseStarMFConstants.BSE_PASS_KEY, null, null, null);
		return new MFOrderEntryResponse(responseString);
	}
}
