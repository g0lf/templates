package ru.my.patterns.structural.decorator;

/**
 *  структурный шаблон проектирования,
 *  предназначенный для динамического подключения
 *  дополнительного поведения к объекту.
 *  Шаблон Декоратор предоставляет гибкую альтернативу
 *  практике создания подклассов с целью расширения функциональности
 */
public class ApartmentsBuilder {

    public static void main(String[] args) {
        IApartments aprtmnt = new LivingRoom(new BedroomDecorator(new KitchenDecorator(new Apartment())));
    }
}
