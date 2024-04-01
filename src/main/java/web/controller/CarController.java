package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.NoHandlerFoundException;
import web.Servise.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carServiсe;

    public CarController(CarService carServise) {
        this.carServiсe = carServise;
    }

    @GetMapping
    public String cars(Model model) {
        model.addAttribute("cars", carServiсe.find());
        return "cars";
    }

    @GetMapping(params = "count")
    public String carsByQuantity(Model model, @RequestParam int count) {

        model.addAttribute("cars",carServiсe.findByCount(model, count));
        return "cars";



//        int carCount;
//        try {
//            carCount = Integer.parseInt(count);
//            if (carCount >= 0) {
//                model.addAttribute("cars", carServise.findByCount(carCount));
//                return "cars";
//            } else {
//                model.addAttribute("errorMessage", "Please, check the request parameters");
//                return "cars";
//            }
//        } catch (NumberFormatException e) {
//            model.addAttribute("errorMessage", "Please, check the request parameters");
//            return "error";
//        }

    }



}
