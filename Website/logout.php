<?php
session_start();
session_destroy();
session_unset();
header("Location: {$_SERVER['HTTP_REFERER']}"); 
?>