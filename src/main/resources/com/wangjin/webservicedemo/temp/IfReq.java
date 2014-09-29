
package com.wangjin.webservicedemo.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IfReq complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IfReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sequence_Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfReq", propOrder = {
    "mac",
    "spid",
    "sequenceId",
    "version"
})
public class IfReq {

    @XmlElement(name = "MAC", required = true, nillable = true)
    protected String mac;
    @XmlElement(name = "SPID", required = true, nillable = true)
    protected String spid;
    @XmlElement(name = "Sequence_Id", required = true, nillable = true)
    protected String sequenceId;
    @XmlElement(name = "Version", required = true, nillable = true)
    protected String version;

    /**
     * 获取mac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * 设置mac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAC(String value) {
        this.mac = value;
    }

    /**
     * 获取spid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPID() {
        return spid;
    }

    /**
     * 设置spid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPID(String value) {
        this.spid = value;
    }

    /**
     * 获取sequenceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * 设置sequenceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceId(String value) {
        this.sequenceId = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
