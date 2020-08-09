package com.nordic.springit.controller;

import com.nordic.springit.domain.Link;
import com.nordic.springit.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/links")
public class LinkController {

    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository){
        this.linkRepository=linkRepository;
    }

    @GetMapping("/")
    public List<Link> list(){
       return linkRepository.findAll();
    }
    //crud
    @PostMapping("/create")
    public Link create(@ModelAttribute Link link){
        return linkRepository.save(link);
    }
    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id){
        return linkRepository.findById(id);
    }
    @PutMapping("/{id}")
    public Link update(@PathVariable Long id, @ModelAttribute Link link){
        return linkRepository.save(link);
    }
    /*@DeleteMapping("/{id}")
    public Link delete(@PathVariable Long id){
        return linkRepository.deleteById(id);
    }*/
}
