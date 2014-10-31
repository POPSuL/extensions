package org.develnext.jphp.ext.jsoup.classes;

import org.develnext.jphp.ext.jsoup.JsoupExtension;
import org.jsoup.Connection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import static php.runtime.annotation.Reflection.Name;
import static php.runtime.annotation.Reflection.WrapInterface;

@Name(JsoupExtension.NAMESPACE + "Connection")
@WrapInterface(value = Connection.class, skipConflicts = true)
public class WrapConnection extends BaseWrapper<Connection> {
    public static final String METHOD_POST = "POST";
    public static final String METHOD_GET  = "GET";

    public WrapConnection(Environment env, Connection object) {
        super(env, object);
    }

    public WrapConnection(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
