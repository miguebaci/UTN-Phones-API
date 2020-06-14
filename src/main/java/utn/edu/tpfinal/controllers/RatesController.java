package utn.edu.tpfinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import utn.edu.tpfinal.models.Rate;
import utn.edu.tpfinal.services.RateService;

import java.util.List;
import java.util.Optional;

@Controller
public class RatesController {
    private final RateService rateService;

    @Autowired
    public RatesController(RateService rateService) {
        this.rateService = rateService;
    }

    // GET ONE RATE BY ID.
    public Optional<Rate> getUser(Integer idRate){
        return rateService.getOneRate(idRate);
    }

    // GET ALL RATES.
    public List<Rate> getRates(){
        return rateService.getAllRates();
    }

    // POST RATE.
    public void addRate(Rate newRate){
        rateService.addRate(newRate);
    }

    // DELETE ONE RATE BY ID.
    public void deleteRate(Integer idRate){
        rateService.deleteOneRate(idRate);
    }

    // UPDATE RATE.
    public void updateRate(Rate rate, Integer idRate){
        rateService.updateOneRate(rate, idRate);
    }
}
