package main.java.ru.ifmo.backend_2021.markup;
import java.util.List;

public class Strikeout extends MarkDownElement {
    public Strikeout(List<TextElemet> elements) {
        super(elements);
        this.SYMBOL = "~";
    }
}
