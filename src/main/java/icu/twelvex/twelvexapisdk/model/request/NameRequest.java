package icu.twelvex.twelvexapisdk.model.request;

import icu.twelvex.twelvexapisdk.model.enums.RequestMethodEnum;
import icu.twelvex.twelvexapisdk.model.params.NameParams;
import icu.twelvex.twelvexapisdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @Author: TwelveX
 * @Version: 1.0
 * @Description:
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
