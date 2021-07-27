
package com.jiangda.cust.integration.transport.gener.jdintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>execute complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="execute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestContent" type="{http://ws.integration.framework.jiangda.com/}inputParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "execute", propOrder = {
    "requestContent"
})
public class Execute {

    protected InputParameter requestContent;

    /**
     * 获取requestContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InputParameter }
     *     
     */
    public InputParameter getRequestContent() {
        return requestContent;
    }

    /**
     * 设置requestContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InputParameter }
     *     
     */
    public void setRequestContent(InputParameter value) {
        this.requestContent = value;
    }

}
