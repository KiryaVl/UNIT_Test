package HW2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    /*
     Домашнее задание к семинару №2 JUnit:
     1. Настроить новый проект:
         a). Нужно создать новый проект, со следующей структурой классов (3 отдельных класса):



         b). Настроить тестовую среду
             (создать тестовый класс VehicleTest, пометить папку как Test sources (зеленая папка),
             импортировать необходимые для тестов библиотеки (JUnit, assertJ - все что было на семинаре))
         c). Написать следующие тесты:
             - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
             - проверка того, объект Car создается с 4-мя колесами
             - проверка того, объект Motorcycle создается с 2-мя колесами
             - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
             - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
             - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
             - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    */

    static class MotorcycleTest {

        @Test
        void testInstanceOfVehicle() {
            Motorcycle motorcycle = new Motorcycle("Yamaha", "FZ-07", 2022);
            assertTrue(motorcycle instanceof Vehicle);
        }

        @Test
        void testMotorcycleHasTwoWheels() {
            Motorcycle motorcycle = new Motorcycle("Suzuki", "GSX-R750", 2023);
            assertEquals(2, motorcycle.getNumWheels());
        }

        @Test
        void testMotorcycleTestDriveSpeed() {
            Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja 300", 2020);
            motorcycle.testDrive();
            assertEquals(75, motorcycle.getSpeed());
        }

        @Test
        void testMotorcyclePark() {
            Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
            motorcycle.testDrive();
            motorcycle.park();
            assertEquals(0, motorcycle.getSpeed());
        }
    }
}