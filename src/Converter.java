public class Converter {

    //Метод посчета дистанции по значению шагов
    public double convertStepsToDistance(int steps) {
        double oneStepInMeters = 0.75;  //Кол-во метров в 1 шаге
        return steps * oneStepInMeters / 100000;    //Значение в км
    }

    //Метод подсчета Ккал по значению шагов
    public double convertStepsToKkal(int steps) {
        int oneStepInKkal = 50;     //Кол-во Ккал в 1 шаге
        return steps * oneStepInKkal / 1000d;   //Значение Ккал
    }

}
