/**
 * Service_Manager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface Service_Manager extends java.rmi.Remote {
    public ws.Book[] allBook(java.lang.String requette) throws java.rmi.RemoteException;
    public void addBook(java.lang.String fileName, java.lang.String bookName, java.lang.String prix, int arg3) throws java.rmi.RemoteException;
    public ws.Compte authentificate(java.lang.String log, java.lang.String pass) throws java.rmi.RemoteException;
    public void addBookToPanier(java.lang.String bookName, java.lang.String auteurName, int prix) throws java.rmi.RemoteException;
    public ws.Book findBook(java.lang.String nameBook) throws java.rmi.RemoteException;
    public void register(java.lang.String name, java.lang.String last_name, java.lang.String tell, java.lang.String email, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String findType(java.lang.String log, java.lang.String pass) throws java.rmi.RemoteException;
    public void deletBookPanier(int id) throws java.rmi.RemoteException;
    public ws.Book findBookById(int id) throws java.rmi.RemoteException;
    public int totalPrixe() throws java.rmi.RemoteException;
}
