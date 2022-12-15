package com.nbrodkin.java_web_final_project;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TvShowService {

    private final TvShowRepository tvShowRepository;

    public TvShowService(TvShowRepository tvShowRepository){
        this.tvShowRepository = tvShowRepository;
    }

public List<TvShow> findShow() {
        return tvShowRepository.findAll();
}

public void createShow(TvShow tvShow) {
        tvShowRepository.save(tvShow);
}

public Optional<TvShow> findById(Integer id){
        return tvShowRepository.findById(id);
}

public void delete(Integer id){
        tvShowRepository.deleteById(id);
}
}
