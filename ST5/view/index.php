<?php
require_once'ketnoi.php';
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>Document</title>
</head>
<body>
    <?php
    if(isset($_GET['page_layout'])){
        switch($_GET['page_layout']){
            case 'sanpham':
                require_once'sanpham.php';
                break;
            case 'themsp':
                require_once'themsp.php';
                break;
            case'xuasp':
                require_once'xuasp.php';
                break;
            case 'xoasp':
                require_once 'xoasp.php';
                break;
            default:
            require_once'sanpham.php';
            break;
        }
    }else{
    require_once 'sanpham.php';
    }
    
    ?>
</body>
</html>