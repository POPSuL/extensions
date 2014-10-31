<?php

use ext\jsoup\Jsoup;

$doc = Jsoup::connect('http://ya.ru')->get();

echo $doc->location();