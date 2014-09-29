
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>USER_AUC_RESP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="USER_AUC_RESP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ifResp" type="{http://tsm.sp.com}IfResp"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USER_AUC_RESP", propOrder = {
    "ifResp",
    "result"
})
public class USERAUCRESP {

    @XmlElement(required = true, nillable = true)
    protected IfResp ifResp;
    @XmlElement(name = "Result")
    protected int result;

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

}
