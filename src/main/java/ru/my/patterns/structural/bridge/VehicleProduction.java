package ru.my.patterns.structural.bridge;

/**
 *  структурный шаблон проектирования, используемый в
 *  проектировании программного обеспечения чтобы
 *  «разделять абстракцию и реализацию так, чтобы они могли изменяться независимо».
 *  Шаблон мост использует инкапсуляцию,
 *  агрегирование и может использовать наследование для того,
 *  чтобы разделить ответственность между классами.
 */
public class VehicleProduction {

    public static void main(String[] args) {
        Boeing boeing = new Boeing(new BoeingLayout());
        Il86 il86 = new Il86(new Il86Layout());
        Bus bus = new Bus(new BusLayout());
        Bus exclusiveBus = new Bus(new ExclusiveBusLayout());

        boeing.build();
        boeing.release();

        bus.build();
        bus.release();

        exclusiveBus.build();
        exclusiveBus.release();
    }

}
