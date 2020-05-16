package creational.abstractfactory.factories;

import creational.abstractfactory.products.Chip;
import creational.abstractfactory.products.Screen;

public interface SmartPhoneComponentCreator {
    Chip createChip();
    Screen createScreen();
}
