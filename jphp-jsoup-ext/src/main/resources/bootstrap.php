<?php

use ext\jsoup\Jsoup;

$doc = Jsoup::parseUrl('http://ya.ru/', 5000);

echo $doc->select();