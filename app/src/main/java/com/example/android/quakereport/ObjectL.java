package com.example.android.quakereport;

//An {@link ObjectL} object contains information related to a single earthquake.
public class ObjectL {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    //Constructs a new {@link ObjectL} object.
    public ObjectL(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    //Returns the magnitude of the earthquake.
    public double getMagnitude() {
        return mMagnitude;
    }

    //Returns the location of the earthquake.
    public String getLocation() {
        return mLocation;
    }

    //Returns the time of the earthquake
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    //Returns the website URL to find more information about the earthquake.
    public String getUrl() {
        return mUrl;
    }
}
