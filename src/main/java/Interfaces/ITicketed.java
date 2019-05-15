package Interfaces;

import ThemeParkStuff.Visitor;

public interface ITicketed {

    double defaultPrice();
    double priceForVisitor(Visitor visitor);
}
