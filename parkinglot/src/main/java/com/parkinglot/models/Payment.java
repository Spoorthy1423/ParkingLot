package com.parkinglot.models;
import java.util.Date;

public class Payment extends BaseModel {
    private PaymentStatus paymentMode;
    private int amount;
    private Date time;
    private PaymentStatus paymentStatus;
    private String referenceNumber;

    public PaymentStatus getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentStatus paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
}