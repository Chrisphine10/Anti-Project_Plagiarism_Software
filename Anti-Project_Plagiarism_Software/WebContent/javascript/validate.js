function matchpass(){
var firstpassword=document.studentsignup.password.value;
var secondpassword=document.studentsignup.password2.value;

if(firstpassword==secondpassword){
return true;
}
else{
alert("password must be same!");
return false;
}
}