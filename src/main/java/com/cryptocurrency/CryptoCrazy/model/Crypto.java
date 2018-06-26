package com.cryptocurrency.CryptoCrazy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Crypto {
	
	@JsonProperty("BTC")
	private BTC BTC;
	@JsonProperty("ETH")
	private ETH ETH;
	@JsonProperty("XRP")
	private XRP XRP;
	@JsonProperty("BCH")
	private BCH BCH;
	@JsonProperty("EOS")
	private EOS EOS;
	@JsonProperty("LTC")
	private LTC LTC;
	@JsonProperty("XLM")
	private XLM XLM;
	@JsonProperty("ADA")
	private ADA ADA;
	@JsonProperty("IOT")
	private IOT IOT;
	@JsonProperty("TRX")
	private TRX TRX;
	@JsonProperty("USDT")
	private USDT USDT;
	@JsonProperty("NEO")
	private NEO NEO;
	@JsonProperty("DASH")
	private DASH DASH;
	@JsonProperty("XMR")
	private XMR XMR;
	@JsonProperty("XEM")
	private XEM XEM;
	@JsonProperty("BNB")
	private BNB BNB;
	@JsonProperty("VEN")
	private VEN VEN;
	@JsonProperty("ETC")
	private ETC ETC;
	@JsonProperty("QTUM")
	private QTUM QTUM;
	@JsonProperty("OMG")
	private OMG OMG;
	@JsonProperty("Data")
	private Data Data;

	public Data getData() {
		return Data;
	}

	public void setData(Data data) {
		Data = data;
	}

	public Crypto() {
		// TODO Auto-generated constructor stub
	}

	public BTC getBTC() {
		return BTC;
	}

	public void setBTC(BTC bTC) {
		BTC = bTC;
	}

	public ETH getETH() {
		return ETH;
	}

	public void setETH(ETH eTH) {
		ETH = eTH;
	}

	public XRP getXRP() {
		return XRP;
	}

	public void setXRP(XRP xRP) {
		XRP = xRP;
	}

	public BCH getBCH() {
		return BCH;
	}

	public void setBCH(BCH bCH) {
		BCH = bCH;
	}

	public EOS getEOS() {
		return EOS;
	}

	public void setEOS(EOS eOS) {
		EOS = eOS;
	}

	public LTC getLTC() {
		return LTC;
	}

	public void setLTC(LTC lTC) {
		LTC = lTC;
	}

	public XLM getXLM() {
		return XLM;
	}

	public void setXLM(XLM xLM) {
		XLM = xLM;
	}

	public ADA getADA() {
		return ADA;
	}

	public void setADA(ADA aDA) {
		ADA = aDA;
	}

	public IOT getIOT() {
		return IOT;
	}

	public void setIOT(IOT iOT) {
		IOT = iOT;
	}

	public TRX getTRX() {
		return TRX;
	}

	public void setTRX(TRX tRX) {
		TRX = tRX;
	}

	public USDT getUSDT() {
		return USDT;
	}

	public void setUSDT(USDT uSDT) {
		USDT = uSDT;
	}

	public NEO getNEO() {
		return NEO;
	}

	public void setNEO(NEO nEO) {
		NEO = nEO;
	}

	public DASH getDASH() {
		return DASH;
	}

	public void setDASH(DASH dASH) {
		DASH = dASH;
	}

	public XMR getXMR() {
		return XMR;
	}

	public void setXMR(XMR xMR) {
		XMR = xMR;
	}

	public XEM getXEM() {
		return XEM;
	}

	public void setXEM(XEM xEM) {
		XEM = xEM;
	}

	public BNB getBNB() {
		return BNB;
	}

	public void setBNB(BNB bNB) {
		BNB = bNB;
	}

	public VEN getVEN() {
		return VEN;
	}

	public void setVEN(VEN vEN) {
		VEN = vEN;
	}

	public ETC getETC() {
		return ETC;
	}

	public void setETC(ETC eTC) {
		ETC = eTC;
	}

	public QTUM getQTUM() {
		return QTUM;
	}

	public void setQTUM(QTUM qTUM) {
		QTUM = qTUM;
	}

	public OMG getOMG() {
		return OMG;
	}

	public void setOMG(OMG oMG) {
		OMG = oMG;
	}

	@Override
	public String toString() {
		return "Crypto [BTC=" + BTC + ", ETH=" + ETH + ", XRP=" + XRP + ", BCH=" + BCH + ", EOS=" + EOS + ", LTC=" + LTC
				+ ", XLM=" + XLM + ", ADA=" + ADA + ", IOT=" + IOT + ", TRX=" + TRX + ", USDT=" + USDT + ", NEO=" + NEO
				+ ", DASH=" + DASH + ", XMR=" + XMR + ", XEM=" + XEM + ", BNB=" + BNB + ", VEN=" + VEN + ", ETC=" + ETC
				+ ", QTUM=" + QTUM + ", OMG=" + OMG + "]";
	}

	
}
