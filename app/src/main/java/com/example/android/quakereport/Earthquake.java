package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of the earthquake
    private double mMagnitude;

    // Location of the earthquake
    private String mLocation;

    // Time of the earthquake
    private long mTimeInMilliseconds;

    // URL of the earthquake
    private String mUrl;


    // Constructs  a new Earthquake object
    // @param magnitude is the magnitude (size) of the earthquake
    // @param location is in the city location  of the earthquake
    // @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
    // earthquake happened
    // @param url is the website URL to find more details about the earthquake in question

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() { return mMagnitude; }

    /**
     * Returns the location of the earthquake.
     */
    public String getLocation() { return mLocation; }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }

    /**
     * Returns the website URL to find more details on the earthquake in question.
     */
    public String getUrl() { return mUrl; }

}
