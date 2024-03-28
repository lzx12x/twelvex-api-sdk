package icu.twelvex.twelvexapisdk.model.request;

import icu.twelvex.twelvexapisdk.model.enums.RequestMethodEnum;
import icu.twelvex.twelvexapisdk.model.params.RandomWallpaperParams;
import icu.twelvex.twelvexapisdk.model.response.RandomWallpaperResponse;
import icu.twelvex.twelvexapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: TwelveX
 * @Version: 1.0
 * @Description:
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomWallpaperResponse> getResponseClass() {
        return RandomWallpaperResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
