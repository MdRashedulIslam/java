
<?php
$con=mysqli_connect("localhost","root","");
$select=mysqli_select_db($con,"student");
$search=$_POST['search'];
$sql="SELECT name,mobile FROM s1 WHERE CONCAT('name','mobile')LIKE'%".$search."%'";
$result=mysqli_query($con,$sql);
?>  
<style>
table,tr,th,td
{
	border:1px solid gray;
	height:35px;
	width:100px;
	text-align:center;
}
</style> 
<table>
<tr>
  <th>name</th>
  <th>mobile</th>
</tr>
<?php 
{
	echo"<tr>";
	echo"<td>";
	echo$search;
	echo"</td>";
	echo"</tr>";
}
?>
