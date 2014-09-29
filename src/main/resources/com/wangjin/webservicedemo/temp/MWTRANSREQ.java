
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MW_TRANS_REQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MW_TRANS_REQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APP_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DEAL_TYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ICCID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRANSACTIONID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ifReq" type="{http://tsm.sp.com}IfReq"/>
 *         &lt;element name="Params" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MW_TRANS_REQ", propOrder = {
    "aid",
    "appversion",
    "dealtype",
    "iccid",
    "msisdn",
    "transactionid",
    "vendorcode",
    "ifReq",
    "params"
})
public class MWTRANSREQ {

    @XmlElement(name = "AID", required = true, nillable = true)
    protected String aid;
    @XmlElement(name = "APP_VERSION")
    protected int appversion;
    @XmlElement(name = "DEAL_TYPE")
    protected int dealtype;
    @XmlElement(name = "ICCID", required = true, nillable = true)
    protected String iccid;
    @XmlElement(name = "MSISDN", required = true, nillable = true)
    protected String msisdn;
    @XmlElement(name = "TRANSACTIONID", required = true, nillable = true)
    protected String transactionid;
    @XmlElement(name = "VENDOR_CODE", required = true, nillable = true)
    protected String vendorcode;
    @XmlElement(required = true, nillable = true)
    protected IfReq ifReq;
    @XmlElement(name = "Params", required = true, nillable = true)
    protected String params;

    /**
     * 获取aid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAID() {
        return aid;
    }

    /**
     * 设置aid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAID(String value) {
        this.aid = value;
    }

    /**
     * 获取appversion属性的值。
     * 
     */
    public int getAPPVERSION() {
        return appversion;
    }

    /**
     * 设置appversion属性的值。
     * 
     */
    public void setAPPVERSION(int value) {
        this.appversion = value;
    }

    /**
     * 获取dealtype属性的值。
     * 
     */
    public int getDEALTYPE() {
        return dealtype;
    }

    /**
     * 设置dealtype属性的值。
     * 
     */
    public void setDEALTYPE(int value) {
        this.dealtype = value;
    }

    /**
     * 获取iccid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCID() {
        return iccid;
    }

    /**
     * 设置iccid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCID(String value) {
        this.iccid = value;
    }

    /**
     * 获取msisdn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * 设置msisdn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * 获取transactionid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONID() {
        return transactionid;
    }

    /**
     * 设置transactionid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONID(String value) {
        this.transactionid = value;
    }

    /**
     * 获取vendorcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENDORCODE() {
        return vendorcode;
    }

    /**
     * 设置vendorcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENDORCODE(String value) {
        this.vendorcode = value;
    }

    /**
     * 获取ifReq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IfReq }
     *     
     */
    public IfReq getIfReq() {
        return ifReq;
    }

    /**
     * 设置ifReq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IfReq }
     *     
     */
    public void setIfReq(IfReq value) {
        this.ifReq = value;
    }

    /**
     * 获取params属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置params属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParams(String value) {
        this.params = value;
    }

}
