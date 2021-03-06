/*
 * Copyright 2017 Apereo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.10 at 02:09:22 PM EST 
//


package com.tle.web.lti.imsx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The StatusInfo complexType is the container for the status code and associated information returned within the SOAP message as defined by the IMS GWSv1.0 specification.
 *             
 * 
 * <p>Java class for imsx_StatusInfo.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imsx_StatusInfo.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/services/ltiv1p1/xsd/imsoms_v1p0}imsx_codeMajor"/>
 *         &lt;element ref="{http://www.imsglobal.org/services/ltiv1p1/xsd/imsoms_v1p0}imsx_severity"/>
 *         &lt;element ref="{http://www.imsglobal.org/services/ltiv1p1/xsd/imsoms_v1p0}imsx_description" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/services/ltiv1p1/xsd/imsoms_v1p0}imsx_messageRefIdentifier"/>
 *         &lt;element ref="{http://www.imsglobal.org/services/ltiv1p1/xsd/imsoms_v1p0}imsx_operationRefIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/services/ltiv1p1/xsd/imsoms_v1p0}imsx_codeMinor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imsx_StatusInfo.Type", propOrder = {
    "imsxCodeMajor",
    "imsxSeverity",
    "imsxDescription",
    "imsxMessageRefIdentifier",
    "imsxOperationRefIdentifier",
    "imsxCodeMinor"
})
public class ImsxStatusInfoType {

    @XmlElement(name = "imsx_codeMajor", required = true)
    protected ImsxCodeMajorType imsxCodeMajor;
    @XmlElement(name = "imsx_severity", required = true)
    protected ImsxSeverityType imsxSeverity;
    @XmlElement(name = "imsx_description")
    protected String imsxDescription;
    @XmlElement(name = "imsx_messageRefIdentifier", required = true)
    protected String imsxMessageRefIdentifier;
    @XmlElement(name = "imsx_operationRefIdentifier")
    protected List<String> imsxOperationRefIdentifier;
    @XmlElement(name = "imsx_codeMinor")
    protected ImsxCodeMinorType imsxCodeMinor;

    /**
     * Gets the value of the imsxCodeMajor property.
     * 
     * @return
     *     possible object is
     *     {@link ImsxCodeMajorType }
     *     
     */
    public ImsxCodeMajorType getImsxCodeMajor() {
        return imsxCodeMajor;
    }

    /**
     * Sets the value of the imsxCodeMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImsxCodeMajorType }
     *     
     */
    public void setImsxCodeMajor(ImsxCodeMajorType value) {
        this.imsxCodeMajor = value;
    }

    /**
     * Gets the value of the imsxSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link ImsxSeverityType }
     *     
     */
    public ImsxSeverityType getImsxSeverity() {
        return imsxSeverity;
    }

    /**
     * Sets the value of the imsxSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImsxSeverityType }
     *     
     */
    public void setImsxSeverity(ImsxSeverityType value) {
        this.imsxSeverity = value;
    }

    /**
     * Gets the value of the imsxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsxDescription() {
        return imsxDescription;
    }

    /**
     * Sets the value of the imsxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsxDescription(String value) {
        this.imsxDescription = value;
    }

    /**
     * Gets the value of the imsxMessageRefIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsxMessageRefIdentifier() {
        return imsxMessageRefIdentifier;
    }

    /**
     * Sets the value of the imsxMessageRefIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsxMessageRefIdentifier(String value) {
        this.imsxMessageRefIdentifier = value;
    }

    /**
     * Gets the value of the imsxOperationRefIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imsxOperationRefIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImsxOperationRefIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImsxOperationRefIdentifier() {
        if (imsxOperationRefIdentifier == null) {
            imsxOperationRefIdentifier = new ArrayList<String>();
        }
        return this.imsxOperationRefIdentifier;
    }

    /**
     * Gets the value of the imsxCodeMinor property.
     * 
     * @return
     *     possible object is
     *     {@link ImsxCodeMinorType }
     *     
     */
    public ImsxCodeMinorType getImsxCodeMinor() {
        return imsxCodeMinor;
    }

    /**
     * Sets the value of the imsxCodeMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImsxCodeMinorType }
     *     
     */
    public void setImsxCodeMinor(ImsxCodeMinorType value) {
        this.imsxCodeMinor = value;
    }

}
