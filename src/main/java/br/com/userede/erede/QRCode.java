package br.com.userede.erede;

import com.google.gson.annotations.SerializedName;

public class QRCode {

    public QRCode(String dateTimeExpiration) {
        this.dateTimeExpiration = dateTimeExpiration;
    }

    public QRCode(String dateTimeExpiration, String qrCodeImage, String qrCodeData) {
        this.dateTimeExpiration = dateTimeExpiration;
        this.qrCodeImage = qrCodeImage;
        this.qrCodeData = qrCodeData;
    }

    @SerializedName("dateTimeExpiration")
    private String dateTimeExpiration;

    @SerializedName("qrCodeImage")
    private String qrCodeImage;

    @SerializedName("qrCodeData")
    private String qrCodeData;

    public String getDateTimeExpiration() {
        return dateTimeExpiration;
    }

    public void setDateTimeExpiration(String dateTimeExpiration) {
        this.dateTimeExpiration = dateTimeExpiration;
    }

    public String getQrCodeImage() {
        return qrCodeImage;
    }

    public void setQrCodeImage(String qrCodeImage) {
        this.qrCodeImage = qrCodeImage;
    }

    public String getQrCodeData() {
        return qrCodeData;
    }

    public void setQrCodeData(String qrCodeData) {
        this.qrCodeData = qrCodeData;
    }
}
