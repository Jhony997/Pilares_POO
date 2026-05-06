package Nivel0.JavaCore.POO.Dominio;

import java.util.List;

public class Produto {
    private List<String> name;
    private List<Integer> price;

    public Produto(List<String> name, List<Integer> price) {
        this.name = name;
        this.price = price;
    }

    public List<String> getName() {
        return name;
    }

    public List<Integer> getPrice() {
        return price;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public void setPrice(List<Integer> price) {
        this.price = price;
    }
}
