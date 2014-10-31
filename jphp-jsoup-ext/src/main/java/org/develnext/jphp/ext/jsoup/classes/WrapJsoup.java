package org.develnext.jphp.ext.jsoup.classes;

import org.develnext.jphp.ext.jsoup.JsoupExtension;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static php.runtime.annotation.Reflection.Name;
import static php.runtime.annotation.Reflection.Signature;

@Name(JsoupExtension.NAMESPACE + "Jsoup")
final public class WrapJsoup extends BaseObject {
    public WrapJsoup(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    private Memory __construct(Environment env, Memory... args) {
        return Memory.NULL;
    }

    @Signature
    public static Connection connect(String url) {
        return Jsoup.connect(url);
    }

    @Signature
    public static Document parse(InputStream stream, String charset, String baseUri) throws IOException {
        return Jsoup.parse(stream, charset, baseUri);
    }

    @Signature
    public static Document parseUrl(URL url, int timeout) throws IOException {
        return Jsoup.parse(url, timeout);
    }

    @Signature
    public static Document parseHtml(String html, String baseUri) throws IOException {
        return Jsoup.parse(html, baseUri);
    }

    @Signature
    public static Document parseBodyFragment(String html) throws IOException {
        return Jsoup.parseBodyFragment(html);
    }

    @Signature
    public static Document parseBodyFragment(String html, String baseUri) throws IOException {
        return Jsoup.parseBodyFragment(html, baseUri);
    }

    @Signature
    public static Document parseFile(File file, String charset) throws IOException {
        return Jsoup.parse(file, charset);
    }

    @Signature
    public static Document parseFile(File file, String charset, String baseUri) throws IOException {
        return Jsoup.parse(file, charset, baseUri);
    }
}
