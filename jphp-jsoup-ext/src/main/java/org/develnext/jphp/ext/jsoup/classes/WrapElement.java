package org.develnext.jphp.ext.jsoup.classes;

import org.develnext.jphp.ext.jsoup.JsoupExtension;
import org.jsoup.nodes.Element;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.support.ICloneableObject;
import php.runtime.reflection.ClassEntity;

import static php.runtime.annotation.Reflection.Name;
import static php.runtime.annotation.Reflection.WrapInterface;

@Name(JsoupExtension.NAMESPACE + "Element")
@WrapInterface(value = Element.class, skipConflicts = true)
public class WrapElement extends BaseWrapper<Element> implements ICloneableObject {
    public WrapElement(Environment env, Element object) {
        super(env, object);
    }

    public WrapElement(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public WrapElement __clone(Environment environment, TraceInfo traceInfo) {
        return new WrapElement(environment, __wrappedObject.clone());
    }
}
