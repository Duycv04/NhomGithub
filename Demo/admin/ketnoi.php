<?php
// $conn =mysqli_connect("localhost","root","123456","sinhvien2");
// if ($conn->connect_error) {
//     die("Connection failed: " . $conn->connect_error);
// }
$servername = "localhost"; 
$username = "root"; 
$password = "123456"; 
$dbname = "sinhvien2"; 

$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}


// Return name of current default database
// if ($result = $mysqli -> query("SELECT DATABASE()")) {
//   $row = $result -> fetch_row();
//   echo "Default database is " . $row[0];
//   $result -> close();
// }
// 
// Change db to "test" db
// $mysqli -> select_db("sinhvien2");

// Return name of current default database
// if ($result = $mysqli -> query("SELECT DATABASE()")) {
//   $row = $result -> fetch_row();
//   echo "Default database is " . $row[0];
//   $result -> close();
// }

// $mysqli -> close();
?>