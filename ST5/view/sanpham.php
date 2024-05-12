<?php
require_once'ketnoi.php';
 $sql="SELECT * FROM san_pham";
$query=mysqli_query($conn,$sql);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./style/style3.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>Danh sách sản phẩm</title>
</head>
<body>

    <div class="container1" id="container1">
       <div class="logo1"><img src="./img/Logo-ngang-01.png" alt="" width="200px" height="55px" ></div>
        <div class="nav-bar1" >
                <a href="trangchu.php">TRANG CHỦ</a>
                <a href="gioithieu.php">GIỚI THIỆU</a>
                <a href="sanpham.php">SẢN PHẨM</a>
                <a href="tintuc.php">TIN TỨC</a>
                <a href="cuahang.php">CỬA HÀNG</a>
                <a href="dangnhap.php">LOG OUT</a> 
            </div>
         </div>
    <div class="container-fluid" style="margin-top: 100px;">
        <div class="card">
            <div class="card-header">
                <h2>Danh sách sản phẩm</h2>
            </div>
            <div class="card-body">
              <table class="table">
                <thead class="thead-dark">
                    <tr>
                       <th>STT</th>
                       <th>Tên sản phẩm</th>
                       <th>Ảnh sản phẩm</th>
                       <th>Giá sản phẩm</th>
                       <th>Sô lượng</th>
                       <th>Mô tả</th>
                       <th>Danh mục</th>
                       <th>Sửa</th>
                       <th>Xóa</th>
                    </tr>
                </thead>
                <tbody>
              <?php
              $i=1;
              while($row=mysqli_fetch_assoc($query)){?>
                <tr>
                <td><?php echo $i++; ?></td>
                <td><?php echo $row['sp_name'];?></td>
                <td>
                    <img style="width: 100px;" src="img/<?php echo $row['sp_image'];?>">
                  
                </td>
                <td><?php echo $row['sp_price'];?></td>
                <td><?php echo $row['sp_quantity'];?></td>
                <td><?php echo $row['sp_description'];?></td>
                <td><?php echo $row['sp_brand'];?></td>
                <td> 
                    <a href="index.php?page_layout=xuasp&id=<?php echo $row['sp_id']; ?>">Sửa</a> 
                </td>
                <td>
                    <a onclick="return Del('<?php echo $row['sp_name']; ?>')" href="index.php?page_layout=xoasp&id=<?php echo $row['sp_id']; ?>">Xóa</a> 
                </td>
             </tr>
             <?php }?>
                </tbody>
              </table>
                <a class="btn btn-primary" href="index.php?page_layout=themsp">Thêm sản phẩm</a>
            </div>
        </div>
    </div>
    <script>
        function Del(name){
            return confirm("Bạn cóa muốn xóa sản phẩm:"+name+"?")
        }
    </script>
</body>
</html>
