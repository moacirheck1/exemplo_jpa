package educar.rs.exemplo_jpa.service;

import educar.rs.exemplo_jpa.entitty.Time;
import educar.rs.exemplo_jpa.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService {
 @Autowired
    private TimeRepository timeRepository;
 public Time salvarTime(Time time ){
      return timeRepository.save(time);
 }
 public Time buscarTimeID(long id){
     return timeRepository.findById(id).get();
 }
public List<Time> listaTimes(){
     return timeRepository.findAll();
}
public void deletarTime(Long id){
     timeRepository.deleteById(id);
}
}
