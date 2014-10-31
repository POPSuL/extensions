<?php
namespace ext\jsoup;

/**
 * Class Jsoup
 * @package ext\jsoup
 */
final class Jsoup {
    private function __construct() { }

    /**
     * @param string $url
     * @return Connection
     */
    public static function connect($url) { return new Connection(); }

    /**
     * @param php\io\File|php\io\Stream|string $source
     * @param string $charset
     * @param string $baseUri
     * @return Document
     */
    public static function parse($source, $charset, $baseUri) { return new Document(); }

    /**
     * @param string $html
     * @param string $baseUri
     * @return Document
     */
    public static function parseHtml($html, $baseUri) { return new Document(); }

    /**
     * @param string $url
     * @param int $timeout in millis
     * @return Document
     */
    public static function parseUrl($url, $timeout) { return new Document(); }
}