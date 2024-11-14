package pro.sky.skypro_internet_store.Service;

import pro.sky.skypro_internet_store.Model.Item;

import java.util.List;

public interface ShoppingService {
    String add(List<Integer> itemId);

    List<Item> get();
}
