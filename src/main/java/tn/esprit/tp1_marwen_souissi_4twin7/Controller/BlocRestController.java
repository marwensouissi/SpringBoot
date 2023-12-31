package tn.esprit.tp1_marwen_souissi_4twin7.Controller;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1_marwen_souissi_4twin7.Service.IBlocService;
import tn.esprit.tp1_marwen_souissi_4twin7.enteties.Bloc;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("Bloc")
@RestController
public class BlocRestController {
    private final IBlocService blocService;
    @GetMapping("Allblocs")
    public List<Bloc> getAllbloc(){return blocService.GetAllBlocs();}
    @PostMapping("addblocs")
public Bloc Addbloc(@RequestBody Bloc b){return blocService.AjouterBloc(b);}
    @DeleteMapping("deletebloc/{id}")
    public void Deletefoyer(@PathVariable long id){
        System.out.println("tfaskh");
        blocService.SupprimerBloc(id);}

    @PutMapping("Updatebloc/{id}")
    public Bloc MOdifierBlocs(@RequestBody Bloc b)
        {
            return blocService.UpdateBloc(b);
        }
















}
