
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>USER_EVENT_REQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="USER_EVENT_REQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APP_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ICCID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ifReq" type="{http://tsm.sp.com}IfReq"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userIDType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="validTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USER_EVENT_REQ", propOrder = {
    "aid",
    "appversion",
    "desc",
    "iccid",
    "msisdn",
    "userid",
    "username",
    "ifReq",
    "result",
    "serviceType",
    "userIDType",
    "validTime"
})
public class USEREVENTREQ {

    @XmlElement(name = "AID", required = true, nillable = true)
    protected String aid;
    @XmlElement(name = "APP_VERSION")
    protected int appversion;
    @XmlElement(name = "DESC", required = true, nillable = true)
    protected String desc;
    @XmlElement(name = "ICCID", required = true, nillable = true)
    protected String iccid;
    @XmlElement(name = "MSISDN", required = true, nillable = true)
    protected String msisdn;
    @XmlElement(name = "USERID", required = true, nillable = true)
    protected String userid;
    @XmlElement(name = "USERNAME", required = true, nillable = true)
    protected String username;
    @XmlElement(required = true, nillable = true)
    protected IfReq ifReq;
    protected int result;
    protected int serviceType;
    protected int userIDType;
    @XmlElement(required = true, nillable = true)
    protected String validTime;

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
     * 获取desc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESC() {
        return desc;
    }

    /**
     * 设置desc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESC(String value) {
        this.desc = value;
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
     * 获取result属性的值。
     * 
     */
    public int getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     */
    public void setResult(int value) {
        this.result = value;
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

    /**
     * 获取validTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTime() {
        return validTime;
    }

    /**
     * 设置validTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTime(String value) {
        this.validTime = value;
    }

}
