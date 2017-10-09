
package bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


//============POJO Class==============//


public class Hotel {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("hotelName")
    @Expose
    private String hotelName;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("ratings")
    @Expose
    private String ratings;
    @SerializedName("landmark")
    @Expose
    private String landmark;
    @SerializedName("startedOn")
    @Expose
    private String startedOn;
    @SerializedName("famousDish")
    @Expose
    private String famousDish;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(String startedOn) {
        this.startedOn = startedOn;
    }

    public String getFamousDish() {
        return famousDish;
    }

    public void setFamousDish(String famousDish) {
        this.famousDish = famousDish;
    }

}
