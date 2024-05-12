<?php
$id= $_GET['id'];
$sql="DELETE FROM san_pham WHERE sp_id= $id";
$query=mysqli_query($conn,$sql);
header('Location: index.php?page_layout=danhsach');
?>