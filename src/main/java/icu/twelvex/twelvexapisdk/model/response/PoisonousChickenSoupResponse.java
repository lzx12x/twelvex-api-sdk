package icu.twelvex.twelvexapisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: TwelveX
 * @Version: 1.0
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PoisonousChickenSoupResponse extends ResultResponse {
    private static final long serialVersionUID = -6467312483425078539L;
    private String text;
}
