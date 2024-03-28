package icu.twelvex.twelvexapisdk.config;

import icu.twelvex.twelvexapisdk.client.TwelveXApiClient;
import icu.twelvex.twelvexapisdk.service.ApiService;
import icu.twelvex.twelvexapisdk.service.impi.ApiServiceImpl;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: TwelveX
 * @Version: 1.0
 * @Description:
 */
@Data
@Configuration
@ConfigurationProperties("twelvex.api.client")
@ComponentScan
public class TwelveXApiClientConfig {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 秘密密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private String host;

    @Bean
    public TwelveXApiClient twelvexApiClient() {
        return new TwelveXApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setTwelvexApiClient(new TwelveXApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }
}
