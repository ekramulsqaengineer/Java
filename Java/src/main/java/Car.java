public class Car {
    // বৈশিষ্ট্য বা ফিল্ড
    String color;
    int speed;

    // মেথড যা গাড়ি চালু করে
    public void startEngine() {
        System.out.println("Engine started");
    }

    // মেথড যা গাড়ির গতি বাড়ায়
    public void accelerate(int increment) {
        speed += increment; // স্টেটমেন্ট: গতি বাড়ানো হচ্ছে
        System.out.println("New speed: " + speed);
    }

    public static void main(String[] args) {
        Car myCar = new Car(); // ক্লাস থেকে অবজেক্ট তৈরি
        myCar.color = "Red"; // স্টেটমেন্ট: ভেরিয়েবল মান নির্ধারণ
        myCar.startEngine(); // মেথড কল স্টেটমেন্ট
        myCar.accelerate(20); // মেথড কল স্টেটমেন্ট
    }
}
