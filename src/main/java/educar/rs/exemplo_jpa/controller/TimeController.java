package educar.rs.exemplo_jpa.controller;

import educar.rs.exemplo_jpa.entitty.Time;
import educar.rs.exemplo_jpa.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TimeController {
    @Autowired
    private TimeService timeService;

    @PostMapping("time")
    public Time salvarTime(@RequestBody Time time) {
        return timeService.salvarTime(time);
    }

    @GetMapping("/time/{id}")
    public Time buscarTimeId(@PathVariable Long id) {
         return timeService.buscarTimeID(id);
    }
    @GetMapping("/times")
    public List<Time> listaTimes(){
        return timeService.listaTimes();
    }
    @GetMapping("t/{id}")
    public void deletar(@PathVariable Long id){
        timeService.deletarTime(id);
    }


}
