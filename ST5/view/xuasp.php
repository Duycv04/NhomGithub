<?php 
include('ketnoi.php');
$id=$_GET['id'];

$sql_up="SELECT * FROM san_pham WHERE sp_id = $id";
$query_up=mysqli_query($conn,$sql_up);
$row_up=mysqli_fetch_assoc($query_up);


if(isset($_POST['sbm'])){
   $sp_name=$_POST['sp_name'];

    if($_FILES['sp_image']['name']==''){
          $sp_image=$row_up['sp_image'];
    }else{
        $sp_image=$_FILES['sp_image']['name'];
        $image_tmp=$_FILES['sp_image']['tmp_name'];
        move_uploaded_file($image_tmp,'img/'.$sp_image);
    }
    $sp_price=$_POST['sp_price'];
    $sp_quantity=$_POST['sp_quantity'];
    $sp_description=$_POST['sp_description'];
    $sp_brand=$_POST['sp_brand'];

    $sql ="UPDATE san_pham SET sp_name='$sp_name',sp_image='$sp_image',sp_price=$sp_price,sp_quantity=$sp_quantity,sp_description='$sp_description',sp_brand='$sp_brand' WHERE sp_id=$id";
    // $query =mysqli_query($conn,$sql_up);
    if($conn->query($sql)===true){
       header('Location: index.php?page_layout=sanpham');
    }else {
      echo "Lỗi: " . $sql . "<br>" . $conn->error;
  }
 
}
?>



<div class="container-fluid">
    <div class="card">
        <div class="card-header">
            <h2>Sửa sản phẩm</h2>
        </div>
        <div class="card-body">
           <form method="POST" enctype="multipart/form-data" >
            <div class="form-group ">
              <label for="">Tên sản phẩm</label>
              <input type="text" name="sp_name" id="" class="form-control" required value="<?php echo $row_up['sp_name']; ?>">
            </div>

            <div class="form-group">
              <label for="">Ảnh sản phẩm</label>
              <input type="file" name="sp_image" > 
            </div>

            <div class="form-group">
              <label for="">Giá sản phẩm</label>
              <input type="text" name="sp_price" id="" class="form-control" required value="<?php echo $row_up['sp_price']; ?>" >
            </div>

            <div class="form-group">
              <label for="">Số lượng</label>
              <input type="text" name="sp_quantity" id="" class="form-control" required value="<?php echo $row_up['sp_quantity']; ?>"> 
            </div>

            <div class="form-group">
              <label for="">Mô tả sản phẩm </label>
              <input type="text" name="sp_description" id="" class="form-control" required value="<?php echo $row_up['sp_description']; ?>">
            </div>

                <div class="form-group">
                  <label for="">Danh mục</label>
                 <select class="form-control" name="sp_brand" id="" >
                    <option>Kem</option>
                    <option>Trà sữa</option>
                    <option >Cà phê</option>
                    <option >Trà hoa quả</option>
                    <option >Trà thảo mộc</option>
                    <option >Combo trà sữa</option>
                 </select>
                </div>
                <button name="sbm" class="btn btn-success" type="submit">Sửa</button>
           </form>
        </div>
    </div>
</div>

