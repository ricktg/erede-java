package br.com.userede.erede;

import com.google.gson.annotations.SerializedName;

public class PIXWebHook {

    @SerializedName("id")
    private String id;
    @SerializedName("companyNumber")
    private String companyNumber;
    @SerializedName("events")
    private String[] events;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String[] getEvents() {
        return events;
    }

    public void setEvents(String[] events) {
        this.events = events;
    }
}
