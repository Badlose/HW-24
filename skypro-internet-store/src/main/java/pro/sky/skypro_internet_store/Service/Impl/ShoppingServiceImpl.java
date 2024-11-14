package pro.sky.skypro_internet_store.Service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skypro_internet_store.Model.Item;
import pro.sky.skypro_internet_store.Service.ShoppingService;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ShoppingServiceImpl implements ShoppingService {
    public final List<Item> basket = new ArrayList<>();


    public String add(List<Integer> items) {
        items.stream()
                .map(Item::new)
                .forEach(basket::add);
        System.out.println("Товар с ID " + items + " добавлен в корзину");
        return items.toString();
    }

    @Override
    public String get() {
        return basket.toString();
    }
}
