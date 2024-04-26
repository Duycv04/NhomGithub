<?php
//Khai báo sử dụng session
session_start();
 
//Khai báo utf-8 để hiển thị được tiếng việt
header('Content-Type: text/html; charset=UTF-8');
 
//Xử lý đăng nhập
if (isset($_POST['dangnhap'])) 
{
    //Kết nối tới database
    include('ketnoi.php');
     
    //Lấy dữ liệu nhập vào
    $username = addslashes($_POST['txtuser']);
    $password = addslashes($_POST['txtpass']);
     
    //Kiểm tra đã nhập đủ tên đăng nhập với mật khẩu chưa
    if (!$username || !$password) {
        echo "Vui lòng nhập đầy đủ tên đăng nhập và mật khẩu. <a href='javascript: history.go(-1)'>Trở lại</a>";
        exit;
    }
     
    // mã hóa pasword
    // $password = md5($password);
     
    //Kiểm tra tên đăng nhập có tồn tại không
    $query = mysqli_query($conn,"SELECT user, pass FROM account WHERE user='$username'");
    if (mysqli_num_rows($query) == 0) {
        echo "Tên đăng nhập này không tồn tại. Vui lòng kiểm tra lại. <a href='javascript: history.go(-1)'>Trở lại</a>";
        exit;
    }
     
    //Lấy mật khẩu trong database ra
    $row = mysqli_fetch_array($query);
     
    //So sánh 2 mật khẩu có trùng khớp hay không
    if ($password != $row['pass']) {
        echo "Mật khẩu không đúng. Vui lòng nhập lại. <a href='javascript: history.go(-1)'>Trở lại</a>";
        exit;
    }
     
    //Lưu tên đăng nhập
    $_SESSION['user'] = $username;
    header('Location: trangchu.php');
    die();
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./style/style.css">
    <title>Document</title>
</head>
<body>
<div class="container1" style="margin-top: 200px;">
        <h1>Đăng nhập</h1>
        <form action="dangnhap.php?do=Login" method="post">
              <label for="txtuser"><b>Username</b></label>
              <input type="text" placeholder="Enter Username" name="txtuser" required>
              <label for="txtpass"><b>Password</b></label>
              <input type="password" placeholder="Enter Password" name="txtpass" required>
             <input type="submit" name="dangnhap" id="" value="Đăng nhập">
              <a href="dangky.php">Đăng ký tài khoản</a>
              </form>
            </div>
        </div>
  </div>
  <img src="./" alt="">
</body>
</html>