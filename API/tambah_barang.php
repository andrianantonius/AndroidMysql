<?php
include "keneksi.php"
$NamaBarang = $_POST['nama_barang'];
$stok = $_POST['stok'];
$deskripsi = $_POST['deskripsi'];
$sql = mysql_query($con, "INSERT INTO barang (nama_barang, stok, deskripsi) VALUES ('$namaBarang', '$stok', '$deskripsi')");
if ($sql) {
	echo json_encode($sql);
}
?>