package icu.twelvex.twelvexapisdk.service.impi;

import icu.twelvex.twelvexapisdk.client.TwelveXApiClient;
import icu.twelvex.twelvexapisdk.exception.ApiException;
import icu.twelvex.twelvexapisdk.model.request.*;
import icu.twelvex.twelvexapisdk.model.response.LoveResponse;
import icu.twelvex.twelvexapisdk.model.response.PoisonousChickenSoupResponse;
import icu.twelvex.twelvexapisdk.model.response.RandomWallpaperResponse;
import icu.twelvex.twelvexapisdk.model.response.ResultResponse;
import icu.twelvex.twelvexapisdk.service.ApiService;
import icu.twelvex.twelvexapisdk.service.BaseService;
import lombok.extern.slf4j.Slf4j;


/**
 * @Author: TwelveX
 * @Version: 1.0
 * @Description:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(TwelveXApiClient twelvexApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(twelvexApiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(TwelveXApiClient twelvexApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(twelvexApiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(TwelveXApiClient twelvexApiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(twelvexApiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(TwelveXApiClient twelvexApiClient, HoroscopeRequest request) throws ApiException {
        return request(twelvexApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(TwelveXApiClient twelvexApiClient, IpInfoRequest request) throws ApiException {
        return request(twelvexApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(TwelveXApiClient twelvexApiClient, WeatherRequest request) throws ApiException {
        return request(twelvexApiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }
}
