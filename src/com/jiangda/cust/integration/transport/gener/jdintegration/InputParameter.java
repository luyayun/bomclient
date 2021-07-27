
package com.jiangda.cust.integration.transport.gener.jdintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>inputParameter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="inputParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bizSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputParameter", propOrder = {
    "bizSerialNum",
    "content"
})
public class InputParameter {

    protected String bizSerialNum;
    protected String content;

    /**
     * 获取bizSerialNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizSerialNum() {
        return bizSerialNum;
    }

    /**
     * 设置bizSerialNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizSerialNum(String value) {
        this.bizSerialNum = value;
    }

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

}
