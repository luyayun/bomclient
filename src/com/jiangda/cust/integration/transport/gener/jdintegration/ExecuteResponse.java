
package com.jiangda.cust.integration.transport.gener.jdintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>executeResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="executeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseContent" type="{http://ws.integration.framework.jiangda.com/}outputParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeResponse", propOrder = {
    "responseContent"
})
public class ExecuteResponse {

    protected OutputParameter responseContent;

    /**
     * 获取responseContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OutputParameter }
     *     
     */
    public OutputParameter getResponseContent() {
        return responseContent;
    }

    /**
     * 设置responseContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OutputParameter }
     *     
     */
    public void setResponseContent(OutputParameter value) {
        this.responseContent = value;
    }

}
