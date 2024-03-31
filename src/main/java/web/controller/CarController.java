package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Servise.CarServise;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServise carServise;

    public CarController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping
    public String cars(Model model) {
        model.addAttribute("cars", carServise.find());
        return "cars";
    }

    @GetMapping(params = "count")
    public String carsByQuantity(Model model, @RequestParam String count) {

        int carCount;
        try {
            carCount = Integer.parseInt(count);
            if (carCount >= 0) {
                model.addAttribute("cars", carServise.findByCount(carCount));
                return "cars";
            } else {
                model.addAttribute("errorMessage", "Please, check the request parameters");
                return "cars";
            }
        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "Please, check the request parameters");
            return "error";
        }

    }

}
