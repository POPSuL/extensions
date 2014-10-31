package org.develnext.jphp.ext.jsoup.classes;

import org.develnext.jphp.ext.jsoup.JsoupExtension;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.support.ICloneableObject;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;

import java.util.Iterator;

import static php.runtime.annotation.Reflection.Name;
import static php.runtime.annotation.Reflection.WrapInterface;

@Name(JsoupExtension.NAMESPACE + "Elements")
@WrapInterface(value = Elements.class, skipConflicts = true)
public class WrapElements extends BaseWrapper<Elements> implements Iterable<Memory>, ICloneableObject<WrapElements> {
    public WrapElements(Environment env, Elements wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapElements(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public Iterator<Memory> iterator() {
        final Iterator<Element> iterator = getWrappedObject().iterator();
        return new Iterator<Memory>() {
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public Memory next() {
                return new ObjectMemory(new WrapElement(getEnvironment(), iterator.next()));
            }

            @Override
            public void remove() {
                iterator.remove();
            }
        };
    }

    @Override
    public WrapElements __clone(Environment env, TraceInfo trace) {
        return new WrapElements(env, __wrappedObject.clone());
    }
}
