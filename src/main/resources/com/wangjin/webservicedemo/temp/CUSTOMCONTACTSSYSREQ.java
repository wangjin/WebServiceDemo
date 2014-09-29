
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CUSTOM_CONTACTS_SYS_REQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CUSTOM_CONTACTS_SYS_REQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ifReq" type="{http://tsm.sp.com}IfReq" minOccurs="0"/>
 *         &lt;element name="INFO_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Params" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUSTOM_CONTACTS_SYS_REQ", propOrder = {
    "ifReq",
    "infotype",
    "params"
})
public class CUSTOMCONTACTSSYSREQ {

    protected IfReq ifReq;
    @XmlElement(name = "INFO_TYPE")
    protected String infotype;
    @XmlElement(name = "Params")
    protected String params;

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
     * 获取infotype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFOTYPE() {
        return infotype;
    }

    /**
     * 设置infotype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFOTYPE(String value) {
        this.infotype = value;
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
