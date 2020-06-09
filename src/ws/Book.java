/**
 * Book.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class Book  implements java.io.Serializable {
    private java.lang.String bookName;

    private java.lang.String auteurName;

    private int prix;

    private int id;

    public Book() {
    }

    public Book(
           java.lang.String bookName,
           java.lang.String auteurName,
           int prix,
           int id) {
           this.bookName = bookName;
           this.auteurName = auteurName;
           this.prix = prix;
           this.id = id;
    }


    /**
     * Gets the bookName value for this Book.
     * 
     * @return bookName
     */
    public java.lang.String getBookName() {
        return bookName;
    }


    /**
     * Sets the bookName value for this Book.
     * 
     * @param bookName
     */
    public void setBookName(java.lang.String bookName) {
        this.bookName = bookName;
    }


    /**
     * Gets the auteurName value for this Book.
     * 
     * @return auteurName
     */
    public java.lang.String getAuteurName() {
        return auteurName;
    }


    /**
     * Sets the auteurName value for this Book.
     * 
     * @param auteurName
     */
    public void setAuteurName(java.lang.String auteurName) {
        this.auteurName = auteurName;
    }


    /**
     * Gets the prix value for this Book.
     * 
     * @return prix
     */
    public int getPrix() {
        return prix;
    }


    /**
     * Sets the prix value for this Book.
     * 
     * @param prix
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }


    /**
     * Gets the id value for this Book.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Book.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookName==null && other.getBookName()==null) || 
             (this.bookName!=null &&
              this.bookName.equals(other.getBookName()))) &&
            ((this.auteurName==null && other.getAuteurName()==null) || 
             (this.auteurName!=null &&
              this.auteurName.equals(other.getAuteurName()))) &&
            this.prix == other.getPrix() &&
            this.id == other.getId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBookName() != null) {
            _hashCode += getBookName().hashCode();
        }
        if (getAuteurName() != null) {
            _hashCode += getAuteurName().hashCode();
        }
        _hashCode += getPrix();
        _hashCode += getId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Book.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws/", "book"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteurName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auteurName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
