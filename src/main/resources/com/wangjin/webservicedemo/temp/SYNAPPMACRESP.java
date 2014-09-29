
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SYN_APPMAC_RESP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SYN_APPMAC_RESP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYTYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KCV" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "SYN_APPMAC_RESP", propOrder = {
    "keytype",
    "key",
    "kcv",
    "ifResp"
})
public class SYNAPPMACRESP {

    @XmlElement(name = "KEYTYPE", required = true, type = Integer.class, nillable = true)
    protected Integer keytype;
    @XmlElement(name = "KEY", required = true, nillable = true)
    protected String key;
    @XmlElement(name = "KCV", required = true, nillable = true)
    protected String kcv;
    @XmlElement(required = true, nillable = true)
    protected IfResp ifResp;

    /**
     * 获取keytype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKEYTYPE() {
        return keytype;
    }

    /**
     * 设置keytype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKEYTYPE(Integer value) {
        this.keytype = value;
    }

    /**
     * 获取key属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEY() {
        return key;
    }

    /**
     * 设置key属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEY(String value) {
        this.key = value;
    }

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
