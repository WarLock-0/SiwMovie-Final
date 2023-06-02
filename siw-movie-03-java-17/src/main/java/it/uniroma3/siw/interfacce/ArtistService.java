package it.uniroma3.siw.interfacce;

import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import it.uniroma3.siw.model.Artist;

public interface ArtistService {

    public Artist newArtist(Artist artist, MultipartFile image, BindingResult bindingResult);

    public Artist findById(Long id);

    public Iterable<Artist> findAll();

    public Iterable<Artist> findByName(String name);

    public Artist update (Long id, Artist artist, MultipartFile image, BindingResult bindingResult);

    public void delete(Long id);
    
}
