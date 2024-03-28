package icu.twelvex.twelvexapisdk.model.request;

import icu.twelvex.twelvexapisdk.model.enums.RequestMethodEnum;
import icu.twelvex.twelvexapisdk.model.params.WeatherParams;
import icu.twelvex.twelvexapisdk.model.response.NameResponse;
import icu.twelvex.twelvexapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: TwelveX
 * @Version: 1.0
 * @Description: 获取天气请求
 */
@Accessors(chain = true)
public class WeatherRequest extends BaseRequest<WeatherParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/weather";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
