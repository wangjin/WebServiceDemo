
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MW_TRANS_RESP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MW_TRANS_RESP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ifResp" type="{http://tsm.sp.com}IfResp"/>
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
@XmlType(name = "MW_TRANS_RESP", propOrder = {
    "ifResp",
    "params"
})
public class MWTRANSRESP {

    @XmlElement(required = true, nillable = true)
    protected IfResp ifResp;
    @XmlElement(name = "Params", required = true, nillable = true)
    protected String params;

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
