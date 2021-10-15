package pro.sky.java.course1.lesson3;

public class Homework3 {
    public static void main(String[] args) {

        //Задание 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        //Задание 2

        int clientDeviceYear = 2015;

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        //Задание 3

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");

        }

        //Задание 4

        int deliveryDistance = 95;
        int dayQuantity = 1;

        if (deliveryDistance < 20) {
            dayQuantity += 0;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            dayQuantity += 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            dayQuantity += 2;
        } else {
            dayQuantity += 3;
        }
        System.out.println("Потребуется дней: " + dayQuantity);


        //Задание 5

        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлжит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        //ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ
        // Задание 6

        int age = 19;
        int salary = 58_000;
        double limit;

        if (age >= 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }
        if (salary >= 50_000 && salary < 80) {
            limit *= 1.2;
        } else if (salary >= 80_000) {
            limit *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

        //Задание 7

        int age2 = 25;
        int salary2 = 60_000;
        int wantedSum = 330_000;
        float maxPayment = salary2 * 0.5f;
        int loanTerm = 12;
        float basicRate = 10;

        if (age2 < 23) {
            basicRate += 1;
        } else if (age2 >= 23 && age2 < 30) {
            basicRate += 0.5f;
        }
        if (salary2 > 80_000) {
            basicRate = basicRate-0.7f;
        }

        float loanSum = (wantedSum+(wantedSum*(basicRate/100)));
        float loanPaymentPerMonth = loanSum/loanTerm;

        if (maxPayment > loanPaymentPerMonth) {
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPayment + " рублей. Платеж по кредиту " + loanPaymentPerMonth + " рублей. Одобрено.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPayment + " рублей. Платеж по кредиту " + loanPaymentPerMonth + " рублей. Отказано.");
        }

    }


    }
