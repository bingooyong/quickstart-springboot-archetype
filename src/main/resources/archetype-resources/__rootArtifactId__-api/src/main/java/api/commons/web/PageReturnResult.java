package ${package}.api.commons.web;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LvYong
 * @create 2017-12-07
 **/
@Data
public class PageReturnResult<T> extends ReturnResult<T> implements Serializable {

    private Meta meta;

    public PageReturnResult(int status) {
        super(status);
    }

    public PageReturnResult(int status, String message) {
        super(status, message);
    }

    public PageReturnResult(int status, String message, T data) {
        super(status, message, data);
    }

    public PageReturnResult(int status, String message, T data, Meta meta) {
        super(status, message, data);
        this.meta = meta;
    }
}
