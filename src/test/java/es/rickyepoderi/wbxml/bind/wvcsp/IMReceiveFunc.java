//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.25 at 05:48:09 PM CEST 
//


package es.rickyepoderi.wbxml.bind.wvcsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setd",
    "getlm",
    "getm",
    "rejcm",
    "notif",
    "newm"
})
@XmlRootElement(name = "IMReceiveFunc")
public class IMReceiveFunc {

    @XmlElement(name = "SETD")
    protected SETD setd;
    @XmlElement(name = "GETLM")
    protected GETLM getlm;
    @XmlElement(name = "GETM")
    protected GETM getm;
    @XmlElement(name = "REJCM")
    protected REJCM rejcm;
    @XmlElement(name = "NOTIF")
    protected NOTIF notif;
    @XmlElement(name = "NEWM")
    protected NEWM newm;

    /**
     * Gets the value of the setd property.
     * 
     * @return
     *     possible object is
     *     {@link SETD }
     *     
     */
    public SETD getSETD() {
        return setd;
    }

    /**
     * Sets the value of the setd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SETD }
     *     
     */
    public void setSETD(SETD value) {
        this.setd = value;
    }

    /**
     * Gets the value of the getlm property.
     * 
     * @return
     *     possible object is
     *     {@link GETLM }
     *     
     */
    public GETLM getGETLM() {
        return getlm;
    }

    /**
     * Sets the value of the getlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GETLM }
     *     
     */
    public void setGETLM(GETLM value) {
        this.getlm = value;
    }

    /**
     * Gets the value of the getm property.
     * 
     * @return
     *     possible object is
     *     {@link GETM }
     *     
     */
    public GETM getGETM() {
        return getm;
    }

    /**
     * Sets the value of the getm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GETM }
     *     
     */
    public void setGETM(GETM value) {
        this.getm = value;
    }

    /**
     * Gets the value of the rejcm property.
     * 
     * @return
     *     possible object is
     *     {@link REJCM }
     *     
     */
    public REJCM getREJCM() {
        return rejcm;
    }

    /**
     * Sets the value of the rejcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link REJCM }
     *     
     */
    public void setREJCM(REJCM value) {
        this.rejcm = value;
    }

    /**
     * Gets the value of the notif property.
     * 
     * @return
     *     possible object is
     *     {@link NOTIF }
     *     
     */
    public NOTIF getNOTIF() {
        return notif;
    }

    /**
     * Sets the value of the notif property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTIF }
     *     
     */
    public void setNOTIF(NOTIF value) {
        this.notif = value;
    }

    /**
     * Gets the value of the newm property.
     * 
     * @return
     *     possible object is
     *     {@link NEWM }
     *     
     */
    public NEWM getNEWM() {
        return newm;
    }

    /**
     * Sets the value of the newm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEWM }
     *     
     */
    public void setNEWM(NEWM value) {
        this.newm = value;
    }

}