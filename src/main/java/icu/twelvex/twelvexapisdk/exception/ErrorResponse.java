package icu.twelvex.twelvexapisdk.exception;

import lombok.Data;

/**
 * @Author: TwelveX
 * @Version: 1.0
 * @Description:
 */
@Data
public class ErrorResponse {
    private String message;
    private int code;
}
