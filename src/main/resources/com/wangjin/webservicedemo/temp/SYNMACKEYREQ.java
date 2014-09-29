
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SYN_MACKEY_REQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SYN_MACKEY_REQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "SYN_MACKEY_REQ", propOrder = {
    "ifReq"
})
public class SYNMACKEYREQ {

    @XmlElement(required = true, nillable = true)
    protected IfReq ifReq;

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
