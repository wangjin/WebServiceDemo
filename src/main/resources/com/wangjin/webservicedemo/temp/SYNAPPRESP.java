
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SYN_APP_RESP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SYN_APP_RESP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "SYN_APP_RESP", propOrder = {
    "ifResp"
})
public class SYNAPPRESP {

    @XmlElement(required = true, nillable = true)
    protected IfResp ifResp;

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
