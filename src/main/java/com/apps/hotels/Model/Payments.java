package com.apps.hotels.Model;


import javax.persistence.*;

@Entity

@Table (name = "payments")
public class Payments {

    @Id
    @Column (name = "payment_id")
    private Long payment_id;
    @Column (name = "payment_customer_id")
    private Long payment_customer_id;
    @Column (name = "payment_date")
    private String payment_date;
    @Column (name = "payment_description")
    private String payment_description;

    // add foreign key ( service id and customer id)
    @ManyToOne
    @JoinColumn (name = "service_id")
    private Services service_id ;

    @ManyToOne
    @JoinColumn (name = "customer_id")
    private Customers customer_id ;


    public Payments() {

    }

    public Payments(Long payment_id, Long payment_customer_id, String payment_date, String payment_description, Services service_id, Customers customer_id) {
        this.payment_id = payment_id;
        this.payment_customer_id = payment_customer_id;
        this.payment_date = payment_date;
        this.payment_description = payment_description;
        this.service_id = service_id;
        this.customer_id = customer_id;
    }

    public Long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
    }

    public Long getPayment_customer_id() {
        return payment_customer_id;
    }

    public void setPayment_customer_id(Long payment_customer_id) {
        this.payment_customer_id = payment_customer_id;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public String getPayment_description() {
        return payment_description;
    }

    public void setPayment_description(String payment_description) {
        this.payment_description = payment_description;
    }

    public Services getService_id() {
        return service_id;
    }

    public void setService_id(Services service_id) {
        this.service_id = service_id;
    }

    public Customers getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Customers customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "payment_id=" + payment_id +
                ", payment_customer_id=" + payment_customer_id +
                ", payment_date='" + payment_date + '\'' +
                ", payment_description='" + payment_description + '\'' +
                ", service_id=" + service_id +
                ", customer_id=" + customer_id +
                '}';
    }
}
