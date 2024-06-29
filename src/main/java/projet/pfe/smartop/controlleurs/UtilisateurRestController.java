package projet.pfe.smartop.controlleurs;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import projet.pfe.smartop.dtos.UtilisateurDTO;
import projet.pfe.smartop.services.IUtilisateurservice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("SmartOP/")
@Slf4j
@RequiredArgsConstructor
public class UtilisateurRestController {

    private final IUtilisateurservice iUtilisateurservice;

    @PostMapping("nouveauUser")
    void creerNouveauuser(@RequestBody UtilisateurDTO utilisateurDto){

        UtilisateurDTO utilisateur = iUtilisateurservice.adduser(utilisateurDto);
    }
    @GetMapping("listUsers")
    public  List<UtilisateurDTO> getListusers() {
        log.info("Liste users ");
        return new ArrayList<>(this.iUtilisateurservice.getusers());

    }
    @PutMapping("updateUser")
    void updateuser(@RequestBody UtilisateurDTO utilisateurDTO, @RequestParam Integer id){
        UtilisateurDTO utilisateur = iUtilisateurservice.updateuser(id,utilisateurDTO);
    }


}
