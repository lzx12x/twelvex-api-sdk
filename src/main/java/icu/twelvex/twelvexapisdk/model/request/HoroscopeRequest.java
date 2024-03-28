package icu.twelvex.twelvexapisdk.model.request;

import icu.twelvex.twelvexapisdk.model.enums.RequestMethodEnum;
import icu.twelvex.twelvexapisdk.model.params.HoroscopeParams;
import icu.twelvex.twelvexapisdk.model.response.NameResponse;
import icu.twelvex.twelvexapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: TwelveX
 * @Version: 1.0
 * @Description: 随机情话
 */
@Accessors(chain = true)
public class HoroscopeRequest extends BaseRequest<HoroscopeParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/horoscope";
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
