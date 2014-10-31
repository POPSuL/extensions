package org.develnext.jphp.ext.jsoup;

import org.develnext.jphp.ext.jsoup.classes.*;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class JsoupExtension extends Extension {
    public static final String NAMESPACE = "ext\\jsoup\\";

    @Override
    public String getVersion() {
        return "1.8.1";
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerClass(scope, WrapJsoup.class);

        registerWrapperClass(scope, Connection.class, WrapConnection.class);
        registerWrapperClass(scope, Connection.Response.class, WrapConnectionResponse.class);
        registerWrapperClass(scope, Connection.Request.class, WrapConnectionRequest.class);
        registerWrapperClass(scope, Element.class, WrapElement.class);
        registerWrapperClass(scope, Elements.class, WrapElements.class);
        registerWrapperClass(scope, Document.class, WrapDocument.class);
    }
}
