<?php
$onoroff = $_GET["state"]; // Declares the request from index.html as a variable
$textfile = "index.txt"; // Declares the name and location of the .txt file

$fileLocation = "$textfile";
$fh = fopen($fileLocation, 'w	') or die("Something went wrong!"); // Opens up the .txt file for writing and replaces any previous content
$stringToWrite = "$onoroff"; // Write either 0 or 1 or 2 depending on request from index.html
fwrite($fh, $stringToWrite); // Writes it to the .txt file
fclose($fh); 

header("Location: index.html"); // Return to frontend (index.html)
?>