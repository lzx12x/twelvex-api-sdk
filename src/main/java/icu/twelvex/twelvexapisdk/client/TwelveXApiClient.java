package icu.twelvex.twelvexapisdk.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: TwelveX
 * @Version: 1.0
 * @Description: twelvex api客户端
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TwelveXApiClient {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

}
