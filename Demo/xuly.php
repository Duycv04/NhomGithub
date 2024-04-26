<?php
 
    // Nếu không phải là sự kiện đăng ký thì không xử lý
    if (!isset($_POST['txtuser'])){
        die('');
    }
     
    //Nhúng file kết nối với database
    include('ketnoi.php');
          
    //Khai báo utf-8 để hiển thị được tiếng việt
    header('Content-Type: text/html; charset=UTF-8');
          
    //Lấy dữ liệu từ file dangky.php
    $username   = addslashes($_POST['txtuser']);
    $password   = addslashes($_POST['txtpass']);
    $fullname   = addslashes($_POST['txtname']);
    $birthday   = addslashes($_POST['txtbirthday']);
    $sex         = addslashes($_POST['txtsex']);
    $email      = addslashes($_POST['txtemail']);
          
    //Kiểm tra người dùng đã nhập liệu đầy đủ chưa
    if (!$username || !$password || !$fullname || !$birthday || !$sex || !$email)
    {
        echo "Vui lòng nhập đầy đủ thông tin. <a href='javascript: history.go(-1)'>Trở lại</a>";
        exit;
    }
          
        // Mã khóa mật khẩu
    // $password = md5($password);  
    //Kiểm tra tên đăng nhập này đã có người dùng chưa
    if (mysqli_num_rows(mysqli_query($conn,"SELECT user FROM account WHERE user='$username'")) > 0){
        echo "Tên đăng nhập này đã có người dùng. Vui lòng chọn tên đăng nhập khác. <a href='javascript: history.go(-1)'>Trở lại</a>";
        exit;
    }
          
    //Kiểm tra email có đúng định dạng hay không
    if (!filter_var($email, FILTER_VALIDATE_EMAIL))
    {
        echo "Email này không hợp lệ. Vui long nhập email khác. <a href='javascript: history.go(-1)'>Trở lại</a>";
        exit;
    }
    //Kiểm tra email đã có người dùng chưa
    // if (mysqli_num_rows(mysqli_query($conn,"SELECT email FROM sinhvien2 WHERE email='$email'")) > 0)
    // {
    //     echo "Email này đã có người dùng. Vui lòng chọn Email khác. <a href='javascript: history.go(-1)'>Trở lại</a>";
    //     exit;
    // }
    //Kiểm tra dạng nhập vào của ngày sinh
    if (!preg_match("/[0-9]{2}\/[0-9]{2}\/[0-9]{4}/", $birthday))
    {
            echo "Ngày tháng năm sinh không hợp lệ. Vui long nhập lại. <a href='javascript: history.go(-1)'>Trở lại</a>";
            exit;
        }
          
   
    $insert_sql="INSERT INTO account (user,pass,fullname,birthday,sex,email) VALUE ('{$username}','{$password}','{$fullname}','{$birthday}','{$sex}','{$email}')";
    //Thông báo quá trình lưu
    if ($conn->query($insert_sql)===true)
        // echo "Quá trình đăng ký thành công. <a href='dangnhap.php'>Đăng nhập</a>";
        header('Location: dangnhap.php');
    else
    $error_message = "Thông tin đăng ký không hợp lệ. Vui lòng kiểm tra và thử lại.";

    // Hiển thị thông báo lỗi trên trang đăng ký
    echo '<div class="error" style="color=red;">' . $error_message . '</div>';
?>