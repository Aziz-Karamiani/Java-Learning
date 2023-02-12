package com.jabeh.video;

public class Video {
    private int id;
    private String title;
    private boolean status;
    private String videoUrl;
    private String posterUrl;

    public Video(int id, String title, boolean status, String videoUrl, String posterUrl) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.videoUrl = videoUrl;
        this.posterUrl = posterUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
}
