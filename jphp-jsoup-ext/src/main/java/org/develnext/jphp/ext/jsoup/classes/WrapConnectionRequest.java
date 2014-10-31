package org.develnext.jphp.ext.jsoup.classes;

import org.develnext.jphp.ext.jsoup.JsoupExtension;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import static org.jsoup.Connection.Request;
import static php.runtime.annotation.Reflection.Name;
import static php.runtime.annotation.Reflection.WrapInterface;

@Name(JsoupExtension.NAMESPACE + "ConnectionRequest")
@WrapInterface(value = Request.class, skipConflicts = true)
public class WrapConnectionRequest extends BaseWrapper<Request> {
    public WrapConnectionRequest(Environment env, Request object) {
        super(env, object);
    }

    public WrapConnectionRequest(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
