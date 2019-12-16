package com.apposit.training.abelw.data;

import com.apposit.training.abelw.model.VideoGenre;
import com.apposit.training.abelw.model.VideoType;

public class VideoByTypeDto {

    private Long videoId;
    private String videoTitle;
    private VideoType videoType;
    private VideoGenre videoGenre;
    private String age;
    private String year;
    private Double price;
    private int onOfDays;

    public VideoByTypeDto(Long videoId,
                          String videoTitle,
                          VideoType videoType,
                          VideoGenre videoGenre,
                          String age,
                          String year,
                          Double price,
                          int onOfDays) {
        this.videoId = videoId;
        this.videoTitle = videoTitle;
        this.videoType = videoType;
        this.videoGenre = videoGenre;
        this.age = age;
        this.year = year;
        this.price = price;
        this.onOfDays = onOfDays;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public VideoType getVideoType() {
        return videoType;
    }

    public void setVideoType(VideoType videoType) {
        this.videoType = videoType;
    }

    public VideoGenre getVideoGenre() {
        return videoGenre;
    }

    public void setVideoGenre(VideoGenre videoGenre) {
        this.videoGenre = videoGenre;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getOnOfDays() {
        return onOfDays;
    }

    public void setOnOfDays(int onOfDays) {
        this.onOfDays = onOfDays;
    }
}
