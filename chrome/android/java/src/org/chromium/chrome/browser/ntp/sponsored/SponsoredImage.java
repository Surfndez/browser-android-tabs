package org.chromium.chrome.browser.ntp.sponsored;

public class SponsoredImage extends NTPImage {

    private String imageUrl;
    private int focalPointX;
    private int focalPointY;

    public SponsoredImage(String imageUrl, int focalPointX, int focalPointY) {
        this.imageUrl = imageUrl;
        this.focalPointX = focalPointX;
        this.focalPointY = focalPointY;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getFocalPointX() {
        return focalPointX;
    }

    public int getFocalPointY() {
        return focalPointY;
    }
}