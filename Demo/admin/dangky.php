<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
   
    <div class="container"> 
        <h1>Đăng ký thành viên</h1>
        <form action="xuly.php" method="post">
        <label for="txtuser">Tên tài khoản</label>
        <input type="text" placeholder="Enter Username" name="txtuser" required>

        <label for="txtpass">Mật khẩu</label>
        <input type="password" placeholder="Enter Password" name="txtpass" required>

        <label for="txtname">Họ và tên</label>
        <input type="text" placeholder="Enter Fullname" name="txtname" required>

        <label for="txtbirthday">Ngày sinh</label>
        <input type="text" placeholder="Enter Birthday" name="txtbirthday" required>

        <label for="txtsex">Giới tính</label>
        <input type="text" placeholder="Enter Sex" name="txtsex" required>

        <label for="txtemail">Email</label>
        <input type="text" placeholder="Enter Email" name="txtemail" required>

        <input type="submit" name="" value="Đăng ký" id="">
        <input type="reset" name="" id="" value="Nhập lại">
        
    </div>
    
    </form>
</body>
</html>