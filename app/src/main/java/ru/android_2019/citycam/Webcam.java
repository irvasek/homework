package ru.android_2019.citycam;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;

@Entity
class Webcam {
    @PrimaryKey
    @NonNull
    private String id;
    private String cityName;
    private String status;
    private String title;
    private String imageURL;
    @Embedded
    private Location location;
    private String views;
    @TypeConverters({BitmapConverter.class})
    private Bitmap bitmap;

    public Webcam(String id, String status, String title) {
        this.id = id;
        this.status = status;
        this.title = title;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public Location getLocation() {
        return location;
    }

    public String getViews() {
        return views;
    }
}
