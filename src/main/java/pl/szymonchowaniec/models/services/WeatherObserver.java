package pl.szymonchowaniec.models.services;

public interface WeatherObserver {
    void onWeatherUpdate(WeatherData data);
}
