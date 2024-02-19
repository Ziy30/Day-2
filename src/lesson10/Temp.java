package lesson10;

public class Temp {
    private int id;
    
    private double temperature;
    private String input_scale;
    private double celsius, fahrenheit,
            kelvin, rankine, reumur;

    public Temp(int id, double temperature, String input_scale, double celsius,
            double fahrenheit, double kelvin, double rankine, double reumur) {
       
        this.id = id;
        this.temperature = temperature;
        this.input_scale = input_scale;
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
        this.rankine = rankine;
        this.reumur = reumur;

    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getInput_scale() {
        return input_scale;
    }

    public void setInput_scale(String input_scale) {
        this.input_scale = input_scale;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getRankine() {
        return rankine;
    }

    public void setRankine(double rankine) {
        this.rankine = rankine;
    }

    public double getReumur() {
        return reumur;
    }

    public void setReumur(double reumur) {
        this.reumur = reumur;
    }

    


}
