<html>
<?php
$con=mysqli_connect('localhost','root','');
if(!$con)
{
	echo"not connected";
}
$select=mysqli_select_db($con,"man");
$n=$_POST['name'];
$sql="INSERT INTO y(name)VALUES('$n')";
$result=mysqli_query($con,$sql);
if(!$result)
{
	echo"not insert";
}
?>
<style>
th
{
border:1px solid gray;
height:35px;
width:200px;
background:#fff;
text-align:center;
}
td
{
	height:35px;
	width:200px;
	text-align:center;
}
</style>
<div class="table">
<table>
<tr>
<th>name</th>
</tr>
</table>
<?php
$r="SELECT name FROM y";
$result=mysqli_query($con,$r);
while($row=mysqli_fetch_array($result))
{
	echo"<tr>";
	echo"<td>";
	echo $row['name'];
	echo"</td>";
	echo"</tr>";
}
?>
</html>