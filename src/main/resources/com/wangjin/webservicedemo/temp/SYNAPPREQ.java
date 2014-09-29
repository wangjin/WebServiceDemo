
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SYN_APP_REQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SYN_APP_REQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APP_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ICCID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LCS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ifReq" type="{http://tsm.sp.com}IfReq"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SYN_APP_REQ", propOrder = {
    "aid",
    "appversion",
    "iccid",
    "lcs",
    "msisdn",
    "vendorcode",
    "ifReq"
})
public class SYNAPPREQ {

    @XmlElement(name = "AID", required = true, nillable = true)
    protected String aid;
    @XmlElement(name = "APP_VERSION")
    protected int appversion;
    @XmlElement(name = "ICCID", required = true, nillable = true)
    protected String iccid;
    @XmlElement(name = "LCS")
    protected int lcs;
    @XmlElement(name = "MSISDN", required = true, nillable = true)
    protected String msisdn;
    @XmlElement(name = "VENDOR_CODE", required = true, nillable = true)
    protected String vendorcode;
    @XmlElement(required = true, nillable = true)
    protected IfReq ifReq;

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
     * 获取lcs属性的值。
     * 
     */
    public int getLCS() {
        return lcs;
    }

    /**
     * 设置lcs属性的值。
     * 
     */
    public void setLCS(int value) {
        this.lcs = value;
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

}
