package pro.sky.skypro_internet_store.Model;

import java.util.Objects;

public class Item {
    public final Integer itemId;

    public Item(Integer itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(itemId, item.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemId);
    }

    @Override
    public String toString() {
        return "Item {" +
                "itemId = " + itemId +
                '}';
    }
}
