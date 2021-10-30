
package dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cusEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusNIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusDOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusBloodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusJoinDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusEmerContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "cusEmail",
    "cusUsername",
    "cusPassword",
    "cusNIC",
    "cusPhone",
    "cusDOB",
    "cusGender",
    "cusBloodType",
    "cusJoinDate",
    "cusEmerContact",
    "cusAddress"
})
public class Customer {

    protected String cusEmail;
    protected String cusUsername;
    protected String cusPassword;
    protected String cusNIC;
    protected String cusPhone;
    protected String cusDOB;
    protected String cusGender;
    protected String cusBloodType;
    protected String cusJoinDate;
    protected String cusEmerContact;
    protected String cusAddress;

    /**
     * Gets the value of the cusEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusEmail() {
        return cusEmail;
    }

    /**
     * Sets the value of the cusEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusEmail(String value) {
        this.cusEmail = value;
    }

    /**
     * Gets the value of the cusUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusUsername() {
        return cusUsername;
    }

    /**
     * Sets the value of the cusUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusUsername(String value) {
        this.cusUsername = value;
    }

    /**
     * Gets the value of the cusPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusPassword() {
        return cusPassword;
    }

    /**
     * Sets the value of the cusPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusPassword(String value) {
        this.cusPassword = value;
    }

    /**
     * Gets the value of the cusNIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusNIC() {
        return cusNIC;
    }

    /**
     * Sets the value of the cusNIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusNIC(String value) {
        this.cusNIC = value;
    }

    /**
     * Gets the value of the cusPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusPhone() {
        return cusPhone;
    }

    /**
     * Sets the value of the cusPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusPhone(String value) {
        this.cusPhone = value;
    }

    /**
     * Gets the value of the cusDOB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusDOB() {
        return cusDOB;
    }

    /**
     * Sets the value of the cusDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusDOB(String value) {
        this.cusDOB = value;
    }

    /**
     * Gets the value of the cusGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusGender() {
        return cusGender;
    }

    /**
     * Sets the value of the cusGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusGender(String value) {
        this.cusGender = value;
    }

    /**
     * Gets the value of the cusBloodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusBloodType() {
        return cusBloodType;
    }

    /**
     * Sets the value of the cusBloodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusBloodType(String value) {
        this.cusBloodType = value;
    }

    /**
     * Gets the value of the cusJoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusJoinDate() {
        return cusJoinDate;
    }

    /**
     * Sets the value of the cusJoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusJoinDate(String value) {
        this.cusJoinDate = value;
    }

    /**
     * Gets the value of the cusEmerContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusEmerContact() {
        return cusEmerContact;
    }

    /**
     * Sets the value of the cusEmerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusEmerContact(String value) {
        this.cusEmerContact = value;
    }

    /**
     * Gets the value of the cusAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusAddress() {
        return cusAddress;
    }

    /**
     * Sets the value of the cusAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusAddress(String value) {
        this.cusAddress = value;
    }

}
