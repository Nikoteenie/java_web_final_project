package com.nbrodkin.java_web_final_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shows")
public class TvShowController {


   private final TvShowService tvShowService;

    public TvShowController(TvShowService tvShowService){
        this.tvShowService = tvShowService;
    }

    @GetMapping("/all")
    public List<TvShow> getShows(){
        return tvShowService.findShow();
    }

    @GetMapping("/{id}")
    public Optional<TvShow> findItemById(@PathVariable Integer id ){
        return tvShowService.findById( id );
    }

    @PostMapping("/all")
    public void saveShow(@RequestBody TvShow tvShow){
        tvShowService.createShow(tvShow);

    }

    @PutMapping("/{id}")
    public void addShow(@RequestBody TvShow show, @PathVariable Integer id){
        TvShow tvShow = tvShowService.findById(id).get();
        tvShow.setName(show.getName());
        tvShow.setDescription(show.getDescription());
        tvShow.setUrl(show.getUrl());
        tvShowService.createShow(show);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        tvShowService.delete(id);
    }



}
