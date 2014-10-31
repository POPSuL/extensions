<?php
namespace ext\jsoup;

/**
 * Class Document
 * @package ext\jsoup
 */
class Document extends Element {
    /**
     * @return string
     */
    function location() { return ''; }

    /**
     * @param string $value (optional)
     * @return string
     */
    function title($value) { return ''; }

    /**
     * @return Element
     */
    function head() { }

    /**
     * @return Element
     */
    function body() { }
}