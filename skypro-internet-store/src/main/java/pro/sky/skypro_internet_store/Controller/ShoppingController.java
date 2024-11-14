package pro.sky.skypro_internet_store.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skypro_internet_store.Model.Item;
import pro.sky.skypro_internet_store.Service.ShoppingService;

import java.util.List;

@RestController
public class ShoppingController {
    public final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @RequestMapping("/add")
    public String add(@RequestParam(value = "ID", required = false) List<Integer> itemId) {
        return shoppingService.add(itemId);
    }

    @RequestMapping("/get")
    public List<Item> get() {
        return shoppingService.get();
    }
}
