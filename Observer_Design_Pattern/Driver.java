public class Driver {

    private static void delay(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
       
        WeatherStation weatherStation = new WeatherStation();

        CurWeatherDispaly curWeatherDispaly = new CurWeatherDispaly(weatherStation);

        AvgTempDisplay avgTempDisplay = new AvgTempDisplay(weatherStation);

        weatherStation.parametersChanged(20, 10);

        delay();

        weatherStation.parametersChanged(30,40);

        delay();

        weatherStation.parametersChanged(50,60);

    }
    
}