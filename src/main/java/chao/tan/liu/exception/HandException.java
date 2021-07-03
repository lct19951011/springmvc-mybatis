package chao.tan.liu.exception;

import com.sun.istack.internal.localization.Localizable;
import com.sun.xml.internal.ws.handler.HandlerException;

/**
 * <p></p>
 *
 * @author chaotan.liu
 * @version 1.0
 * @date 2020/8/10 14:47
 */

public class HandException extends HandlerException {
    public HandException(String key, Object... args) {
        super(key, args);
    }

    public HandException(Throwable throwable) {
        super(throwable);
    }

    public HandException(Localizable arg) {
        super(arg);
    }
}
