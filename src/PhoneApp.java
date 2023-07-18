class PhoneApp {
    // 4-bu class içinde bir metot tanımlayın
    public static double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        double totalPrice = 0.0;

        for (SmartPhone phone : smartPhoneArray) {
            totalPrice += phone.getPrice();
        }

        return totalPrice;
    }

    // 5-main metot içinde tanımlanan telefonların toplam fiyatı
    public static void main(String[] args) {
        SmartPhone[] phones = new SmartPhone[5];

        // 3-bir tane PhoneApp adında class oluşturun ve burada 5 tane alt alta SmartPhone tanımlayın. Bunları Array içine alın.
        phones[0] = new SmartPhone(1, "iPhone 11", 25000, "1234567890", 128, 4, "12 MP");
        phones[1] = new SmartPhone(2, "iPhone 14 Pro Max", 67000, "9876543210", 128, 8, "64 MP");
        phones[2] = new SmartPhone(3, "Samsung Galaxy A14", 6800, "5555555555", 128, 6, "12.2 MP");
        phones[3] = new SmartPhone(4, "Samsung Galaxy S22", 19000, "1111111111", 256, 8, "48 MP");
        phones[4] = new SmartPhone(5, "Samsung Galaxy A32", 10000, "2222222222", 128, 8, "108 MP");

        double total = calculateTotalPrice(phones);
        System.out.printf("Telefonların Toplam Fiyatı: %.2f TL", total);
    }

}
