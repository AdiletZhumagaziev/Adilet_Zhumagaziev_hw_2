            class main {
            public static void main(String[] args) {
                ageAndTemperature(22, -6);
                ageAndTemperature(15, 1);
                ageAndTemperature(26, -4);
                ageAndTemperature(56, 32);
                ageAndTemperature(12, -12);
            }
            public static String ageAndTemperature(int age, double temperature) {

                if (age > 20 && age < 45) {
                    if (temperature > -20 && temperature < 30) {
                        System.out.println("Можно идти гулять");

                    }
                } else if (age <= 20) {
                    if (temperature > 0 && temperature < 28) {
                        System.out.println("Можно идти гулять");
                    }
                } else if (age >= 45) {
                    if (temperature > -10 && temperature < 25) {
                        System.out.println("Можно идти гулять");
                    } else {
                        System.out.println("Оставайтесь дома!");
                    }
                }
                return "Возраст человека =" + age + " Температура на улице = " + temperature;

            }
        }

