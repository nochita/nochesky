package com.nochitsoft.nochesky.model;

import android.content.Context;

import com.nochitsoft.nochesky.R;

import java.util.StringTokenizer;

/**
 * Created by nochita on 2016-05-6.
 */
public class ObservableObject {

    private String catalog;

    private String otherCatalog;

    private String constellation;

    private String type;

    private TimeFormat rightAscension;

    private TimeFormat declination;

    private double magnitude;

    private String size;

    private String distance;

    private String notes;

    public ObservableObject(String stringData) {

        StringTokenizer tokenizer = new StringTokenizer(stringData, "|");

        this.setCatalog(tokenizer.nextToken());
        this.setOtherCatalog(tokenizer.nextToken());

        this.setType(tokenizer.nextToken());
        this.setConstellation(tokenizer.nextToken());

        this.setMagnitude(tokenizer.nextToken());

        int arHour = Integer.parseInt(tokenizer.nextToken());
        int arMinute = Integer.parseInt(tokenizer.nextToken());
        int arSecond = Integer.parseInt(tokenizer.nextToken());
        TimeFormat ar = new TimeFormat(arHour, arMinute, arSecond, 360);
        this.setRightAscension(ar);

        boolean isPositive = tokenizer.nextToken().equals("+");

        int decHour = Integer.parseInt(tokenizer.nextToken());
        int decMinute = Integer.parseInt(tokenizer.nextToken());
        int decSecond = Integer.parseInt(tokenizer.nextToken());

        TimeFormat dec = new TimeFormat(decHour, decMinute, decSecond, 90, isPositive);
        this.setDeclination(dec);

        this.setSize(tokenizer.nextToken());
        this.setDistance(tokenizer.nextToken());
        if(tokenizer.hasMoreTokens()){
            this.setNotes(tokenizer.nextToken());
        }

    }

    public TimeFormat getRightAscension() {
        return rightAscension;
    }

    public void setRightAscension(TimeFormat rightAscension) {
        this.rightAscension = rightAscension;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public TimeFormat getDeclination() {
        return declination;
    }

    public void setDeclination(TimeFormat declination) {
        this.declination = declination;
    }

    public String getDetailLabel(Context context) {
        return context.getResources().getString(R.string.observable_object_detail_message, constellation,
                type, otherCatalog, rightAscension, declination, magnitude, size, distance);
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = Double.parseDouble(magnitude);
    }

    public void setMagnitude(double mg) {
        this.magnitude = mg;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getOtherCatalog() {
        return otherCatalog;
    }

    public void setOtherCatalog(String otherCatalog) {
        this.otherCatalog = otherCatalog;
    }

}
