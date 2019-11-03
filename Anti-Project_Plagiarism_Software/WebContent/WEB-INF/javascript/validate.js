function matchpass(){
var firstpassword=document.signup.password.value;
var secondpassword=document.signup.password2.value;

if(firstpassword==secondpassword){
return true;
}
else{
alert("password must be same!");
return false;
}
}