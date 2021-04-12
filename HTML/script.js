
function identifier(coteA,coteB,coteC){
    
    if(coteA.value == coteB.value && coteB.value == coteC.value){
        document.getElementById("form_id").action = "index2.html";
        
    }
    else if( coteA.value == coteB.value || coteA.value == coteC.value || coteC.value == coteB.value ){
        document.getElementById("form_id").action = "index3.html";
    }
    else{
        document.getElementById("form_id").action = "index4.html";
    }
}
