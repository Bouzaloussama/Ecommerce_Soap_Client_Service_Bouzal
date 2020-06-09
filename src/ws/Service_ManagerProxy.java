package ws;

public class Service_ManagerProxy implements ws.Service_Manager {
  private String _endpoint = null;
  private ws.Service_Manager service_Manager = null;
  
  public Service_ManagerProxy() {
    _initService_ManagerProxy();
  }
  
  public Service_ManagerProxy(String endpoint) {
    _endpoint = endpoint;
    _initService_ManagerProxy();
  }
  
  private void _initService_ManagerProxy() {
    try {
      service_Manager = (new ws.CManagerServiceLocator()).getService_ManagerPort();
      if (service_Manager != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service_Manager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service_Manager)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service_Manager != null)
      ((javax.xml.rpc.Stub)service_Manager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.Service_Manager getService_Manager() {
    if (service_Manager == null)
      _initService_ManagerProxy();
    return service_Manager;
  }
  
  public ws.Book[] allBook(java.lang.String requette) throws java.rmi.RemoteException{
    if (service_Manager == null)
      _initService_ManagerProxy();
    return service_Manager.allBook(requette);
  }
  
  public void addBook(java.lang.String fileName, java.lang.String bookName, java.lang.String prix, int arg3) throws java.rmi.RemoteException{
    if (service_Manager == null)
      _initService_ManagerProxy();
    service_Manager.addBook(fileName, bookName, prix, arg3);
  }
  
  public ws.Compte authentificate(java.lang.String log, java.lang.String pass) throws java.rmi.RemoteException{
    if (service_Manager == null)
      _initService_ManagerProxy();
    return service_Manager.authentificate(log, pass);
  }
  
  public void addBookToPanier(java.lang.String bookName, java.lang.String auteurName, int prix) throws java.rmi.RemoteException{
    if (service_Manager == null)
      _initService_ManagerProxy();
    service_Manager.addBookToPanier(bookName, auteurName, prix);
  }
  
  public ws.Book findBook(java.lang.String nameBook) throws java.rmi.RemoteException{
    if (service_Manager == null)
      _initService_ManagerProxy();
    return service_Manager.findBook(nameBook);
  }
  
  public void register(java.lang.String name, java.lang.String last_name, java.lang.String tell, java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (service_Manager == null)
      _initService_ManagerProxy();
    service_Manager.register(name, last_name, tell, email, password);
  }
  
  public java.lang.String findType(java.lang.String log, java.lang.String pass) throws java.rmi.RemoteException{
    if (service_Manager == null)
      _initService_ManagerProxy();
    return service_Manager.findType(log, pass);
  }
  
  public void deletBookPanier(int id) throws java.rmi.RemoteException{
    if (service_Manager == null)
      _initService_ManagerProxy();
    service_Manager.deletBookPanier(id);
  }
  
  public ws.Book findBookById(int id) throws java.rmi.RemoteException{
    if (service_Manager == null)
      _initService_ManagerProxy();
    return service_Manager.findBookById(id);
  }
  
  public int totalPrixe() throws java.rmi.RemoteException{
    if (service_Manager == null)
      _initService_ManagerProxy();
    return service_Manager.totalPrixe();
  }
  
  
}