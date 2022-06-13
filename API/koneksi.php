<?php
	$con = new mysqli ("localhost","root","","TOKO1922500215");

	if ($con -> connect_errno) {
		echo "Failed to connect to MySQL:".$con -> connect_error; 
		exit();
	}
	?>
	