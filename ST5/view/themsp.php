<?php 
include('ketnoi.php');
if(isset($_POST['sbm'])){
   $sp_name=$_POST['sp_name'];

    $sp_image=$_FILES['sp_image']['name'];
    $image=$_FILES['sp_image']['tmp_name'];

    $sp_price=$_POST['sp_price'];

    $sp_quanity=$_POST['sp_quantity'];

    $sp_description=$_POST['sp_description'];

    $sp_brand=$_POST['sp_brand'];
    $insert_sql ="INSERT INTO san_pham(sp_name,sp_image,sp_price,sp_quantity,sp_description,sp_brand) VALUES ('$sp_name','$sp_image',$sp_price,$sp_quanity,'$sp_description','$sp_brand')";
  $query =mysqli_query($conn,$insert_sql);
  move_uploaded_file($image,'img/'.$sp_image);
  header('Location: index.php?page_layout=sanpham');
}
?>



<div class="container-fluid">
    <div class="card">
        <div class="card-header">
            <h2>Thêm sản phẩm</h2>
        </div>
        <div class="card-body">
           <form method="POST" enctype="multipart/form-data" >
            <div class="form-group ">
              <label for="">Tên sản phẩm</label>
              <input type="text" name="sp_name" id="" class="form-control" required>
            </div>

            <div class="form-group">
              <label for="">Ảnh sản phẩm</label>
              <input type="file" name="sp_image" > 
            </div>

            <div class="form-group">
              <label for="">Giá sản phẩm</label>
              <input type="text" name="sp_price" id="" class="form-control" required>
            </div>

            <div class="form-group">
              <label for="">Số lượng</label>
              <input type="text" name="sp_quantity" id="" class="form-control" required>
            </div>

            <div class="form-group">
              <label for="">Mô tả sản phẩm </label>
              <input type="text" name="sp_description" id="" class="form-control" required>
            </div>

                <div class="form-group">
                  <label for="">Danh mục</label>
                 <select class="form-control" name="sp_brand" id="">
                    <option>Kem</option>
                    <option>Trà sữa</option>
                    <option >Cà phê</option>
                    <option >Trà hoa quả</option>
                    <option >Trà thảo mộc</option>
                    <option >Combo trà sữa</option>
                 </select>
                </div>
                <button name="sbm" class="btn btn-success" type="submit">Thêm</button>
           </form>
        </div>
    </div>
</div>

