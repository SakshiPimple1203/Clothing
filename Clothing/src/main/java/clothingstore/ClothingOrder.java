package clothingstore;

import java.math.BigDecimal;
import java.sql.Date;

public class ClothingOrder {

    private String item;
    private String customerName;
    private String phoneNumber;
    private BigDecimal shoulder;
    private BigDecimal chest;
    private BigDecimal bust;
    private BigDecimal waist;
    private BigDecimal hipRound;
    private BigDecimal armRound;
    private BigDecimal sleeves;
    private BigDecimal penaltyCrease;
    private BigDecimal length;
    private BigDecimal backNeck;
    private BigDecimal frontNeck;
    private String note;
    private Date deliveryDate;

    public ClothingOrder() {
        // No-argument constructor
    }

    public ClothingOrder(String item, String customerName, String phoneNumber, BigDecimal shoulder, BigDecimal chest, 
                         BigDecimal bust, BigDecimal waist, BigDecimal hipRound, BigDecimal armRound, BigDecimal sleeves, 
                         BigDecimal penaltyCrease, BigDecimal length, BigDecimal backNeck, BigDecimal frontNeck, 
                         String note, Date deliveryDate) {
        this.item = item;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.shoulder = shoulder;
        this.chest = chest;
        this.bust = bust;
        this.waist = waist;
        this.hipRound = hipRound;
        this.armRound = armRound;
        this.sleeves = sleeves;
        this.penaltyCrease = penaltyCrease;
        this.length = length;
        this.backNeck = backNeck;
        this.frontNeck = frontNeck;
        this.note = note;
        this.deliveryDate = deliveryDate;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getShoulder() {
        return shoulder;
    }

    public void setShoulder(BigDecimal shoulder) {
        this.shoulder = shoulder;
    }

    public BigDecimal getChest() {
        return chest;
    }

    public void setChest(BigDecimal chest) {
        this.chest = chest;
    }

    public BigDecimal getBust() {
        return bust;
    }

    public void setBust(BigDecimal bust) {
        this.bust = bust;
    }

    public BigDecimal getWaist() {
        return waist;
    }

    public void setWaist(BigDecimal waist) {
        this.waist = waist;
    }

    public BigDecimal getHipRound() {
        return hipRound;
    }

    public void setHipRound(BigDecimal hipRound) {
        this.hipRound = hipRound;
    }

    public BigDecimal getArmRound() {
        return armRound;
    }

    public void setArmRound(BigDecimal armRound) {
        this.armRound = armRound;
    }

    public BigDecimal getSleeves() {
        return sleeves;
    }

    public void setSleeves(BigDecimal sleeves) {
        this.sleeves = sleeves;
    }

    public BigDecimal getPenaltyCrease() {
        return penaltyCrease;
    }

    public void setPenaltyCrease(BigDecimal penaltyCrease) {
        this.penaltyCrease = penaltyCrease;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getBackNeck() {
        return backNeck;
    }

    public void setBackNeck(BigDecimal backNeck) {
        this.backNeck = backNeck;
    }

    public BigDecimal getFrontNeck() {
        return frontNeck;
    }

    public void setFrontNeck(BigDecimal frontNeck) {
        this.frontNeck = frontNeck;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
