/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessServices;

import dataservices.DataService;
import dataservices.DataService_Service;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import dataservices.Customer;

/**
 *
 * @author Sadun
 */
@WebService(serviceName = "BusinessServices")
public class BusinessServices {

    DataService_Service service = new DataService_Service();
    DataService proxy = service.getDataServicePort();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "authenticate")
    public boolean authenticate(@WebParam(name = "username") String username,
            @WebParam(name = "password") String password) {
        Customer customer = proxy.authenticate(username);
        if (customer == null) {
            return false;
        } else {
            return customer.getCusPassword().equals(password);
        }
    }

    @WebMethod(operationName = "checkUsername")
    public boolean checkUsername(@WebParam(name = "username") String username) {
        Customer customer = proxy.checkUsername(username);
        return customer != null;
    }

    @WebMethod(operationName = "checkEmail")
    public boolean checkEmail(@WebParam(name = "email") String email) {
        Customer customer = proxy.checkEmail(email);
        if (customer == null) {
            return false;
        } else {
            return true;
        }
    }

    @WebMethod(operationName = "addCustomerToLogin")
    public boolean addCustomerToLogin(@WebParam(name = "email") String email, @WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        boolean isAdded = proxy.addCustomerToLogin(email, username, password);
        return isAdded;
    }

    @WebMethod(operationName = "searchCustomer")
    public boolean searchCustomer(@WebParam(name = "email") String email) {
        boolean isFound = proxy.searchCustomer(email);
        return isFound;
    }

    @WebMethod(operationName = "checkDocEmail")
    public boolean checkDocEmail(@WebParam(name = "email") String email) {
        Customer customer = proxy.checkDocEmail(email);
        return customer != null;
    }

    @WebMethod(operationName = "addDocToLogin")
    public boolean addDocToLogin(@WebParam(name = "docName") String docName,
            @WebParam(name = "email") String email,
            @WebParam(name = "phone") String phone) {
        boolean isAdded = proxy.addDocToLogin(docName, email, phone);
        return isAdded;
    }

    @WebMethod(operationName = "checkDocUsername")
    public boolean checkDocUsername(@WebParam(name = "docName") String docName) {
        Customer customer = proxy.checkDocUsername(docName);
        return customer != null;
    }

    @WebMethod(operationName = "addAppointment")
    public boolean addAppointment(@WebParam(name = "User") String User,
            @WebParam(name = "Date") String Date, @WebParam(name = "Time") String Time, 
            @WebParam(name = "Doctor") String Doctor, 
            @WebParam(name = "Payment") Float Payment) {
        boolean rowInserted = proxy.addAppointment(User, Date, Time, Doctor, Payment);
        return rowInserted;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deletetheCustomer")
    public boolean deletetheCustomer(@WebParam(name = "username") String username) {
        boolean isDeleted = proxy.deletetheCustomer(username);
        return isDeleted;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updatetheCustomer")
    public Boolean updatetheCustomer(@WebParam(name = "address") String address, @WebParam(name = "nic") String nic, @WebParam(name = "email") String email, @WebParam(name = "phone") String phone, @WebParam(name = "gender") String gender, @WebParam(name = "dob") String dob, @WebParam(name = "bloodType") String bloodType, @WebParam(name = "joinedDate") String joinedDate, @WebParam(name = "emerContact") String emerContact, @WebParam(name = "username") String username) {
        boolean isUpdated = proxy.updatetheCustomer(address, username, nic, email,phone,gender,dob,bloodType,joinedDate,emerContact);
        return isUpdated;
    }
        @WebMethod(operationName = "deleteDoctor")
    public boolean deleteDoctor(@WebParam(name = "email") String email) {
        boolean isDeleted = proxy.deleteDoctor(email);
        return isDeleted;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updatetheDoctor")
    public Boolean updatetheDoctor(@WebParam(name = "email") String email, @WebParam(name = "docName") String docName, @WebParam(name = "phone") String phone) {
        boolean isUpdated = proxy.updatetheDoctor(email, docName, phone);
        return isUpdated;
    }
    @WebMethod(operationName = "deleteAppointment")
    public boolean deleteAppointment(@WebParam(name = "username") String username) {
        boolean isDeleted = proxy.deleteAppointment(username);
        return isDeleted;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updatetheAppointment")
    public Boolean updatetheAppointment(@WebParam(name = "username") String username, @WebParam(name = "Time") String Time, @WebParam(name = "Payment") String Payment) {
        boolean isUpdated = proxy.updatetheAppointment(username, Time, Payment);
        return isUpdated;
    }
    
}
