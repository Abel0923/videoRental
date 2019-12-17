package com.apposit.training.abelw.service;

import com.apposit.training.abelw.data.VideoByTypeDto;
import com.apposit.training.abelw.data.VideoData;
import com.apposit.training.abelw.model.Video;
import com.apposit.training.abelw.model.VideoGenre;
import com.apposit.training.abelw.model.VideoType;
import com.apposit.training.abelw.repository.GenreRepository;
import com.apposit.training.abelw.repository.VideoCrud;
import com.apposit.training.abelw.repository.VideoRepository;
import com.apposit.training.abelw.repository.VideoTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VideoService {

    List<VideoByTypeDto> videos = new ArrayList<>();
    @Autowired
    VideoRepository videoRepository;

    @Autowired
    GenreRepository genreRepository;

    @Autowired
    VideoTypeRepository videoTypeRepository;

    @Autowired
    VideoCrud videoCrud;

    public void fetchData(){
        this.videos.clear();
        videos.addAll(videoRepository.fetchEmpDeptDataInnerJoin());
    }

    public void fetchDataByGenre(long id){
        this.videos.clear();
        videos.addAll(videoRepository.fetchEmpDeptDataInnerJoin());
        setVideos(videos.stream().filter(videoByTypeDto -> videoByTypeDto.getVideoGenre().id == id)
                .collect(Collectors.toList()));
    }

    public List<VideoByTypeDto> getVideos(){
        return this.videos;
    }

    public void setVideos(List<VideoByTypeDto> videos){
        this.videos = videos;
    }

    public List<VideoGenre> findAllGenre(){
        return genreRepository.findAll();
    }

    public List<VideoType> findAllVideoType(){
        return videoTypeRepository.findAll();
    }

    public List<VideoByTypeDto> findVideoById(int id){
        return videoRepository.fetchVideoId(id);
    }

    public void addVideos(VideoData videoData){
        videoCrud.save(videoData);
        fetchData();
    }

    public void saveType(VideoType videoType){
        videoTypeRepository.save(videoType);
    }
    public void saveGenre(VideoGenre videoGenre){
        genreRepository.save(videoGenre);
    }
    public void deleteVideo(Long id){
        videoRepository.deleteById(id);
        videos.removeIf(x -> x.getVideoId() == id);
    }
}
