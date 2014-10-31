package org.develnext.jphp.ext.jsoup.classes;

import org.develnext.jphp.ext.jsoup.JsoupExtension;
import org.jsoup.nodes.Document;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.lang.support.ICloneableObject;
import php.runtime.reflection.ClassEntity;

import static php.runtime.annotation.Reflection.Name;
import static php.runtime.annotation.Reflection.WrapInterface;

@Name(JsoupExtension.NAMESPACE + "Document")
@WrapInterface(value = Document.class, skipConflicts = true)
public class WrapDocument extends WrapElement implements ICloneableObject {
    public WrapDocument(Environment env, Document object) {
        super(env, object);
    }

    public WrapDocument(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public WrapDocument __clone(Environment environment, TraceInfo traceInfo) {
        return new WrapDocument(environment, ((Document)this.getWrappedObject()).clone());
    }

    @Override
    public Document getWrappedObject() {
        return (Document) super.getWrappedObject();
    }
}
