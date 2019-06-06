
//2
document.getElementById("click").addEventListener("click", function (event) {
    alert("Olá")   
    });

//3
document.getElementById("fundo").addEventListener("click", function (event) {
    let corpo = document.querySelector("body")
            if(corpo.style.background == "orange"){
                corpo.style.background = "none";
            } else{
            corpo.style.background = "orange";
            }

    });

//4
document.getElementById("jesus").addEventListener("mouseover", function () {
    alert("Estou de olho em você");
});

//5
document.getElementById("cliqueAqui").addEventListener("click", function (event) {
    alert("Você perdeu, clicou em mim");
    });

//6
function alterarFundo() {
    this.style.backgroundColor = "red";
}

document.body.addEventListener("click", alterarFundo );

//7
document.body.removeEventListener("click", alterarFundo );

//8
// document.querySelector("form").addEventListener("click", function (event) {
//     event.preventDefault();
//     alert("Não é possivel enviar");
// });

//////////Formularios/////////


let validacao = document.querySelector("form");
validacao.onsubmit = function () {
    if (validacao.nome.value == "") {
        alert("Preencha o campo nome!");
        return false
    }
    if (validacao.s_nome.value == "") {
        alert("Preencha o campo sobre nome!");
        return false
    }
    if (validacao.senha.value == "") {
        alert("Digite sua senha");
        return false
    }
    if (validacao.conf_senha.value == "") {
        alert("Digite a confirmação da senha");
        return false
    }
    if (validacao.senha.value !== validacao.conf_senha.value) {
        alert("Senhas não conferem!");
        return false
    }
    
};


















// //    if(inputTxt.style.display == "none"){
// //     inputTxt.style.display = "inline";
// //    } else{
// //    inputTxt.style.display = "none";
// //    }
// }
// inputTxt.onkeydown = function(event)  {
//     let keycode = event.keyCode;
//     if(keycode == 13){
//         alert("Teclei!!!!!");
//     }
// }

// 

// document.querySelector("body").addEventListener("keypress", function(event){
//     let tecla = event.keyCode;
//     if (tecla == 13) {
//         alert("Você clicou Enter!")        
//     }
// });

// document.querySelector("#click").addEventListener("click", function () {
//     setTimeout(function () {
//        alert("Obrigado por esperar 10 segundos!") 
//     }, 10000);
// });

