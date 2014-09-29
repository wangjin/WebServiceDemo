
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>USER_AUC_REQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="USER_AUC_REQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APP_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ICCID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ifReq" type="{http://tsm.sp.com}IfReq"/>
 *         &lt;element name="Params" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserIDType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USER_AUC_REQ", propOrder = {
    "aid",
    "appversion",
    "iccid",
    "msisdn",
    "userid",
    "username",
    "vendorcode",
    "ifReq",
    "params",
    "serviceType",
    "userIDType"
})
public class USERAUCREQ {

    @XmlElement(name = "AID", required = true, nillable = true)
    protected String aid;
    @XmlElement(name = "APP_VERSION")
    protected int appversion;
    @XmlElement(name = "ICCID", required = true, nillable = true)
    protected String iccid;
    @XmlElement(name = "MSISDN", required = true, nillable = true)
    protected String msisdn;
    @XmlElement(name = "USERID", required = true, nillable = true)
    protected String userid;
    @XmlElement(name = "USERNAME", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "VENDOR_CODE", required = true, nillable = true)
    protected String vendorcode;
    @XmlElement(required = true, nillable = true)
    protected IfReq ifReq;
    @XmlElement(name = "Params", required = true, nillable = true)
    protected String params;
    @XmlElement(name = "ServiceType")
    protected int serviceType;
    @XmlElement(name = "UserIDType")
    protected int userIDType;

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
     * 获取userid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * 设置userid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * 获取username属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERNAME() {
        return username;
    }

    /**
     * 设置username属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERNAME(String value) {
        this.username = value;
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

    /**
     * 获取serviceType属性的值。
     * 
     */
    public int getServiceType() {
        return serviceType;
    }

    /**
     * 设置serviceType属性的值。
     * 
     */
    public void setServiceType(int value) {
        this.serviceType = value;
    }

    /**
     * 获取userIDType属性的值。
     * 
     */
    public int getUserIDType() {
        return userIDType;
    }

    /**
     * 设置userIDType属性的值。
     * 
     */
    public void setUserIDType(int value) {
        this.userIDType = value;
    }

}
