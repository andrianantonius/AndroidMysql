<?php
	include 'koneksi.php';
	$query = "SELECT * from barang";
	$result = $con ->query($query);

	$data_barang = $result->fetch_all(MYSQLI_ASSOC);

	echo json_encode($data_barang);
?>