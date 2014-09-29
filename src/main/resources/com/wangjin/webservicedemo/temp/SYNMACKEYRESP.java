
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SYN_MACKEY_RESP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SYN_MACKEY_RESP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KCV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MACKEY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ifResp" type="{http://tsm.sp.com}IfResp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SYN_MACKEY_RESP", propOrder = {
    "kcv",
    "mackey",
    "ifResp"
})
public class SYNMACKEYRESP {

    @XmlElement(name = "KCV", required = true, nillable = true)
    protected String kcv;
    @XmlElement(name = "MACKEY", required = true, nillable = true)
    protected String mackey;
    @XmlElement(required = true, nillable = true)
    protected IfResp ifResp;

    /**
     * 获取kcv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCV() {
        return kcv;
    }

    /**
     * 设置kcv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCV(String value) {
        this.kcv = value;
    }

    /**
     * 获取mackey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACKEY() {
        return mackey;
    }

    /**
     * 设置mackey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACKEY(String value) {
        this.mackey = value;
    }

    /**
     * 获取ifResp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IfResp }
     *     
     */
    public IfResp getIfResp() {
        return ifResp;
    }

    /**
     * 设置ifResp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IfResp }
     *     
     */
    public void setIfResp(IfResp value) {
        this.ifResp = value;
    }

}
