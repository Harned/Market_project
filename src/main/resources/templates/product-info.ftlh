<!DOCTYPE html>
<html>
<head>
    <title>Market</title>
</head>
<body>
<h1>Market</h1><hr>
<h4>Подробная информация о товаре</h4>
<#list images as img>
    <img src="/images/${img.id}" height="60px"/><br><br>
</#list>
<b>Название товара: </b>${product.title}<br>
<b>Описание: </b>${product.description}<br>
<b>Цена: </b>${product.price}<br>
<b>Город: </b>${product.location}<br>
<b>Продавец: </b>${product.user.name}<br>
<b>Номер телефона: </b>${product.user.phone}<br>
</body>
</html>
