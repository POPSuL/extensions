package org.develnext.jphp.ext.jsoup.classes;

import org.develnext.jphp.ext.jsoup.JsoupExtension;
import org.jsoup.Connection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import static php.runtime.annotation.Reflection.Name;
import static php.runtime.annotation.Reflection.WrapInterface;

@Name(JsoupExtension.NAMESPACE + "ConnectionResponse")
@WrapInterface(value = Connection.Response.class, skipConflicts = true)
public class WrapConnectionResponse extends BaseWrapper<Connection.Response> {
    public WrapConnectionResponse(Environment env, Connection.Response object) {
        super(env, object);
    }

    public WrapConnectionResponse(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
