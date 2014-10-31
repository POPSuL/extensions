<?php
namespace ext\jsoup;

/**
 * Class Element
 * @package ext\jsoup
 */
class Element {
    /**
     * @param string $html (optional)
     * @return string
     */
    function html($html) { return ''; }

    /**
     * @param string $text (optional)
     * @return string
     */
    function text($text) { return ''; }

    /**
     * @return string
     */
    function nodeName() { return ''; }

    /**
     * @param string $tagName (optional)
     * @return string
     */
    function tagName($tagName) { return ''; }

    /**
     * @return bool
     */
    function isBlock() { return false; }

    /**
     * @return string
     */
    function id() { return ''; }

    /**
     * @param $attributeKey
     * @param $attributeValue
     * @return $this
     */
    function attr($attributeKey, $attributeValue) { }

    /**
     * @return array
     */
    function dataset() { return []; }

    /**
     * @return Element
     */
    function parent() { }

    /**
     * @return Elements
     */
    function parents() { }

    /**
     * @param int $index
     * @return Element
     */
    function child($index) { }

    /**
     * @return Elements
     */
    function children() { }

    /**
     * @param string $cssQuery
     * @return Elements
     */
    function select($cssQuery) { }
}